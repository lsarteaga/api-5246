package com.example.demo.service;

import com.example.demo.model.CentroModel;

import java.util.List;

public interface CentroService {
    CentroModel getById(int id);
    List<CentroModel> getAll();
}
