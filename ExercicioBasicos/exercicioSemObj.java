package ExercicioBasicos;

import java.util.Locale;
import java.util.Scanner;

public class exercicioSemObj {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        double xA, xB, xC, yA, yB, yC; 

        System.out.println("Enter the measures of triangle X: ");

        System.out.println("Informe o valor xA: ");
        xA = sc.nextDouble();

        System.out.println("Informe o valor xB: ");
        xB = sc.nextDouble();

        System.out.println("Informe o valor xC: ");
        xC = sc.nextDouble();

        System.out.println("Enter the measures of triangle Y: ");

        System.out.println("Informe o valor yA: ");
        yA = sc.nextDouble();

        System.out.println("Informe o valor yB: ");
        yB = sc.nextDouble();

        System.out.println("Informe o valor yB: ");
        yC = sc.nextDouble();

        double p = (xA + xB + xC) / 2.0;
        double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));

        p = (yA + yB + yC) / 2.0;
        double areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));

        System.out.printf("Triangle X area: %.4f%n ", areaX);
        System.out.printf("Triangle Y area: %.4f%n ", areaY);

        if (areaX > areaY) {
            System.out.println("Larger área: X");
        }
        else {
            System.out.println("Larger área: Y");
        }

        sc.close();
    }
}