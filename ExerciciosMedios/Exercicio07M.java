package ExerciciosMedios;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio07M {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        Locale.setDefault(Locale.US);

        System.out.println("Informe a quantidade de repetidores: ");
        int N = sc.nextInt();

        for (   int i=0; i<N; i++   ) {

            double a, b, c, resultado;

            System.out.println("Valor A: ");
            a = sc.nextDouble();

            System.out.println("Valor B: ");
            b = sc.nextDouble();

            System.out.println("Valor C: ");
            c = sc.nextDouble();

            resultado = (a * 2.0 + b * 3.0 + c * 5.0) / 10.0;

            System.out.printf("%.1f%n ", resultado);
        }
        sc.close(); 
    }
}
