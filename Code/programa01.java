import java.util.Locale;

public class programa01 { 

    public static void main(String[] args) {
        int y = 20;
        double z = 10.8765;
        double x = 10.1234567890;

        System.out.println(y);

        System.out.printf("%.2f%n", z); // "%.2f%n" ou "%.4f%n"
        System.out.printf("%.4f%n", x);
        Locale.setDefault(Locale.US); // As funções que tiverem abaixo dele, mudarão de "," para "."
        System.out.printf("%.4f%n", x);

        System.out.println("Hello Word!"); 

        System.out.println("Hello Word é " + "igual Olá Mundo" ); //  O " + " soma as String
        System.out.printf("O resultado é %.2f%n " + "Hello", x);
    }
}

// %n = Ele quebra a linha 
// %f = Ponto flutuante. 

