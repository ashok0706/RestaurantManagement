package com.Geekster.Restaurant_Management.Model.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Geekster.Restaurant_Management.DTO.SignUpInput;
import com.Geekster.Restaurant_Management.Model.Admin;
import com.Geekster.Restaurant_Management.Model.FoodItem;
import com.Geekster.Restaurant_Management.Repository.AdminRepo;
import com.Geekster.Restaurant_Management.Repository.FoodItemRepo;

@Service
public class AdminService {

	@Autowired
	FoodItemRepo foodItemRepo;
	AdminRepo adminRepo;
	Admin admin= null;
	
	public String addfooditem(String email, FoodItem foodItem) {
		foodItemRepo.save(foodItem);
		return "Successfully food item added";
	}
	public String AdminSignin(Admin admin) {
	  admin	= adminRepo.findByEmail(admin.getEmail()) ;
	
	  if(admin!=null) return "Admin  have Alredy registered";
	  
	  else {
		  adminRepo.save(admin);
		  return "Admin Successfully registered";
	}
	}

}
