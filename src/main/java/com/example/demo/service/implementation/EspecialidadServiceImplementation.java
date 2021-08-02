package com.example.demo.service.implementation;

import com.example.demo.ResourceNotFoundException;
import com.example.demo.model.EspecialidadModel;
import com.example.demo.repository.EspecialidadRepository;
import com.example.demo.service.EspecialidadService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EspecialidadServiceImplementation implements EspecialidadService {
    private EspecialidadRepository especialidadRepository;
    public EspecialidadServiceImplementation(EspecialidadRepository especialidadRepository) {
        this.especialidadRepository = especialidadRepository;
    }
    @Override
    public List<EspecialidadModel> getAll() {
        return especialidadRepository.findAll();
    }

    @Override
    public EspecialidadModel getById(int id) {
        return especialidadRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Especialidad", "id", id));
    }
}
