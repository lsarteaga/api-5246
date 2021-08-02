package com.example.demo.model;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "empleado", schema = "centro_medico", catalog = "")
public class EmpleadoModel {
    private int id;
    private String nombre;
    private String direccion;
    private Double salario;
    private Date fechaEntrada;
    private CentroModel centroByIdCentro;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "nombre")
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Basic
    @Column(name = "direccion")
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Basic
    @Column(name = "salario")
    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    @Basic
    @Column(name = "fecha_entrada")
    public Date getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(Date fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmpleadoModel that = (EmpleadoModel) o;
        return id == that.id && Objects.equals(nombre, that.nombre) && Objects.equals(direccion, that.direccion) && Objects.equals(salario, that.salario) && Objects.equals(fechaEntrada, that.fechaEntrada);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre, direccion, salario, fechaEntrada);
    }

    @ManyToOne
    @JoinColumn(name = "id_centro", referencedColumnName = "id", nullable = false)
    public CentroModel getCentroByIdCentro() {
        return centroByIdCentro;
    }

    public void setCentroByIdCentro(CentroModel centroByIdCentro) {
        this.centroByIdCentro = centroByIdCentro;
    }
}
