// Exercício 2: Soma de números

import java.util.Scanner;

public class exercicio18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número:");
        int numero = sc.nextInt();

        int somar = 0;

        while (numero != 0) {
            System.out.println("Digite o número: ");
            numero = sc.nextInt();
            somar += numero;
        }

        System.out.println("Total de tentativas: " + somar);
        sc.close();
    }
}
