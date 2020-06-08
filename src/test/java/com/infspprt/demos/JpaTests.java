package com.infspprt.demos;

import com.nfspprt.domain.Cursist;
import org.junit.jupiter.api.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import static org.assertj.core.api.Assertions.assertThat;

public class JpaTests {

    @Test
    void createAConnection() {
        String pu = "moviedbPu";
        EntityManagerFactory ef = Persistence.createEntityManagerFactory(pu);
        EntityManager em = ef.createEntityManager();
        assertThat(em).isNotNull();
    }

    @Test
    void createANewCursist() {
        String pu = "moviedbPu";
        EntityManagerFactory ef = Persistence.createEntityManagerFactory(pu);
        EntityManager em = ef.createEntityManager();
        em.getTransaction().begin();
        em.persist(new Cursist("John"));
        em.getTransaction().commit();
    }
}
