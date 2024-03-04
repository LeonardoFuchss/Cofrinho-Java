package filhas;

import abstrata.Moeda;

public class Dolar extends Moeda { // Classe filha

    public Dolar(double valor, String nomeMoeda) {
        super(valor, nomeMoeda);
    }

    @Override
    public void info() {
        System.out.println(" MOEDA DÓLAR DOS EUA! ");
    }

    @Override
    public double converter() {
        return valor * 4.98;
    }
}
