package ExerciciosMedios;

import java.util.Scanner;

public class SistemaErroSenha {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);

        int tentativa = 3;
        int contador = 0;

        System.out.println("Digite a senha: ");
        int senha = sc.nextInt();

        if (senha == 123) {
            System.out.println("Acesso foi liberado");
        }

        else {
            for (int i=0; i < tentativa; i++ ) {
                contador = contador + 1;
                System.out.println(" Informe a senha novamente " + contador);
                senha = sc.nextInt();
            }

            if (senha == 123) {
                System.out.println("Acesso foi liberado");
            }
            else {
                System.out.println("Acesso BLOQUEADO!");
            }
        }
        sc.close();
    }
}
