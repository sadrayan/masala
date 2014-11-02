package com.sonic.dao;

import com.sonic.models.Customer;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by sadra on 10/30/14.
 */
@Repository
public interface CustomerDao {

    public void save (Customer customer);

    public List <Customer> list();
}
