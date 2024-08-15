package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ObjetoTest {

    @Test
    void deveRetornarMedidaMetro() {
        Objeto objeto = new Objeto();
        objeto.setMedida(20f);

        assertEquals(20f, objeto.getMedida());
    }

    @Test
    void deveRetornarMedida() {
        Objeto objeto = new Objeto();
        objeto.setMedida(18.0f);

        assertEquals(0.45f, objeto.getNota(), 0.01);
    }

}