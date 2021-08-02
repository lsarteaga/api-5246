package com.example.demo.service.implementation;

import com.example.demo.ResourceNotFoundException;
import com.example.demo.model.ConsultaModel;
import com.example.demo.repository.ConsultaRepository;
import com.example.demo.service.ConsultaService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ConsultaServiceImplementation implements ConsultaService {
    private ConsultaRepository consultaRepository;

    public ConsultaServiceImplementation(ConsultaRepository consultaRepository) {
        this.consultaRepository = consultaRepository;
    }

    @Transactional
    @Override
    public ConsultaModel save(ConsultaModel consultaModel) {
        return consultaRepository.save(consultaModel);
    }

    @Override
    public List<ConsultaModel> getAll() {
        return consultaRepository.findAll();
    }

    @Override
    public ConsultaModel getById(int id) {
        return consultaRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Consulta", "id", id));
    }

    @Transactional
    @Override
    public ConsultaModel update(ConsultaModel consultaModel, int id) {
        ConsultaModel consulta = consultaRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Consulta", "id", id));
        consulta.setPaciente(consultaModel.getPaciente());
        consulta.setFecha(consultaModel.getFecha());
        consulta.setHora(consultaModel.getHora());
        consulta.setCentroByIdCentro(consultaModel.getCentroByIdCentro());
        consulta.setEmpleadoByIdEmpleado(consultaModel.getEmpleadoByIdEmpleado());
        consulta.setEspecialidadByIdEspecialidad(consultaModel.getEspecialidadByIdEspecialidad());

        return consultaRepository.save(consulta);
    }

    @Override
    public String delete(int id) {
        consultaRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Consulta", "id", id));
        consultaRepository.deleteById(id);
        return "Recurso eliminado";
    }

    @Override
    public List<ConsultaModel> getConsultasByEmpleadoId(int id) {
        return consultaRepository.getConsultasByEmpleadoId(id);
    }
}
