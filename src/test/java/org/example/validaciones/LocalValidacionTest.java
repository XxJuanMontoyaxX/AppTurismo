package org.example.validaciones;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LocalValidacionTest {
    @Test
    public void ValidarNitCorrecto() throws Exception {
        LocalValidacion localValidacion = new LocalValidacion();
        assertTrue(localValidacion.ValidarNit("1025760910"));
    }

    @Test
    public void ValidarNitIncorrecto() {
        LocalValidacion localValidacion = new LocalValidacion();
        assertThrows(Exception.class, () -> LocalValidacion.ValidarNit("123456"), "Exception should be thrown for invalid input");
    }

    @Test
    public void ValidarNombreCorrecto() throws Exception {
        LocalValidacion localValidacion = new LocalValidacion();
        assertTrue(localValidacion.ValidarNombre("JyC Construcciones"));
    }

    @Test
    public void ValidarNombreIncorrecto() {
        LocalValidacion localValidacion = new LocalValidacion();
        assertThrows(Exception.class, () -> localValidacion.ValidarNombre("Jyc Construcciones S.A.S Juan Montoya"), "Exception should be thrown for invalid input");
    }
}