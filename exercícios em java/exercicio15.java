import java.util.Scanner;

public class exercicio15 {
    public static void main(String[] args ) {
        Scanner sc = new Scanner(System.in); 

        int senha_acess, senha_autoriz;

        senha_autoriz = 1234;

        System.out.println("Digite a senha: ");
        senha_acess = sc.nextInt();

        while (senha_acess != senha_autoriz) { 
            System.out.println("Senha Invalida!!");
            senha_acess = sc.nextInt();
        }
        System.out.println("Acesso Permitido!");
        sc.close();
    }
}