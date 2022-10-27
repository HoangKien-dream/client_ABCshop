package com.example.crud_api.repository;

import com.example.crud_api.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.criteria.CriteriaBuilder;

@Repository
public interface RepoProduct extends JpaRepository<Product, Integer> {
}
