import java.util.ArrayList;
import java.util.Scanner;

import models.Jogador;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        ArrayList<Jogador> jogadores = new ArrayList<Jogador>();

        int option = 0;

        do {

            menu();
            option = sc.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Digite o nome do jogador: ");
                    String nome = sc.next();
                    System.out.println("Digite a idade do jogador: ");
                    int idade = sc.nextInt();
                    System.out.println("Digite o cpf do jogador: ");
                    long cpf = sc.nextLong();

                    Jogador jogador = new Jogador(nome, idade, cpf);
                    jogadores.add(jogador);

                    System.out.println("Jogador cadastrado com sucesso!");
                    break;
            
                case 2:
                    System.out.println("Digite o cpf do jogador: ");
                    long cpf2 = sc.nextLong();

                    for (Jogador jogador2 : jogadores) {
                        if (jogador2.getCpf() == cpf2) {
                            System.out.println("Jogador encontrado!");
                            System.out.println(jogador2.toString());
                        }
                    }

                    break;
            
                case 3:
                    System.out.println("Saindo...");
                    break;
            
                default:
                    System.out.println("Opção Inválida!");
                    break;
            }

        } while (option != 3);

        sc.close();
    }

    public static void menu() {
        System.out.println("1.) Cadastro ");
        System.out.println("2.) Consultar");
        System.out.println("3.) Sair");
        System.out.println("\nInsira sua opção: ");
    }
}
