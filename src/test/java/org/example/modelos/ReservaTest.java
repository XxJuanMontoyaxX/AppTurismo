package org.example.modelos;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReservaTest {
    private Reserva reserva;

    @BeforeEach
    public void configuracionInicial(){this.reserva = new Reserva();}

    @Test
    public void setCorrectoNumeroPersonas(){
        Integer numeroPersonasValido =3;
        this.reserva.setNumeroPersonas(numeroPersonasValido);
        Assertions.assertEquals(numeroPersonasValido, reserva.getNumeroPersonas());
    }

    @Test
    public void setIncorrectoNumeroPersonas(){
        Integer numeroPersonasInvalido=8;
        this.reserva.setNumeroPersonas(numeroPersonasInvalido);
        Assertions.assertNotEquals(numeroPersonasInvalido, reserva.getNumeroPersonas());
    }

}