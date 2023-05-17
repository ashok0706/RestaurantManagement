package com.Geekster.Restaurant_Management.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Geekster.Restaurant_Management.DTO.SignUpInput;
import com.Geekster.Restaurant_Management.Model.Admin;
import com.Geekster.Restaurant_Management.Model.FoodItem;
import com.Geekster.Restaurant_Management.Model.Service.AdminService;

@RestController
@RequestMapping("/Admin")
public class AdminController {
	@Autowired
	AdminService adminService;
	
	
	@PostMapping("/sigUp")
	public String AdminSignin(@RequestBody Admin admin) {
		 return adminService.AdminSignin(admin);
	}
	
	@PostMapping("/addFoodItem/{email}")
	public String addfooditem (@PathVariable String email ,@RequestBody FoodItem foodItem) {
		int leng = email.length()-1;
		String ref = email.substring(leng-9);
		boolean status = ref.equals("@admin.com");
		
		if(status==false) return "You have entered Invalid maileId";
		
		else {
			return adminService.addfooditem(email, foodItem);
		}
		
		
	}

}
