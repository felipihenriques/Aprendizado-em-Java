package ExerciciosMedios;

import java.util.Scanner;

public class Exercicio06M {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantidades de ETAPAS: ");
        int x = sc.nextInt();
        int in = 0;
        int out = 0;

        for (int i=0; i<x; i++) {

            System.out.println("Insira o valor: ");
            x = sc.nextInt();

            if ( x >= 10 && x <= 20) {
                in = in + 1;
            }
            else {
                out = out + 1;
                
            }
        }
        System.out.println("Quantidade de IN: " + in);
        System.out.println("Quantidade de Out: " + out);
        sc.close();

    }
}
