package com.example.demo.service;

import com.example.demo.model.ConsultaModel;

import java.util.List;

public interface ConsultaService {
    ConsultaModel save(ConsultaModel consultaModel);
    List<ConsultaModel> getAll();
    ConsultaModel getById(int id);
    ConsultaModel update(ConsultaModel consultaModel, int id);
    String delete(int id);
    List<ConsultaModel> getConsultasByEmpleadoId(int id);
}
