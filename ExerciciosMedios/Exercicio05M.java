package ExerciciosMedios;
import java.util.Scanner;

public class Exercicio05M {
    public static void main(String [] args) { 

        Scanner sc = new Scanner(System.in);

        int msg = sc.nextInt();

        for (int i=0; i<msg; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }



        sc.close();

    }
}