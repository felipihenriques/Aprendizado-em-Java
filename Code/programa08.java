
import java.util.Scanner;

public class programa08 { 
    public static void main(String[] args ) { 
        Scanner sc = new Scanner(System.in); 
        int hora; 

        System.out.println("Qual o horário?");
        hora = sc.nextInt();

        if (hora < 12) {
            System.out.println("Olá, bom dia!");
        }

        else {
            
            if (hora < 18) { 
                System.out.println("Olá, boa tarde!"); 
            }

            else { 
                System.out.println("Olá, boa noite!");
            }
        }

        sc.close();
    }
}
