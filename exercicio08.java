// Exercício 04
import java.util.Locale;
import java.util.Scanner;

public class exercicio08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        int cracha;
        double salario, he, calculo;
        String nome;

        cracha = sc.nextInt();
        nome = sc.next();
        salario = sc.nextDouble();
        he = sc.nextDouble();

        calculo = salario * he;

        System.out.println("DADOS DO FUNCIONÁRIO:");
        System.out.println("Crachá: " + cracha);
        System.out.println("Nome: " + nome);
        System.out.println("Sálario: " + salario);
        System.out.println("Hora Extra: " + he);
        System.out.println("O VALOR A RECEBER DE HORA EXTRA É: " + calculo);

        sc.close();

    }
}
