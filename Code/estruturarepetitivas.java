import java.util.Scanner;

public class estruturarepetitivas { 
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in); 

        int x = sc.nextInt();

        int somar = 0;

        while (x != 0) {
            somar += x; // Isso é um contador
            System.out.println("Digite outro número: ");
            x = sc.nextInt();
        }

        System.out.println("A quantidades de tentativas foram: "  + somar);

        sc.close();
    }
}