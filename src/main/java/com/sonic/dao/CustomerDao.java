package com.sonic.dao;

import com.sonic.models.Customer;

import java.util.List;

/**
 * Created by sadra on 10/30/14.
 */
public interface CustomerDao {

    public void save (Customer customer);

    public List <Customer> list();
}
