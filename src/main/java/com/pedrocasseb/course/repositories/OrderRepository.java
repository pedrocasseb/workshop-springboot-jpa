package com.pedrocasseb.course.repositories;

import com.pedrocasseb.course.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
