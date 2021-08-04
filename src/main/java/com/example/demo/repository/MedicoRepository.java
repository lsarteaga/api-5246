package com.example.demo.repository;

import com.example.demo.model.MedicoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MedicoRepository extends JpaRepository<MedicoModel, Integer> {
    @Query(value = "select * from medico join empleado " +
            "on medico.id_empleado = empleado.id join centro " +
            "on empleado.id_centro = 1", nativeQuery = true)
    List<MedicoModel> getEmpleadoByIdCentro();
}
