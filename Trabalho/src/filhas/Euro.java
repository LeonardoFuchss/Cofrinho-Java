package filhas;

import abstrata.Moeda;

public class Euro extends Moeda { // Classe filha
    public Euro(double valor, String nomeMoeda) {
        super(valor, nomeMoeda);
    }

    @Override
    public void info() {
        System.out.println(" MOEDA EM EURO DA EUROPA! ");
    }

    @Override
    public double converter() {
        return valor * 5.41;
    }
}
