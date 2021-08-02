package com.example.demo.repository;

import com.example.demo.model.MedicoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicoRepository extends JpaRepository<MedicoModel, Integer> {
}
