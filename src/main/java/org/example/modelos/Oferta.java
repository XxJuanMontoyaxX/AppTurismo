package org.example.modelos;

import org.example.validaciones.OfertaValidacion;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Oferta {
    private Integer id;
    private String titulo;
    private String descripcion;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private Double costoPersona;
    private Integer idLocal;
    private OfertaValidacion ValidarFormatoFechas= new OfertaValidacion();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Oferta() {
    }

    public Oferta(Integer id, String titulo, String descripcion, LocalDate fechainicio, LocalDate fechafin, Double costopersona, Integer idlocal) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fechaInicio = fechainicio;
        this.fechaFin = fechafin;
        this.costoPersona = costopersona;
        this.idLocal = idlocal;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
     try{
         this.ValidarFormatoFechas.ValidarFechaInicio(fechaInicio);
         this. fechaInicio=LocalDate.parse(fechaInicio,formatter);
     } catch (Exception error) {
         System.out.println(error.getMessage());
     }
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        try{
            this.ValidarFormatoFechas.ValidarFechaInicio(fechaFin);
            this.ValidarFormatoFechas.ValidarFechas(this.fechaInicio,LocalDate.parse(fechaFin,formatter));
            this. fechaInicio=LocalDate.parse(fechaFin,formatter);
        } catch (Exception error) {
            System.out.println(error.getMessage());
        }
    }

    public Double getCostoPersona() {
        return costoPersona;
    }

    public void setCostoPersona(Double costoPersona) {
        this.costoPersona = costoPersona;
    }

    public Integer getIdLocal() {
        return idLocal;
    }

    public void setIdLocal(Integer idLocal) {
        this.idLocal = idLocal;
    }
}
