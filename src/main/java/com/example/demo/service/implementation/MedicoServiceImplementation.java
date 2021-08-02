package com.example.demo.service.implementation;

import com.example.demo.ResourceNotFoundException;
import com.example.demo.model.MedicoModel;
import com.example.demo.repository.MedicoRepository;
import com.example.demo.service.MedicoService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicoServiceImplementation implements MedicoService {
    private MedicoRepository medicoRepository;
    public MedicoServiceImplementation(MedicoRepository medicoRepository) {
        this.medicoRepository = medicoRepository;
    }
    @Override
    public MedicoModel getById(int id) {
        return medicoRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Medico", "id", id));
    }

    @Override
    public List<MedicoModel> getAll() {
        return medicoRepository.findAll();
    }
}
