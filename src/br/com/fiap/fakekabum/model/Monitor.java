package br.com.fiap.fakekabum.model;

public class Monitor {

    String polegadas;

    double preco;

    Fabricante fabricante;

    public String getPolegadas() {return polegadas; }

    public Monitor setPolegadas(String polegadas) {
        this.polegadas = polegadas;
        return this;
    }

    public double getPreco() {return preco; }

    public Monitor setPreco(double preco) {
        this.preco = preco;
        return this;
    }

    public Fabricante getFabricante() {return fabricante; }

    public Monitor setFabricante(Fabricante fabricante) {
        this.fabricante = fabricante;
        return this;
    }

    public Monitor(String polegadas, double preco, Fabricante fabricante){
        this.polegadas = polegadas;
        this.preco = preco;
        this.fabricante = fabricante;

    }



}
