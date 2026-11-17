// Exercício 02

import java.util.Locale;
import java.util.Scanner;

public class exercicio06 {
    public static void main(String [] args) { 
        Scanner sc = new Scanner(System.in);
        double area, pergunta, pi, raio;
        Locale.setDefault(Locale.US);

        pi = Math.PI; 
        pergunta = sc.nextDouble();
        raio = Math.pow(pergunta, 2.0);
        area = pi * raio;

        System.out.printf("O resultado da área é: %.4f", area);

        sc.close();

    }
}