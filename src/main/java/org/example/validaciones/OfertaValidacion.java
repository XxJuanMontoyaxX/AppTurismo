package org.example.validaciones;

import org.example.utilidades.Mensajes;
import org.example.utilidades.Util;

import java.time.LocalDate;

public class OfertaValidacion {
    protected Util utilObjetoUtil=new Util();
    public OfertaValidacion(){
    }
    public boolean ValidarTitulo(String titulo) throws Exception{
        String expresionRegular="^.{1,20}$";
        if (!utilObjetoUtil.buscarCoincidencia(expresionRegular,titulo)){
            throw new Exception(Mensajes.TITULO_MUY_LARGO.getMensajes());
        } else{
            return true;
        }
    }
    public Boolean ValidarFechaInicio(String fechaInicio) throws Exception{
        String expresionRegular="^(0[1-9]|[1-2][0-9]|3[0-1])/(0[1-9]|1[0-2])/([1-9][0-9]{3})$";
    if (!utilObjetoUtil.buscarCoincidencia(expresionRegular,fechaInicio)){
        throw new Exception(Mensajes.FORMATO_FECHAS.getMensajes());
    }else {
        return true;
            }
    }

    public Boolean ValidarFechaFin(String fechaFin) throws Exception{
        String expresionRegular="^(0[1-9]|[1-2][0-9]|3[0-1])/(0[1-9]|1[0-2])/([1-9][0-9]{3})$";
        if (!utilObjetoUtil.buscarCoincidencia(expresionRegular,fechaFin)){
            throw new Exception(Mensajes.FORMATO_FECHAS.getMensajes());
        }else {
            return true;
        }
    }
    public Boolean ValidarFechas(LocalDate fechaInicio, LocalDate fechaFinal) throws Exception{
        if (fechaInicio.isAfter(fechaFinal)){
            throw new Exception(Mensajes.FECHA_FINAL.getMensajes());
        }else{
            return true;
        }
    }

    public Boolean ValidarCosto(Double costoPersona) throws Exception{
        if (costoPersona<0){
            throw new Exception(Mensajes.COSTO_PERSONA.getMensajes());
        } else {
            return true;
        }
    }


}
