package com.pedrocasseb.course.services;

import com.pedrocasseb.course.entities.Category;
import com.pedrocasseb.course.entities.User;
import com.pedrocasseb.course.repositories.CategoryRepository;
import com.pedrocasseb.course.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CategoryService {
    private final CategoryRepository categoryRepository;

    public List<Category> findAll() {
        return categoryRepository.findAll();
    }

    public Category findById(Long id) {
        Optional<Category> category = categoryRepository.findById(id);
        return category.get();
    }
}
