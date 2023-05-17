package com.Geekster.Restaurant_Management.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Geekster.Restaurant_Management.DTO.SignUpInput;
import com.Geekster.Restaurant_Management.Model.Admin;

@Repository
public interface AdminRepo extends JpaRepository<Admin, String> {

 	Admin findByEmail(String email);

}
