package com.example.demo.controller;

import com.example.demo.model.MedicoModel;
import com.example.demo.service.MedicoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/v1/medicos")
public class MedicoController {
    private MedicoService medicoService;

    public MedicoController(MedicoService medicoService) {
        this.medicoService = medicoService;
    }

    @GetMapping
    public List<MedicoModel> getAll() {
        return medicoService.getAll();
    }

    @GetMapping("/{id}/show")
    public ResponseEntity<MedicoModel> getById(@PathVariable(name = "id") int id) {
        return new ResponseEntity<>(medicoService.getById(id), HttpStatus.OK);
    }
}
