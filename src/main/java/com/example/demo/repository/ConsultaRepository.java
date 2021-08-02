package com.example.demo.repository;

import com.example.demo.model.ConsultaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ConsultaRepository extends JpaRepository<ConsultaModel, Integer> {
    @Query(value = "select * from consulta where id_empleado = ?1", nativeQuery = true)
    List<ConsultaModel> getConsultasByEmpleadoId(int id);
}
