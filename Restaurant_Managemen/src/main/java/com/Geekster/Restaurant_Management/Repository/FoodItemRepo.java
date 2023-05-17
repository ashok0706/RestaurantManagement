package com.Geekster.Restaurant_Management.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Geekster.Restaurant_Management.Model.FoodItem;
@Repository
public interface FoodItemRepo extends JpaRepository<FoodItem, String>{

}
