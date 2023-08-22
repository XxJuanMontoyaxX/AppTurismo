package org.example.modelos;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UsuarioTest {

    private Usuario usuario;


    @BeforeEach
    public void configuracionInicial(){
        this.usuario= new Usuario();


    }

    @Test
    public void setCorrectoNombres(){
        String nombreValido="Juan Carlos Montoya";//Preparar
        this.usuario.setNombres(nombreValido);//Ejecutar
        Assertions.assertEquals(nombreValido,usuario.getNombres());
    }

    @Test
    public void setIncorrectoNombres(){
        String nombreInvalido="Juan Carlos21";//Preparar
        this.usuario.setNombres(nombreInvalido);//Ejecutar
        Assertions.assertNotEquals(nombreInvalido,usuario.getNombres());
    }

}