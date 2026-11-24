package ExercicioBasicos;

import java.util.Scanner;


public class exercicio21 { 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 

        System.out.println("Informe o valor de A: ");
        int a = sc.nextInt();

        System.out.println("Informe o valor de B: ");
        int b = sc.nextInt();

        System.out.println("Informe o valor de C: ");
        int c = sc.nextInt();

        int higher = max( a, b, c );

        ShowResult(higher);

        sc.close();
    }

    public static int max(int x, int y, int z) {
        int aux;
        
        if (x > y && x > z) {
            aux = x;
        }

        else if (y > z) {
            aux = y; 
        }

        else { 
            aux = z;
        }
        return aux; 
    }
    public static void ShowResult(int value) { 
        System.out.println("Higher = " + value);
    }
}

