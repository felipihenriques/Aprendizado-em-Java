// Exercício 1: Contagem regressiva
package ExercicioBasicos;
import java.util.Scanner;

public class exercicio17 {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número:");
        int number = sc.nextInt();


        while (number > 0) { 
            System.out.println(number);

            number -= 1;
        }
        System.out.println("Fim!!");
        sc.close();
    }
}