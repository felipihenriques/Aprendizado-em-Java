package CodeMedios;

import java.util.Scanner;

public class For {
    public static void main(String [] args ) { 

        Scanner scr = new Scanner(System.in);

        int n, soma; 
        System.out.println("Quantidades de ETAPAS escolhidas:");
        n = scr.nextInt();
        soma = 0;

        for (int i=0; i<n; i = i + 1) {  // I ele determina a quantidade de repetições
            System.out.println("ETAPAS: ");
            int x = scr.nextInt();
            soma = soma + x;
        }

        System.out.println(soma);
    }
}
