package com.sonic.controllers;

import com.sonic.dao.CustomerDao;
import com.sonic.models.Customer;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by sadra on 9/18/14.
 */
@Controller
public class SonicController {

    @RequestMapping("/test")
    public String test() {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        CustomerDao customerDao = context.getBean(CustomerDao.class);


        Customer customer = new Customer();
        customer.setFirst_name("sadra")
                .setLast_name("ryan")
                .setAddress("hello st");

        customerDao.save(customer);

        System.out.println("Person::"+ customer);

        List <Customer> list = customerDao.list();

        for(Customer p : list){
            System.out.println("Person List::"+p);
        }
        //close resources
        context.close();
        return "view";
    }

}
