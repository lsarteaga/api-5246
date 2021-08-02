package com.example.demo.model;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;
import java.util.Objects;

@Entity
@Table(name = "consulta", schema = "centro_medico", catalog = "")
public class ConsultaModel {
    private int id;
    private Date fecha;
    private Time hora;
    private String paciente;
    private CentroModel centroByIdCentro;
    private EmpleadoModel empleadoByIdEmpleado;
    private EspecialidadModel especialidadByIdEspecialidad;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "fecha")
    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Basic
    @Column(name = "hora")
    public Time getHora() {
        return hora;
    }

    public void setHora(Time hora) {
        this.hora = hora;
    }

    @Basic
    @Column(name = "paciente")
    public String getPaciente() {
        return paciente;
    }

    public void setPaciente(String paciente) {
        this.paciente = paciente;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ConsultaModel that = (ConsultaModel) o;
        return id == that.id && Objects.equals(fecha, that.fecha) && Objects.equals(hora, that.hora) && Objects.equals(paciente, that.paciente);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, fecha, hora, paciente);
    }

    @ManyToOne
    @JoinColumn(name = "id_centro", referencedColumnName = "id")

    public CentroModel getCentroByIdCentro() {
        return centroByIdCentro;
    }

    public void setCentroByIdCentro(CentroModel centroByIdCentro) {
        this.centroByIdCentro = centroByIdCentro;
    }

    @ManyToOne
    @JoinColumn(name = "id_empleado", referencedColumnName = "id")
    public EmpleadoModel getEmpleadoByIdEmpleado() {
        return empleadoByIdEmpleado;
    }

    public void setEmpleadoByIdEmpleado(EmpleadoModel empleadoByIdEmpleado) {
        this.empleadoByIdEmpleado = empleadoByIdEmpleado;
    }

    @ManyToOne
    @JoinColumn(name = "id_especialidad", referencedColumnName = "id")

    public EspecialidadModel getEspecialidadByIdEspecialidad() {
        return especialidadByIdEspecialidad;
    }

    public void setEspecialidadByIdEspecialidad(EspecialidadModel especialidadByIdEspecialidad) {
        this.especialidadByIdEspecialidad = especialidadByIdEspecialidad;
    }
}
