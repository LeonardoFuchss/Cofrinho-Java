package abstrata;

public abstract class Moeda { // Classe abstrata MOEDA, também chamada de classe mãe
    public double valor;
    public String nomeMoeda;
    public abstract void info();
    public abstract double converter();

    public Moeda(double valor, String nomeMoeda) {
        this.valor = valor;
        this.nomeMoeda = nomeMoeda;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getNomeMoeda() {
        return nomeMoeda;
    }

    public void setNomeMoeda(String nomeMoeda) {
        this.nomeMoeda = nomeMoeda;
    }
}
