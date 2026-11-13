import java.util.Scanner;

public class exercicio11 { 
    public static void main(String [] args ) { 
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");

        double number;

        number = sc.nextDouble();

        if (number < 0) { 
            System.out.println("O valor digitado é: " + number + ", NEGATIVO! ");
        }
        else { 
            System.out.println("O valor digitado é: " + number + ", POSITIVO!");
        }

    }
}