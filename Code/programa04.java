import java.util.Scanner;

public class programa04 { 
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        
        int num01;
        num01 = num.nextInt();

        String text01, text02, text03; 

        text01 = num.nextLine();
        text02 = num.nextLine();
        text03 = num.nextLine();

        System.out.println("DADOS DIGITADOS: ");
        System.out.println(" - " + text01);
        System.out.println(" - " + text02);
        System.out.println(" - " + text03);
        System.out.println(" - " + num01);

        num.close();
    
    }
}