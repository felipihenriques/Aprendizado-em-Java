
import java.util.Locale;
import java.util.Scanner;

public class exercicio09 {
    public static void main(String [] args) { 
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        int peca01, peca02, quantidade01, quantidade02;
        double valor01, valor02, calculo01, calculo02, somar;

        peca01 = sc.nextInt();
        quantidade01 = sc.nextInt();
        valor01 = sc.nextDouble();

        peca02 = sc.nextInt();
        quantidade02 = sc.nextInt();
        valor02 = sc.nextDouble();



        calculo01 = (valor01 * quantidade01);
        calculo02 = (valor02 * quantidade02);
        somar = calculo01 + calculo02;
        System.out.printf("O VALOR TOTAL A PAGAR É: R$%.2f", somar);

        sc.close();
    }
}
