package org.example.validaciones;

import org.example.utilidades.Mensajes;
import org.example.utilidades.Util;

public class LocalValidacion {
    protected static Util util=new Util();
    public LocalValidacion(){
    }
    public static Boolean ValidarNit(String nit)throws Exception{
        String expresionRegular="^\\d{10}$";
        if (!util.buscarCoincidencia(expresionRegular,nit)){
            throw new Exception(Mensajes.NIT_SOLO_NUMEROS.getMensajes());
        } else if (!(nit.length() == 10)) {
            throw new Exception(Mensajes.NIT_CANTIDAD.getMensajes());
        }else {
            return true;
        }
    }

    public Boolean ValidarNombre(String nombre) throws Exception{
        String expresionRegular="^.{1,30}$";
        if(!util.buscarCoincidencia(expresionRegular, nombre)){
            throw new Exception(Mensajes.NOMBRE_MUY_LARGO.getMensajes());
        } else{
            return true;
        }
    }
}
