package org.example.modelos;

import org.example.validaciones.ReservaValidacion;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Reserva {
    private Integer numeroPersonas;
    private Integer id;
    private Integer idUsuario;
    private Integer idOferta;
    private Double costoFinal;
    private LocalDate fechaReserva;
    private ReservaValidacion validacion=new ReservaValidacion();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");


    public Reserva() {
    }

    public Reserva(Integer id, Integer idUsuario, Integer idOferta, Double costoFinal, LocalDate fechaReserva) {
        this.id = id;
        this.idUsuario = idUsuario;
        this.idOferta = idOferta;
        this.costoFinal = costoFinal;
        this.fechaReserva = fechaReserva;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Integer getIdOferta() {
        return idOferta;
    }

    public void setIdOferta(Integer idOferta) {
        this.idOferta = idOferta;
    }

    public Double getCostoFinal() {
        return costoFinal;
    }

    public void setCostoFinal(Double costoFinal) {
        this.costoFinal = costoFinal;
    }

    public LocalDate getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(String fechaReserva) {
        try{
            this.validacion.ValidarFormato(fechaReserva);
            this. fechaReserva=LocalDate.parse(fechaReserva,formatter);
        } catch (Exception error) {
            System.out.println(error.getMessage());
        }
    }

    public Integer getNumeroPersonas() {
        return numeroPersonas;
    }

    public void setNumeroPersonas(Integer numeroPersonas) {
        try{
            this.validacion.ValidarPersonas(numeroPersonas);
            this.numeroPersonas=numeroPersonas;
        }catch (Exception error){
            System.out.println(error.getMessage());
        }
    }

    @Override
    public String toString() {
        return "Reserva{" +
                "numeroPersonas=" + numeroPersonas +
                ", id=" + id +
                ", idUsuario=" + idUsuario +
                ", idOferta=" + idOferta +
                ", costoFinal=" + costoFinal +
                ", fechaReserva=" + fechaReserva +
                ", validacion=" + validacion +
                ", formatter=" + formatter +
                '}';
    }
}

