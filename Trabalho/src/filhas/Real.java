package filhas;

import abstrata.Moeda;

public class Real extends Moeda { // Classe filha
    public Real(double valor, String nomeMoeda) {
        super(valor, nomeMoeda);
    }

    @Override
    public void info() {
        System.out.println("MOEDA REAL DO BRASIL!");

    }

    @Override
    public double converter() {
        return valor;
    }
}
