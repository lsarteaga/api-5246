package com.example.demo.service.implementation;

import com.example.demo.ResourceNotFoundException;
import com.example.demo.model.CentroModel;
import com.example.demo.repository.CentroRepository;
import com.example.demo.service.CentroService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CentroServiceImplementation implements CentroService {
    private CentroRepository centroRepository;
    public CentroServiceImplementation(CentroRepository centroRepository) {
        this.centroRepository = centroRepository;
    }
    @Override
    public CentroModel getById(int id) {
        return centroRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Centro", "id", id));
    }

    @Override
    public List<CentroModel> getAll() {
        return centroRepository.findAll();
    }
}
