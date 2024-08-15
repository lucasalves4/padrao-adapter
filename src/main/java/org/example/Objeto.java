package org.example;

public class Objeto {

    IMedida medida;
    MedidaAdapter medidaconvertida;


    public Objeto() {
        medida = new MedidaPolegada();
        medidaconvertida = new MedidaAdapter(medida);
    }

    public void setMedida(float medida) {
        this.medida.setMedida(medida);
        medidaconvertida.salvarMedida();
    }

    public float getMedida() {
        return medidaconvertida.converterPolegada();
    }


    public float getNota() {
        return medidaconvertida.getMedidaMetro();
    }
}
