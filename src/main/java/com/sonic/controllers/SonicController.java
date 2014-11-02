package com.sonic.controllers;

import com.sonic.dao.CustomerDao;
import com.sonic.dao.MealDao;
import com.sonic.models.Customer;
import com.sonic.models.Meal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by sadra on 9/18/14.
 */
@Controller
public class SonicController {

    @Autowired
    private CustomerDao customerDao;
    @Autowired
    private MealDao mealDao;

    @RequestMapping("/admin")
    public String admin(Model model) {

        HashMap <Customer, List<Meal>> customerMealMap = new HashMap<Customer, List <Meal> >();
        List <Customer> list = customerDao.list();

        for(Customer customer : list){
            List <Meal> meals = mealDao.listByCustomer(customer.getId());

            customerMealMap.put(customer, meals);

            System.out.println("Person List::" + customer);
            for (Meal meal : meals){
                System.out.println("Person Meal::" + meal);
            }

        }
        model.addAttribute("users", customerMealMap);

        return "admin";

    }

    @RequestMapping("/test")
    public String test() {

//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/spring4.xml.bk");
//
//        CustomerDao customerDao = context.getBean(CustomerDao.class);
//
//
//        Customer customer = new Customer();
//        customer.setFirst_name("sadra")
//                .setLast_name("ryan")
//                .setAddress("hello st");
//
//        customerDao.save(customer);
//
//        System.out.println("Person::"+ customer);
//
//        List <Customer> list = customerDao.list();
//
//        for(Customer p : list){
//            System.out.println("Person List::"+p);
//        }
//        //close resources
//        context.close();
        return "view";
    }

}
