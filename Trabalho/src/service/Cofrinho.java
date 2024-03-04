package service;

import abstrata.Moeda;
import filhas.Dolar;
import filhas.Euro;
import filhas.Real;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Cofrinho {
    private final ArrayList<Moeda> listaMoeda = new ArrayList<>(); // Criando uma lista de moedas.
    Scanner scanner = new Scanner(System.in);

    public void adicionarMoeda() { // Método para adicionar moedas.
        try {
            System.out.println("Escolha a moeda: "); // Menu para escolher a moeda.
            System.out.println("1: Dolar");
            System.out.println("2: Euro");
            System.out.println("3: Real");
            int escolha = scanner.nextInt(); // Armazenando a escolha do usuário.

            switch (escolha) { // Switch case de acordo com a escolha do usuário
                case 1:
                    System.out.println("Digite um valor: "); // Digitar o valor da moeda.
                    double valor = scanner.nextDouble(); // Armazenando a escolha do usuário.

                    Dolar dolar = new Dolar(valor, "Dolar $ "); // Instanciando a classe filha DOLAR, com o valor digitado pelo usuário e o nome DOLAR.
                    listaMoeda.add(dolar); // Adicionando o objeto instanciado dolar na lista de moedas.

                    System.out.println("Moeda adicionada com sucesso! ");
                    break;

                case 2:
                    System.out.println("Digite um valor: "); // Digitar o valor da moeda.
                    double valor2 = scanner.nextDouble(); // Armazenando a escolha do usuário.

                    Euro euro = new Euro(valor2, "Euro € "); // Instanciando a classe filha EURO, com o valor digitado pelo usuário e o nome EURO.
                    listaMoeda.add(euro); // Adicionando o objeto instanciado euro na lista de moedas.

                    System.out.println("Moeda adicionada com sucesso!");
                    break;

                case 3:
                    System.out.println("Digite um valor: "); // Digitar o valor da moeda.
                    double valor3 = scanner.nextDouble(); // Armazenando a escolha do usuário.

                    Real real = new Real(valor3, "Real R$ "); // Instanciando a classe filha REAL, com o valor digitado pelo usuário e o nome REAL.
                    listaMoeda.add(real); // Adicionando o objeto instanciado real na lista de moedas.

                    System.out.println("Moeda adicionada com sucesso!");
                    break;

                default:
                    System.out.println("Opcao invalida!");
            }
        } catch (Exception e){
            System.out.println("Ocorreu um erro! Número ou valor invalidos. Pressione ENTER para retornar ao menu: ");
            scanner.nextLine();
            scanner.nextLine();
        }
    }
    public void removerMoeda() {
        try {
            for (Moeda moedas : listaMoeda) { // Loop para percorrer a lista de moedas
                System.out.println(moedas.getNomeMoeda() + moedas.getValor()); // Imprimindo os nomes e os valores das moedas.
            }
            System.out.println("Qual moeda deseja remover? Digite o valor: "); // Solicitando ao usuário para ele digitar o valor da moeda que queira remover.
            double escolha = scanner.nextDouble(); // Armazenando a escolha do usuário.

            Iterator<Moeda> iterator = listaMoeda.iterator(); // Criando um Iterator para percorrer a lista de moedas.

            while (iterator.hasNext()) { // Enquanto existir elementos no iterator (listaMoedas), executa.
                Moeda moeda = iterator.next(); // Atribuindo o proximo elemento da lista como objeto moeda.

                if (moeda.getValor() == escolha) { // Se o valor do proximo elemento for igual a entrada do usuário
                    iterator.remove(); // Remove da lista.
                    System.out.println("Moeda removida com sucesso!");
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println("Ocorreu um erro. Digite um valor sem pontos ou virgulas. Pressione ENTER para retornar ao menu: ");
            scanner.nextLine();
            scanner.nextLine();
        }
    }
    public void listagemMoeda() {
        for (Moeda moedas : listaMoeda) { // Percorrendo a lista de moedas.
            System.out.println(moedas.getNomeMoeda() + moedas.getValor()); // Imprimindo a o valor e o nome das moedas da lista.
        }
    }
    public void totalConvertido() { // Método para saber o total de valor convertido para real na lista.

        double somaConvertida = 0; // Definindo a variavel somaConvertida, atribuindo ela como 0.

        for (Moeda total : listaMoeda) { // Percorrendo a lista de moedas
            double totalC = total.converter(); // Chamando o método de conversão de cada moeda da lista e armazenando em uma variável.
            somaConvertida += totalC; // somando todos valores convertidos existentes na lista.
        }
        System.out.println("Total convertido para Real: R$ " + somaConvertida); // Imprimindo o total.
    }
}
