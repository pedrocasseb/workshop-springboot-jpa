package com.pedrocasseb.course.repositories;

import com.pedrocasseb.course.entities.Category;
import com.pedrocasseb.course.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
