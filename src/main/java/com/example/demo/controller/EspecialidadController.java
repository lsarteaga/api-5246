package com.example.demo.controller;

import com.example.demo.model.EspecialidadModel;
import com.example.demo.service.EspecialidadService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/v1/especialidades")
public class EspecialidadController {

    private EspecialidadService especialidadService;

    public EspecialidadController(EspecialidadService especialidadService) {
        this.especialidadService = especialidadService;
    }

    @GetMapping
    public List<EspecialidadModel> getAll() {
        return especialidadService.getAll();
    }

    @GetMapping("/{id}/show")
    public ResponseEntity<EspecialidadModel> getById(@PathVariable(name = "id") int id) {
        return new ResponseEntity<>(especialidadService.getById(id), HttpStatus.OK);
    }
}
