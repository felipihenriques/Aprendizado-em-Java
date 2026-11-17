package ExerciciosMedios;
import java.util.Scanner;

public class Exercicio01M {
    public static void main(String [] args) {

        Scanner escanear = new Scanner(System.in);

        System.out.println("Etapa 01: ");
        int n = escanear.nextInt();

        int soma = 0; 

        for (int i=0; i<n; i= i + 1) {

            System.out.println("Etapa 02: ");
            int x = escanear.nextInt();
            soma = soma + x;
        }
         
        System.out.println("TEST: " + soma);

        escanear.close();
    }
}