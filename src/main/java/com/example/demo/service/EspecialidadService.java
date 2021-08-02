package com.example.demo.service;

import com.example.demo.model.EspecialidadModel;

import java.util.List;

public interface EspecialidadService {
    List<EspecialidadModel> getAll();
    EspecialidadModel getById(int id);
}
