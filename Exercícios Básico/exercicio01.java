
import java.util.Locale;

public class exercicio01 {
    public static void main(String[] args) {
        String nome = "Fabiana";
        int idade = 21;
        Locale.setDefault(Locale.US);
        double renda = 4000.50;

        System.out.printf("%s tem %d de idade é ganha R$%.2f reais %n", nome, idade, renda);

    }
}
