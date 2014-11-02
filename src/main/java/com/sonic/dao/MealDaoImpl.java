package com.sonic.dao;

import com.sonic.models.Meal;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

/**
 * Created by sadra on 11/1/14.
 */
@Repository
public class MealDaoImpl implements MealDao {


    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void save(Meal meal) {
        Session session = this.sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        session.persist(meal);
        tx.commit();
        session.close();
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Meal> listByCustomer(int customerId) {
        Session session = this.sessionFactory.openSession();

        Query query = session.createQuery("FROM Meal WHERE customer_id = :customerId");
        query.setParameter("customerId", customerId);

        List<Meal> customerMealList = query.list();

        session.close();
        return customerMealList;
    }

}
