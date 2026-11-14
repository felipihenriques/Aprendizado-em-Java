
import java.util.Scanner;

public class exercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A, B;
        
        System.out.println("Primeiro valor: ");
        A = sc.nextInt();

        System.out.println("Segundo valor: ");
        B = sc.nextInt();

        if (A % B == 0 || B % A == 0) {
            System.out.println("São Multiplico");
            
        }
        else { 
            System.out.println("Não é multiplico");
        }

        sc.close();
    }
}
