// Exercício 01  


import java.util.Scanner;

public class exercicio05 { 
    public static void main(String [] args ) {
        Scanner sc = new Scanner(System.in);

        int valorA, valorB, resultado; 
        valorA = sc.nextInt();
        valorB = sc.nextInt();
        resultado = valorA + valorB;

        System.out.printf("A soma dos valores %d + %d = %d", valorA, valorB, resultado);
        sc.close();
        
    }
}