package com.Geekster.Restaurant_Management.Model.Service;

import java.sql.Ref;

import javax.swing.tree.AbstractLayoutCache;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Geekster.Restaurant_Management.DTO.SignUpInput;
import com.Geekster.Restaurant_Management.Model.Order;
import com.Geekster.Restaurant_Management.Model.Visitor;
import com.Geekster.Restaurant_Management.Repository.OrderRepo;
import com.Geekster.Restaurant_Management.Repository.VisitorRepo;

@Service
public class VisitorService {
	@Autowired
	VisitorRepo visitorRepo;
    OrderRepo orderRepo;
    Visitor user = null;
//    SignUpInput signUpInput;
    
	public String Signup(Visitor visitor) {
		String  email = visitor.getEmail();
		user = visitorRepo.findByEmail(email); 
		if(user==null) {
			user	 = visitorRepo.save(visitor);
			return "You have Successfully Registered Your Id" + user.getVisitorid();
		}
		return "You alredy regesterd. UserId :"+ visitor.getVisitorid() ;
		
	}

	public String order(Order order) {
		Visitor ref	= visitorRepo.findByVisitorid(order.getUserID());
		
		if(ref==null) return "You Need to Register";
		
		else {
			orderRepo.save(order);
			return "Order is placed";
		}
	}

}
