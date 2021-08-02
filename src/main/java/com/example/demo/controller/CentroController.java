package com.example.demo.controller;

import com.example.demo.model.CentroModel;
import com.example.demo.service.CentroService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/v1/centros")
public class CentroController {
    private CentroService centroService;
    public CentroController(CentroService centroService) {
        this.centroService = centroService;
    }

    @GetMapping("/{id}/show")
    public ResponseEntity<CentroModel> getById(@PathVariable(name = "id") int id) {
        return new ResponseEntity<>(centroService.getById(id), HttpStatus.OK);
    }
}
