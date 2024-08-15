package org.example;

public class MedidaPolegada implements IMedida {

    private float polegada;

    @Override
    public float getMedida() {
        return polegada;
    }

    @Override
    public void setMedida(float medida) {
        this.polegada = medida;
    }
}
