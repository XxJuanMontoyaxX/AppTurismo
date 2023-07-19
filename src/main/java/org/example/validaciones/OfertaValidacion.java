package org.example.validaciones;

import org.example.utilidades.Mensajes;
import org.example.utilidades.Util;

public class OfertaValidacion {
    protected Util util=new Util();
    public OfertaValidacion(){
    }
    public boolean ValidarTitulo(String titulo) throws Exception{
        String expresionRegular="^[A-Za-z ]+$";
        if (!util.buscarCoincidencia(expresionRegular,titulo)){
            throw new Exception(Mensajes.NOMBRE_SOLO_LETRAS.getMensajes());
        } else if(titulo.length()>20){
            throw new Exception(Mensajes.TITULO_MUY_LARGO.getMensajes());
        } else{
            return true;
        }
    }
}
