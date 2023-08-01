package ConversorMoneda;

public class Yen extends Moneda {
    public Yen(double valor) {
        super(valor);
    }

    @Override
    public double convertir(Moneda monedaDestino) {
        if (monedaDestino instanceof Euro) {
            return valor / 129.78; // Tasa de conversi�n aproximada a euros
        } else if (monedaDestino instanceof Dolar) {
            return valor / 110.32; // Tasa de conversi�n aproximada a d�lares
        } else if (monedaDestino instanceof Yen) {
            return valor;
        } else if (monedaDestino instanceof SolPeruano) {
            return valor * 0.032; // Tasa de conversi�n aproximada a soles peruanos
        } else {
            throw new IllegalArgumentException("Moneda de destino no v�lida.");
        }
    }
}

