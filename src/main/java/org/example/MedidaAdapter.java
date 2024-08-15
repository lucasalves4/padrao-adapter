package org.example;

public class MedidaAdapter extends MedidaMetro {

    private float convPolegada = 39.37f;

    private IMedida valorPolegada;

    public MedidaAdapter(IMedida valorPolegada) {
        this.valorPolegada = valorPolegada;
    }

    public float converterPolegada() {
        valorPolegada.setMedida(this.getMedidaMetro() * convPolegada);
        return valorPolegada.getMedida();
    }

    public void salvarMedida() {
        this.setMedidaMetro(valorPolegada.getMedida() / convPolegada);
    }
}
