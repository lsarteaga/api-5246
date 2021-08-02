package com.example.demo.controller;

import com.example.demo.model.ConsultaModel;
import com.example.demo.service.ConsultaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/consultas")
@CrossOrigin("*")
public class ConsultaController {

    private ConsultaService consultaService;

    public ConsultaController(ConsultaService consultaService) {
        super();
        this.consultaService = consultaService;
    }

    @PostMapping("/create")
    public ResponseEntity<ConsultaModel> save(@RequestBody ConsultaModel consultaModel) {
        return new ResponseEntity<>(consultaService.save(consultaModel), HttpStatus.CREATED);
    }

    @PutMapping("/{id}/update")
    public ResponseEntity<ConsultaModel> update(@RequestBody ConsultaModel consultaModel,
                                                @PathVariable(name = "id") int id) {
        return new ResponseEntity<>(consultaService.update(consultaModel, id), HttpStatus.OK);
    }

    @DeleteMapping("/{id}/delete")
    public ResponseEntity<String> delete(@PathVariable(name = "id") int id) {
        return new ResponseEntity<>(consultaService.delete(id), HttpStatus.OK);
    }

    @GetMapping
    public List<ConsultaModel> getAll() {
        return consultaService.getAll();
    }

    @GetMapping("{id}/empleado")
    public List<ConsultaModel> getConsultasByEmpleadoId(@PathVariable(name = "id") int id) {
        return consultaService.getConsultasByEmpleadoId(id);
    }

    @GetMapping("/{id}/show")
    public ResponseEntity<ConsultaModel> getById(@PathVariable(name = "id") int id) {
        return new ResponseEntity<>(consultaService.getById(id), HttpStatus.OK);
    }

}
