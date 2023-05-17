package com.Geekster.Restaurant_Management.Repository;

import org.springframework.boot.autoconfigure.web.servlet.JerseyApplicationPath;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Geekster.Restaurant_Management.Model.Order;
@Repository
public interface OrderRepo extends JpaRepository<Order, String> {

}
