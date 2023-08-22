package org.example.validaciones;

import org.example.utilidades.Mensajes;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UsuarioValidacionTest {
    private UsuarioValidacion usuarioValidacion;

    @BeforeEach
    public void setUp(){
        this.usuarioValidacion=new UsuarioValidacion();
    }

    @Test
    public void validarNombreUsuarioCorrecto(){
        String nombreValido="Juan Carlos Montoya";
        Assertions.assertDoesNotThrow(()->usuarioValidacion.validarNombres(nombreValido));

    }

    @Test
    public void validarNombreUsuarioIncorrectoNumeros(){
        String nombreInvalido="Juan Montoya21";
        Exception exception = Assertions.assertThrows(Exception.class,()->usuarioValidacion.validarNombres(nombreInvalido));
        Assertions.assertEquals(Mensajes.NOMBRE_SOLO_LETRAS.getMensajes(),exception.getMessage());
    }

    @Test
    public void validarNombreUsuarioIncorrectoCorto(){
        String nombreInvalido="J";
        Exception exception = Assertions.assertThrows(Exception.class,()->usuarioValidacion.validarNombres(nombreInvalido));
        Assertions.assertEquals(Mensajes.NOMBRE_MUY_CORTO.getMensajes(),exception.getMessage());
    }

    @Test
    public void validarCorreoElectronicoCorrecto(){
        String correoValido="JuanMontoya@gmail.com";
        Exception exception = Assertions.assertThrows(Exception.class,()->usuarioValidacion.validarNombres(correoValido));
        Assertions.assertDoesNotThrow(()->usuarioValidacion.validarCorreo(correoValido));

    }



    @Test
    public void validarCorreoElectronicoIncorrecto(){
        String correoInvalido="JuanMontoya.com";
        Exception exception = Assertions.assertThrows(Exception.class,()->usuarioValidacion.validarNombres(correoInvalido));
        Assertions.assertThrows(Exception.class,()->usuarioValidacion.validarCorreo(correoInvalido));
    }


}