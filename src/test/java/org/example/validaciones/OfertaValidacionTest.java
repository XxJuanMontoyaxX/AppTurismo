package org.example.validaciones;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class OfertaValidacionTest {
    @Test
    public void ValidarTituloCorrecto() throws Exception {
        OfertaValidacion ofertaValidacion = new OfertaValidacion();
        assertTrue(ofertaValidacion.ValidarTitulo("X oferta"));
    }

    @Test
    public void ValidarTituloIncorrecto() {
        OfertaValidacion ofertaValidacion = new OfertaValidacion();
        assertThrows(Exception.class, () -> ofertaValidacion.ValidarTitulo("Titulo demasiado largo, debe tirar mensaje"), "Exception should be thrown for invalid input");
    }

    @Test
    public void ValidarFechasCorrecta() throws Exception {
        OfertaValidacion ofertaValidacion = new OfertaValidacion();
        LocalDate fechaInicio = LocalDate.parse("2023-08-22");
        LocalDate fechaFin = LocalDate.parse("2023-08-23");
        assertTrue(ofertaValidacion.ValidarFechas(fechaInicio, fechaFin));
    }

    @Test
    public void ValidarFechasIncorrecta() {
        OfertaValidacion ofertaValidacion = new OfertaValidacion();
        LocalDate fechaInicio = LocalDate.parse("2023-08-23");
        LocalDate fechaFin = LocalDate.parse("2023-08-22");
        assertThrows(Exception.class, () -> ofertaValidacion.ValidarFechas(fechaInicio, fechaFin), "El formato fecha es invalido");
    }

    @Test
    public void ValidarFormatoFechaCorrecto() throws Exception {
        OfertaValidacion ofertaValidacion = new OfertaValidacion();
        assertTrue(ofertaValidacion.ValidarFechaInicio("22/08/2023"));
    }

    @Test
    public void ValidarFormatoFechaIncorrecto() {
        OfertaValidacion ofertaValidacion = new OfertaValidacion();
        assertThrows(Exception.class, () -> ofertaValidacion.ValidarFechaInicio("22 de Agosto de 2023"));
    }

    @Test
    public void ValidarCostoCorrecto() throws Exception {
        OfertaValidacion ofertaValidacion = new OfertaValidacion();
        assertTrue(ofertaValidacion.ValidarCosto(3000.0));
    }

    @Test
    public void ValidarCostoIncorrecto() {
        OfertaValidacion ofertaValidacion = new OfertaValidacion();
        assertThrows(Exception.class, () -> ofertaValidacion.ValidarCosto(-3000.0), "");
    }
}