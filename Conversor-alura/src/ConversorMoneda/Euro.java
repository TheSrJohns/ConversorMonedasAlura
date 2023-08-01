package ConversorMoneda;

public class Euro extends Moneda {
    public Euro(double valor) {
        super(valor);
    }

    @Override
    public double convertir(Moneda monedaDestino) {
        if (monedaDestino instanceof Euro) {
            return valor;
        } else if (monedaDestino instanceof Dolar) {
            return valor * 1.18; // Tasa de conversi�n aproximada a d�lares
        } else if (monedaDestino instanceof Yen) {
            return valor * 129.78; // Tasa de conversi�n aproximada a yenes
        } else if (monedaDestino instanceof SolPeruano) {
            return valor * 4.09; // Tasa de conversi�n aproximada a soles peruanos
        } else {
            throw new IllegalArgumentException("Moneda de destino no v�lida.");
        }
    }
}

