package org.example.modelos;

import java.time.LocalDate;

public class Reserva {
    private Integer id;
    private Integer idUsuario;
    private Integer idOferta;
    private Double costoFinal;
    private LocalDate fechaReserva;

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

    public void setFechaReserva(LocalDate fechaReserva) {
        this.fechaReserva = fechaReserva;
    }
}
