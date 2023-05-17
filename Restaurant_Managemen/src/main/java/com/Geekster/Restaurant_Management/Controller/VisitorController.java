package com.Geekster.Restaurant_Management.Controller;

import org.apache.logging.log4j.util.StringBuilderFormattable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Geekster.Restaurant_Management.DTO.SignUpInput;
import com.Geekster.Restaurant_Management.Model.Order;
import com.Geekster.Restaurant_Management.Model.Visitor;
import com.Geekster.Restaurant_Management.Model.Service.VisitorService;

@RestController
@RequestMapping("/Visitor")
public class VisitorController {
	
	@Autowired
	VisitorService visitorService;
	
	@PostMapping("/signup")
	public String Signup(@RequestBody Visitor visitor) {
		return visitorService.Signup(visitor);
	
	}
	
	@PostMapping("/order")
	public String order( @RequestBody Order order) {
          return  visitorService.order( order);
	}

}
