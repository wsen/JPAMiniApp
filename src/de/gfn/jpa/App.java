package de.gfn.jpa;

import de.gfn.jpa.entity.Scout;
import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import static org.eclipse.persistence.sessions.SessionProfiler.Transaction;

/**
 *
 * @author tlubowiecki
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPAMiniAppPU");
        EntityManager em = emf.createEntityManager();
        
//        Scout s = new Scout();
//        s.setFirstname("Peter");
//        s.setLastname("Parker");
//        s.setBirthdate(new Date());

        em.getTransaction().begin();
//        em.persist(s);
        
        Scout s = em.find(Scout.class, 1L);
        s.setFirstname("Bob");
//        System.out.println(s);
        
        em.getTransaction().commit();
        em.close();
    }
    
}
