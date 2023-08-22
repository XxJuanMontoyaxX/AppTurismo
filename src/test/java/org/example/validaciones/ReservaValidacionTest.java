package org.example.validaciones;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReservaValidacionTest {
    @Test
    public void FormatoFechaCorrecto() throws Exception {
        ReservaValidacion reservaValidacion = new ReservaValidacion();
        assertTrue(reservaValidacion.ValidarFormato("22/08/2023"));
    }

    @Test
    public void FormatoFechaIncorrecto() {
        ReservaValidacion reservaValidacion = new ReservaValidacion();
        assertThrows(Exception.class, () -> reservaValidacion.ValidarFormato("2023-08-22"), "");
    }

    @Test
    public void ValidarCantidadReserva_ValidInput_ReturnsTrue() throws Exception {
        ReservaValidacion reservaValidacion = new ReservaValidacion();
        assertTrue(reservaValidacion.ValidarPersonas(2));
    }

    @Test
    public void ValidarCantidadReserva_InvalidInput_ThrowsException() {
        ReservaValidacion reservaValidacion = new ReservaValidacion();
        assertThrows(Exception.class, () -> reservaValidacion.ValidarPersonas(8), "");
    }
}