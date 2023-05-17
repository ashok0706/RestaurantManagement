package com.Geekster.Restaurant_Management.Model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Entity
@Data
public class Admin {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String adminId;
	private String userName;
	private String password;
	
	private String email ;
	
	@OneToMany(cascade = CascadeType.ALL)
   private List<FoodItem> foodItem ;
	
	

	/**
	 * @param userName
	 * @param password
	 * @param email
	 */
	public Admin(String userName, String password, String email, List<FoodItem> foodItem) {
		super();
		this.userName = userName;
		this.password = password;
		this.email = email;
		this.foodItem= foodItem;
	}
	public List<FoodItem> getFoodItem() {
		return foodItem;
	}
	public void setFoodItem(List<FoodItem> foodItem) {
		this.foodItem = foodItem;
	}
	public String getAdminId() {
		return adminId;
	}
	public void setAdminId(String adminId) {
		this.adminId = adminId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
}
