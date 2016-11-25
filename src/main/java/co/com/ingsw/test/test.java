package co.com.ingsw.test;

import co.com.ingsw.entity.User;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceUnit;

public class test {

//    Este método solo funciona si se usa java EE
//    @PersistenceContext(unitName = "postgresql_db") 
    private static EntityManager em;
//    Este método solo funciona si se usa java EE
//    @PersistenceUnit(unitName = "postgresql_db")
    private static EntityManagerFactory emf;

    public static void main(String[] args) {
//        Se crea el gestor de persistencia(EM), funciona en cualquier edición
//        de java, desde que tenga las dependencia para javax.persistence-api
        emf = Persistence.createEntityManagerFactory("postgresql_db");
        em = emf.createEntityManager();
        User u = new User();
        u.setUserName("Paco");
        u.setPasswordName("1234");

//        @SuppressWarnings("JPQLValidation")
//        List<User> users = (List<User>)em.createQuery("FROM User").getResultList();
//        System.out.println("En esta base de datos hay " + users.size() + " empleados");
    }
}
