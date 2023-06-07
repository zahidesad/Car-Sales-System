package JPA_Classes;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author zahid
 */
public class Database {

    public static Users loginVerification(String username, String password) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("CarSales");
        EntityManager em = emf.createEntityManager();

        try {
            Users user = em.createQuery("SELECT u FROM Users u WHERE u.username ="
                    + " :username AND u.password = :password", Users.class)
                    .setParameter("username", username).setParameter("password", password).getSingleResult();
            em.close();
            emf.close();
            return user;

        } catch (NoResultException exception) {
            em.close();
            emf.close();
            return null;
        }

    }

    public static boolean checkUsername(String username) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("CarSales");
        EntityManager em = emf.createEntityManager();

        Query query = em.createQuery("SELECT COUNT(u) FROM Users u WHERE u.username = :username");
        query.setParameter("username", username);
        Long count = (Long) query.getSingleResult();

        em.close();
        emf.close();
        return count != 0;
    }

    public static void saveUser(Users user) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("CarSales");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        em.persist(user);
        em.getTransaction().commit();
        em.close();
        emf.close();

    }

    public static List<Users> getUsers() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("CarSales");
        EntityManager em = emf.createEntityManager();

        List<Users> users = em.createNamedQuery("Users.findAll", Users.class).getResultList();

        em.close();
        emf.close();

        return users;
    }

    public static List<Cars> getCars() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("CarSales");
        EntityManager em = emf.createEntityManager();

        List<Cars> cars = em.createNamedQuery("Cars.findAll", Cars.class).getResultList();
        em.close();
        emf.close();

        return cars;
    }

    public static List<Sales> getSales() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("CarSales");
        EntityManager em = emf.createEntityManager();

        List<Sales> sales = em.createNamedQuery("Sales.findAll", Sales.class).getResultList();
        em.close();
        emf.close();

        return sales;
    }

    public static Users findUserByID(Integer id) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("CarSales");
        EntityManager em = emf.createEntityManager();

        Users user = em.find(Users.class, id);

        em.close();
        emf.close();

        return user;
    }

    public static Sales findSaleByID(Integer id) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("CarSales");
        EntityManager em = emf.createEntityManager();

        Sales sale = em.find(Sales.class, id);

        em.close();
        emf.close();

        return sale;
    }

    public static Cars findCarsBySaleID(Integer id) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("CarSales");
        EntityManager em = emf.createEntityManager();

        Sales sale = em.find(Sales.class, id);
        Cars car = sale.getCarId();

        em.close();
        emf.close();

        return car;

    }

    public static void deleteCustomer(Integer customerID) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("CarSales");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        Customer customer = em.find(Customer.class, customerID);
        for (Sales sale : customer.getSalesList()) {
            sale.setCustomerId(null);
            if (!sale.getStatus().equals(Sales.ACCEPTED)) {
                sale.setStatus(Sales.AVAILABLE);

            }
            em.persist(sale);
        }
        em.remove(customer);
        em.getTransaction().commit();
        em.close();
        emf.close();

    }

    public static void deleteDealer(Integer dealerId) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("CarSales");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        Dealer dealer = em.find(Dealer.class, dealerId);

        for (Sales sale : dealer.getSalesList()) {
            sale.setDealerId(null);
            em.persist(sale);
            if (sale.getStatus().equals(Sales.ACCEPTED) || sale.getStatus().equals(Sales.DENIED)) {
                continue;
            }
            em.remove(sale.getCarId());
        }
        em.remove(dealer);
        em.getTransaction().commit();
        em.close();
        emf.close();

    }

    public static void removeCar(Integer salesId) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("CarSales");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        Sales sale = em.find(Sales.class, salesId);
        ArrayList<Sales> deniedSales = new ArrayList<>();
        for (Sales sale1 : Database.getSales()) { //Customer'ın araç kaldırılsa dahi denied arabasını görebilmesi için
            if (sale1.getCarId().equals(sale.getCarId()) && sale1.getStatus().equals(Sales.DENIED)) {
                sale1.setCarId(null);
                deniedSales.add(sale1);
            }
        }

        for (Sales deniedSale : deniedSales) {
            Sales dbSales = em.find(Sales.class, deniedSale.getId());
            dbSales.setCarId(null);
            em.persist(dbSales);
        }

        em.getTransaction().commit();
        em.getTransaction().begin();
        em.remove(sale.getCarId());
        em.getTransaction().commit();
        em.close();
        emf.close();
    }

    public static List<Sales> showDealerSales(Integer dealerID) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("CarSales");
        EntityManager em = emf.createEntityManager();

        Query query = em.createQuery("SELECT s FROM Sales s WHERE s.dealerId.id = :dealerId", Sales.class);
        query.setParameter("dealerId", dealerID);

        List<Sales> sales = query.getResultList();

        em.close();
        emf.close();

        return sales;
    }

    public static int buyCar(Integer saleID, Customer customer) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("CarSales");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        Sales sale = em.find(Sales.class, saleID);

        Query query = em.createQuery("SELECT s FROM Sales s WHERE s.carId = :carId AND s.customerId = :customerId AND s.status = :status", Sales.class);
        query.setParameter("carId", sale.getCarId());
        query.setParameter("customerId", sale.getCustomerId());
        query.setParameter("status", Sales.DENIED);

        List<Sales> sales = query.getResultList();

        for (Sales sale1 : sales) {  //Eğer araba daha önce denied statüsüne düştüyse bir daha satın alınma isteği gönderilmesin diye kontrol.
            if (customer.getSalesList().contains(sale1)) {
                em.close();
                emf.close();
                return -1;
            }
        }

        sale.setCustomerId(customer);
        sale.setStatus(Sales.PENDING);
        sale.getCustomerId().getSalesList().add(sale);

        em.persist(sale);
        em.getTransaction().commit();
        em.close();
        emf.close();

        return 1;
    }

    public static void updatePassword(int userId, String password) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("CarSales");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        Users user = em.find(Users.class, userId);
        user.setPassword(password);

        em.persist(user);
        em.getTransaction().commit();
        em.close();
        emf.close();
    }

    public static void updateInformation(int userID, String name, String username, int phoneNo, String email) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("CarSales");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        Users user = em.find(Users.class, userID);
        user.setName(name);
        user.setUsername(username);
        user.setPhone(phoneNo);
        user.setEmail(email);

        em.persist(user);
        em.getTransaction().commit();
        em.close();
        emf.close();

    }

    public static void cancelOrder(int saleID) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("CarSales");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        Sales sale = em.find(Sales.class, saleID);
        sale.setStatus(Sales.AVAILABLE);
        sale.setCustomerId(null);

        em.persist(sale);
        em.getTransaction().commit();
        em.close();
        emf.close();
    }

    public static void addCar(Cars car) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("CarSales");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        em.persist(car);
        em.getTransaction().commit();
        em.close();
        emf.close();

    }

    public static void updateCar(int saleId, String brand, String model, String color, String type, String fuel, Integer age, Integer price) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("CarSales");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        Sales sale = em.find(Sales.class, saleId);

        sale.getCarId().setBrand(brand);
        sale.getCarId().setModel(model);
        sale.getCarId().setColor(color);
        sale.getCarId().setType(type);
        sale.getCarId().setFuel(fuel);
        sale.getCarId().setAge(age);
        sale.getCarId().setPrice(price);

        em.persist(sale);
        em.getTransaction().commit();
        em.close();
        emf.close();

    }

    public static void addSales(Cars car, Dealer dealer, Customer customer, String status) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("CarSales");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        Cars databaseCars = em.find(Cars.class, car.getId());

        Sales sale = new Sales(databaseCars, dealer, customer, status);
        dealer.getSalesList().add(sale);

        em.persist(sale);
        em.getTransaction().commit();
        em.close();
        emf.close();

    }

    public static void acceptRequest(int saleID) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("CarSales");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        Sales sale = em.find(Sales.class, saleID);
        sale.setStatus(Sales.ACCEPTED);

        em.persist(sale);
        em.getTransaction().commit();
        em.close();
        emf.close();

    }

    public static void denyRequest(int saleID) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("CarSales");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        Sales sale = em.find(Sales.class, saleID);
        sale.setStatus(Sales.AVAILABLE);

        Sales deniedSale = new Sales(sale.getCarId(), sale.getDealerId(), sale.getCustomerId(), Sales.DENIED);

        em.persist(sale);
        em.persist(deniedSale);
        em.getTransaction().commit();
        em.close();
        emf.close();

    }

}
