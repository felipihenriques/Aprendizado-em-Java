
import java.util.Scanner;
public class programa03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String x;
        int y; 
        double z; 

        x = sc.next();
        y = sc.nextInt();
        z = sc.nextDouble();

        System.out.println("O resultado da texto: " + x);
        System.out.println("O resultado do inteiro: " + y);
        System.out.println("O resultado do flutuante: " + z);
        
        sc.close();
    }
}