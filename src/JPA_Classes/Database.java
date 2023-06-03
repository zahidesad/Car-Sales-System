package JPA_Classes;

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
            sale.setStatus(Sales.AVAILABLE);
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
        
        if (sales.size() > 0) {
            em.close();
            emf.close();
            return -1;
        }
        sale.setCustomerId(customer);
        sale.setStatus(Sales.PENDING);
        
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
    
    public static void updateInformation(Users user) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("CarSales");
        EntityManager em = emf.createEntityManager();
        
        em.getTransaction().begin();
        
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
    
}
