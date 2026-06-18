package com.pedrocasseb.course.repositories;

import com.pedrocasseb.course.entities.Category;
import com.pedrocasseb.course.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
