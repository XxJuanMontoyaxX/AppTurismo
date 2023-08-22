package org.example.modelos;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LocalTest {
    private Local local;

    @BeforeEach
    public void configuracionInicial(){
        this.local= new Local();
    }
    @Test
    public void setCorrectoNit(){
        String nitValido="1025760910";
        this.local.setNit(nitValido);
        Assertions.assertEquals(nitValido, local.getNit());
    }

    @Test
    public void setIncorrectoNit(){
        String nitInvalido="juan123456789";
        this.local.setNit(nitInvalido);
        Assertions.assertNotEquals(nitInvalido, local.getNit());
    }

    @Test
    public void setCorrectoNombreEmpresa(){
        String nombreEmpresaValido = "JyC Construcciones";
        this.local.setNombre(nombreEmpresaValido);
        Assertions.assertEquals(nombreEmpresaValido, local.getNombre());
    }

    @Test
    public void setIncorrectoNombreEmpresa(){
        String nombreEmpresaInvalido = "JyC Construcciones S.A.S Juan Montoya";
        this.local.setNombre(nombreEmpresaInvalido);
        Assertions.assertNotEquals(nombreEmpresaInvalido, local.getNombre());
    }
}
