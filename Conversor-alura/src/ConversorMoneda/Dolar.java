package ConversorMoneda;

public class Dolar extends Moneda {
    public Dolar(double valor) {
        super(valor);
    }

    @Override
    public double convertir(Moneda monedaDestino) {
        if (monedaDestino instanceof Euro) {
            return valor / 1.18; // Tasa de conversión aproximada a euros
        } else if (monedaDestino instanceof Dolar) {
            return valor;
        } else if (monedaDestino instanceof Yen) {
            return valor * 110.32; // Tasa de conversión aproximada a yenes
        } else if (monedaDestino instanceof SolPeruano) {
            return valor * 3.52; // Tasa de conversión aproximada a soles peruanos
        } else {
            throw new IllegalArgumentException("Moneda de destino no válida.");
        }
    }
}

