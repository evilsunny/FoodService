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
        //Foods v1 = new Foods("potato",12,13,14,123,"garnir");
        Users user = new Users("BlackCat","666");
        Users_info us = new Users_info(user,"Kyiv",60,170);




        em.getTransaction().begin();
        em.persist(user);
        em.persist(us);
     //   em.persist(v2);


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
