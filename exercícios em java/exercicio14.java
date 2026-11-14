import java.util.Scanner;

public class exercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String d;
        d = "Dia da semana:";

        int diaDaSemana;
        
        System.out.println("Digite um dia da semana: ");
        diaDaSemana = sc.nextInt();
        

        if (diaDaSemana == 1) {
            System.out.println(d + " Segunda-feira");
        }
        else { 
            if (diaDaSemana == 2) { 
                System.out.println(d + " Terça-feira");
            }
            else { 
                if (diaDaSemana == 3)
                    System.out.println(d + " Quarta-feira");
            }
        }

        sc.close();
    } 
}