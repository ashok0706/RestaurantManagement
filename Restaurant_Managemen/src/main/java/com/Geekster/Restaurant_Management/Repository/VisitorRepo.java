package com.Geekster.Restaurant_Management.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//import com.Geekster.Restaurant_Management.DTO.SignUpInput;
import com.Geekster.Restaurant_Management.Model.Visitor;
@Repository
public interface VisitorRepo  extends JpaRepository<Visitor , String>{
  
	 Visitor findByEmail(String email);
	 
	   Visitor findByVisitorid(String id);
}
