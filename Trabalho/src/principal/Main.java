package principal;

import service.Cofrinho;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Cofrinho cofrinho = new Cofrinho();
        boolean sair = false;

        while (!sair) {

                System.out.println("------- COFRINHO -------");
                System.out.println("1: Adicionar Moedas");
                System.out.println("2: Listar Moedas");
                System.out.println("3: Remover Moeda");
                System.out.println("4: Total Convertido");
                System.out.println("5: Sair");
                System.out.println("------------------------");
                int escolha = scanner.nextInt();

                switch (escolha) {
                    case 1:
                        cofrinho.adicionarMoeda();
                        break;
                    case 2:
                        cofrinho.listagemMoeda();
                        break;
                    case 3:
                        cofrinho.removerMoeda();
                        break;
                    case 4:
                        cofrinho.totalConvertido();
                        break;
                    case 5:
                        sair = true;
                        System.out.println("Programa Encerrado! Volte Sempre!");
                }
        }
    }
}
