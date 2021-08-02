package com.example.demo.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "medico", schema = "centro_medico", catalog = "")
public class MedicoModel {
    private int id;
    private String funcion;
    private String experiencia;
    private EmpleadoModel empleadoByIdEmpleado;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "funcion")
    public String getFuncion() {
        return funcion;
    }

    public void setFuncion(String funcion) {
        this.funcion = funcion;
    }

    @Basic
    @Column(name = "experiencia")
    public String getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(String experiencia) {
        this.experiencia = experiencia;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MedicoModel that = (MedicoModel) o;
        return id == that.id && Objects.equals(funcion, that.funcion) && Objects.equals(experiencia, that.experiencia);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, funcion, experiencia);
    }

    @ManyToOne
    @JoinColumn(name = "id_empleado", referencedColumnName = "id", nullable = false)
    public EmpleadoModel getEmpleadoByIdEmpleado() {
        return empleadoByIdEmpleado;
    }

    public void setEmpleadoByIdEmpleado(EmpleadoModel empleadoByIdEmpleado) {
        this.empleadoByIdEmpleado = empleadoByIdEmpleado;
    }
}
