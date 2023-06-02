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

}
