package org.example.validaciones;

import org.example.utilidades.Mensajes;
import org.example.utilidades.Util;

import java.time.LocalDate;

public class OfertaValidacion {
    protected Util utilObjetoUtil=new Util();
    public OfertaValidacion(){
    }
    public boolean ValidarTitulo(String titulo) throws Exception{
        String expresionRegular="^[A-Za-z ]+$";
        if (!utilObjetoUtil.buscarCoincidencia(expresionRegular,titulo)){
            throw new Exception(Mensajes.NOMBRE_SOLO_LETRAS.getMensajes());
        } else if(titulo.length()<20){
            throw new Exception(Mensajes.TITULO_MUY_LARGO.getMensajes());
        } else{
            return true;
        }
    }
    public Boolean ValidarFechaInicio(String fechaInicio) throws Exception{
        String expresionRegular="^(0[1-9]|[1-2][0-9]|3[0-1])/(0[1-9]|1[0-2])/([1-9][0-9]{3})$";
    if (!utilObjetoUtil.buscarCoincidencia(expresionRegular,fechaInicio)){
        throw new Exception("Señor usuario el formato digitado no es el correcto, es dd/MM/yyyy");
    }else {
        return true;
            }
    }

    public Boolean ValidarFechaFin(String fechaFin) throws Exception{
        String expresionRegular="^(0[1-9]|[1-2][0-9]|3[0-1])/(0[1-9]|1[0-2])/([1-9][0-9]{3})$";
        if (!utilObjetoUtil.buscarCoincidencia(expresionRegular,fechaFin)){
            throw new Exception("Señor usuario el formato digitado no es el correcto, es dd/MM/yyyy");
        }else {
            return true;
        }
    }
    public Boolean ValidarFechas(LocalDate fechaInicio, LocalDate fechaFinal) throws Exception{
        if (fechaInicio.isAfter(fechaFinal)){
            throw new Exception("La fecha de inicio no puede ser mayor a la fecha final");
        }else{
            return true;
        }
    }

}
