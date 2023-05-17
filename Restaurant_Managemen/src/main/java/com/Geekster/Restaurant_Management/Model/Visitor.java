package com.Geekster.Restaurant_Management.Model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Visitor {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String visitorid;
	private String userName;
	private String password;

	private String email ;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<Order> order;

	public String getVisitorid() {
		return visitorid;
	}

	public void setVisitorid(String visitorid) {
		this.visitorid = visitorid;
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

	public List<Order> getOrder() {
		return order;
	}

	public void setOrder(List<Order> order) {
		this.order = order;
	}

	
	
	
}
