package com.example.demo.repository;

import com.example.demo.model.CentroModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CentroRepository extends JpaRepository<CentroModel, Integer> {
}
