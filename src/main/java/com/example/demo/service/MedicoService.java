package com.example.demo.service;

import com.example.demo.model.MedicoModel;

import java.util.List;

public interface MedicoService {
    MedicoModel getById(int id);
    List<MedicoModel> getAll();
}
