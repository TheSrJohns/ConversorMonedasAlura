package ConversorMoneda;

public abstract class Moneda {
    protected double valor;

    public Moneda(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public abstract double convertir(Moneda monedaDestino);
}
