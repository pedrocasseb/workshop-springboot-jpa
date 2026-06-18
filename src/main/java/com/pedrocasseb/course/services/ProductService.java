package com.pedrocasseb.course.services;

import com.pedrocasseb.course.entities.Category;
import com.pedrocasseb.course.entities.Product;
import com.pedrocasseb.course.repositories.CategoryRepository;
import com.pedrocasseb.course.repositories.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;

    public List<Product> findAll() {
        return productRepository.findAll();
    }

    public Product findById(Long id) {
        Optional<Product> product = productRepository.findById(id);
        return product.get();
    }
}
