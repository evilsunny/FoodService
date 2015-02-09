package com.dinidesign;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;

/**
 * Created by alina on 08.02.15.
 */
public class TestJPA {

    public static void main(String[]args){
        String UNIT_NAME = "NewPersistenceUnit";
        EntityManagerFactory factory;
        factory = Persistence.createEntityManagerFactory(UNIT_NAME);
        EntityManager em = factory.createEntityManager();
        Users v1 = new Users("kolya","moskow",30);
        Users v2 = new Users("masha","dnepr",20);



        em.getTransaction().begin();
        em.persist(v1);
        em.persist(v2);


     //System.out.println(em.find(User.class,1));
//        v1.setSalary(10000);
//        em.merge(em.find(Vacancy.class, 1));
//        System.out.println(em.find(Vacancy.class, 1));
//      em.remove(em.find(Vacancy.class,1));
        em.getTransaction().commit();

        TypedQuery<Users> query =  em.createQuery("SELECT p FROM Users p ",Users.class);

        List<Users> list = null;

        try {
            list = query.getResultList();
        }finally {
            em.close();
            factory.close();
        }

        for (Users p : list){
            System.out.println(p);
        }



    }

}
