package ConversorMoneda;

public class SolPeruano extends Moneda {
    public SolPeruano(double valor) {
        super(valor);
    }

    @Override
    public double convertir(Moneda monedaDestino) {
        if (monedaDestino instanceof Euro) {
            return valor / 4.09; // Tasa de conversi�n aproximada a euros
        } else if (monedaDestino instanceof Dolar) {
            return valor / 3.52; // Tasa de conversi�n aproximada a d�lares
        } else if (monedaDestino instanceof Yen) {
            return valor / 0.032; // Tasa de conversi�n aproximada a yenes
        } else if (monedaDestino instanceof SolPeruano) {
            return valor;
        } else {
            throw new IllegalArgumentException("Moneda de destino no v�lida.");
        }
    }
}

