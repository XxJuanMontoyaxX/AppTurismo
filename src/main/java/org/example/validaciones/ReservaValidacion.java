package org.example.validaciones;

import org.example.utilidades.Mensajes;
import org.example.utilidades.Util;

public class ReservaValidacion {
    protected Util util= new Util();

    public ReservaValidacion(){
    }

    public Boolean ValidarFormato(String fechaReserva) throws Exception{
        String expresionRegular="^(0[1-9]|[1-2][0-9]|3[0-1])/(0[1-9]|1[0-2])/([1-9][0-9]{3})$";
        if  (!util.buscarCoincidencia(expresionRegular,fechaReserva)){
            throw new Exception(Mensajes.FORMATO_FECHAS.getMensajes());
        }else {
            return true;
        }
    }
    public Boolean ValidarPersonas(Integer numeroPerosnas)throws Exception{
        if (!((numeroPerosnas>0) && (numeroPerosnas<5))){
            throw new Exception(Mensajes.CANTIDAD_PERSONAS.getMensajes());
        }else {
            return true;
        }
    }
}
