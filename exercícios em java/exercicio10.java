import java.util.Locale;
import java.util.Scanner;

public class exercicio10 { 
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        double a, b, c;

        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        double triangulo, circulo, trapezio, quadrado, retangulo;
        triangulo = a * c / 2;
        circulo = Math.pow(c, 2) * Math.PI;
        trapezio = (a + b) * c / 2;
        quadrado = Math.pow(b, 2);
        retangulo = a * b;

        // Calculo
        System.out.println("DADOS DAS FORMAS GEOMÉTRICAS:");
        System.out.printf("TRIÂNGULO: %.3f%n", triangulo);
        System.out.printf("CIRCULO: %.3f%n", circulo);
        System.out.printf("TRAPÉZIO: %.3f%n", trapezio);
        System.out.printf("QUADRADO: %.3f%n", quadrado);
        System.out.printf("RETÂNGULO: %.3f%n", retangulo);
        sc.close();
    }
}