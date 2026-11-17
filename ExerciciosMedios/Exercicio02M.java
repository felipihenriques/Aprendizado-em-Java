package ExerciciosMedios;

import java.util.Scanner;

public class Exercicio02M {

    public static void main(String [] args) {
        Scanner pgr = new Scanner(System.in);

        int saldo = 1000;
        int opcao = 0;

        while (opcao != 4) { // Inicio

        System.out.println("[1] - Sacar");
        System.out.println("[2] - Depositar");
        System.out.println("[3] - Consultar conta");
        System.out.println("[4] - Sair");
        System.out.println("Escolha a opção: ");
        opcao = pgr.nextInt();

            if (opcao == 1) {

                System.out.println("Informe o valor para saque: ");
                int sacar = pgr.nextInt();
                saldo = saldo - sacar;

                System.out.println("Você realiazou o saque com sucesso!"); 

            }

            else if (opcao == 2) {

                System.out.println("Informe o valor para deposito: ");
                int deposito = pgr.nextInt();
                
                saldo = saldo + deposito;
                System.out.println("Você realiazou o deposito com sucesso!"); 
            }

            else if (opcao == 3) {
                int Consultar = saldo;
                System.out.println("Conta Bancária: " + Consultar);
            }

            //System.out.println("Escolha a opção: ");
            //opcao = pgr.nextInt();

        }

        System.out.print("Sistema Encerrado!");
        pgr.close();

    }
}
