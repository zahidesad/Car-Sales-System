package JPA_Classes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author zahid
 */
public class Test {

    public static void main(String[] args) {
        addObject();
//        addSales();
//        querySales();
//        updateCar();
//        updateSales();
//        removeSales();
//        removeCar();
    }

    public static void addObject() {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("CarSales");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        Admin admin = new Admin("Zahid", "admin", "Admin123$",
                "zahid.bltci@gmail.com", 536066656);

        //Default dealer accounts
        Dealer dealer1 = new Dealer("Emirhan", "emirhan", "Emirhan123$",
                "emirhan.soylu@gmail.com", 506364055);
        Dealer dealer2 = new Dealer("Meryem", "meryem", "Meryem123$",
                "meryem.kilic@gmail.com", 551136562);
        Dealer dealer3 = new Dealer("Ahmet", "ahmet", "Ahmet123$",
                "ahmet@gmail.com", 123123123);
        Dealer dealer4 = new Dealer("Mehmet", "mehmet", "Mehmet123$",
                "mehmet@gmail.com", 123123124);

        //Default customer accounts
        Customer customer1 = new Customer("Sare", "sare", "Sare123$",
                "rumeysasare.bayram@gmail.com", 542592313);
        Customer customer2 = new Customer("Asım", "asim", "Asim123$",
                "asimtarik.kutluer@gmail.com", 507000813);
        Customer customer3 = new Customer("Ayşe", "ayşe", "Ayşe123$",
                "ayşe@gmail.com", 1231231235);
        Customer customer4 = new Customer("Fatma", "fatma", "Fatma123$",
                "fatma@gmail.com", 1231231236);
        //Default cars
        Cars car1 = new Cars("Togg", "T10X", "Red", "SUV", "Electric", 2023, 500000);
        Cars car2 = new Cars("BMW", "5.20", "Black", "Sedan", "Diesel", 2022, 700000);
        Cars car3 = new Cars("Audi", "A8", "Black", "Sedan", "Petrol", 2018, 900000);
        Cars car4 = new Cars("Wolkswagen", "Tiguan", "Grey", "SUV", "Diesel", 2019, 800000);
        Cars car5 = new Cars("Mercedes", "AMG", "White", "Sedan", "Petrol", 2016, 400000);

        em.persist(admin);

        em.persist(dealer1);
        em.persist(dealer2);
        em.persist(dealer3);
        em.persist(dealer4);

        em.persist(customer1);
        em.persist(customer2);

        em.persist(car1);
        em.persist(car2);
        em.persist(car3);
        em.persist(car4);
        em.persist(car5);
        em.getTransaction().commit();
    }

    public static void addSales() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("CarSales");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        Cars car1 = em.find(Cars.class, 1651);
        Dealer dealer1 = em.find(Dealer.class, 1406);
        Customer customer1 = null;
        Customer customer2 = em.find(Customer.class, 1404);
        Customer customer3 = em.createNamedQuery("Users.findAllCustomers", Customer.class).getResultList().get(0);

        Sales sale1 = new Sales(car1, dealer1, customer1, Sales.AVAILABLE);
        Sales sale2 = new Sales(car1, dealer1, customer1, Sales.PENDING);

//        em.persist(car1);
//        em.persist(dealer1);
//        em.persist(customer1);
//        em.persist(customer2);
//        em.persist(customer3);
        em.persist(sale1);
//        em.persist(sale2);

        em.getTransaction().commit();

    }

    public static void querySales() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("CarSales");
        EntityManager em = emf.createEntityManager();

        Sales sale1 = em.createNamedQuery("Sales.findAll", Sales.class).getResultList().get(0);

        System.out.println(sale1.toString());
        Dealer dealer1 = sale1.getDealerId();
        System.out.println(dealer1.toString());

        Dealer dealer2 = em.createNamedQuery("Users.findByName", Dealer.class).setParameter("name", "Emirhan").getSingleResult();
        System.out.println(dealer2.getSalesList().get(0));

        Customer customer1 = em.createNamedQuery("Users.findByName", Customer.class).setParameter("name", "Asım").getResultList().get(0);
        System.out.println(customer1.getSalesList().get(0));

    }

    public static void updateSales() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("CarSales");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        Sales sale1 = em.createNamedQuery("Sales.findAll", Sales.class).getResultList().get(0);
        sale1.setStatus(Sales.PENDING);

        em.persist(sale1);
        em.getTransaction().commit();
    }

    public static void updateCar() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("CarSales");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        // Cars car1 = em.createNamedQuery("S")
        //em.persist(car1);
        em.getTransaction().commit();

    }

    public static void removeSales() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("CarSales");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        Dealer dealer2 = em.createNamedQuery("Users.findByName", Dealer.class).setParameter("name", "Emirhan").getSingleResult();
        Sales sale1 = em.createNamedQuery("Sales.findAll", Sales.class).getResultList().get(0);

        //em.remove(dealer2.getSalesList().get(0));
        em.remove(sale1);
        em.getTransaction().commit();

    }

    public static void removeCar() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("CarSales");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        Cars car1 = em.find(Cars.class, 952);

        em.remove(car1);
        em.getTransaction().commit();

    }

}
