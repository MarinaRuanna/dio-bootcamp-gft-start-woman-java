package br.com.dio.programacaoOrientadaObjetosEmJava.exericios.estruturasFundamentos;

// EXERCICIO: Crie a classe carro, use a linguagem que gostar e siga as dicas sobre como criar clases.

class Carro {
    private String modelo;
    private String cor;
    private double capacidadeTanqueEmLitros;

    Carro() {

    }

    Carro(String modelo, String cor, double capacidadeTanqueEmLitros) {
        this.modelo = modelo;
        this.cor = cor;
        this.capacidadeTanqueEmLitros = capacidadeTanqueEmLitros;
    }

    String getModelo() {
        return modelo;
    }

    void setModelo(String modelo) {
        this.modelo = modelo;
    }

    String getCor() {
        return cor;
    }

    void setCor(String cor) {
        this.cor = cor;
    }

    double getCapacidadeTanqueEmLitros() {
        return capacidadeTanqueEmLitros;
    }

    void setCapacidadeTanqueEmLitros(double capacidadeTanqueEmLitros) {
        this.capacidadeTanqueEmLitros = capacidadeTanqueEmLitros;
    }

    double ValorTotal(double valorGasolinaPorLitro) {
        return capacidadeTanqueEmLitros * valorGasolinaPorLitro;
    }

    @Override
    public String toString() {
        return "{" +
                "modelo='" + modelo + '\'' +
                ", cor='" + cor + '\'' +
                ", capacidadeTanqueEmLitros=" + capacidadeTanqueEmLitros +
                '}';
    }
}

