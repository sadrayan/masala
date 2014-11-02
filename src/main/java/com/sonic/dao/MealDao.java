package com.sonic.dao;


import com.sonic.models.Meal;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by sadra on 11/1/14.
 */
@Repository
public interface MealDao {

    public void save (Meal meal);

    public List<Meal> listByCustomer(int cutomerId);
}
