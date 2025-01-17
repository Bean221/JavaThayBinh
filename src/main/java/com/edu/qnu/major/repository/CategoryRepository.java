package com.edu.qnu.major.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edu.qnu.major.model.Category;

import java.util.List;
@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
