import java.util.Locale;

public class exercicio02 { 
    public static void main(String[] args) {
        String produto01 = "Computador";
        String produto02 = "Mesa de escritório"; 

        int age = 30;
        int coder = 5290;
        char gender = 'F';

        double preco01 = 2100.00;
        double preco02 = 650.50;
        double measure = 53.09743;
        Locale.setDefault(Locale.US);
        double measure02 = measure;
        

        System.out.printf("Produtos: %nO %s, custa o valor de R$%.2f%nA %s, custa o valor de R$%.2f%n", produto01, preco01, produto02, preco02);
        System.out.printf("Record: %d anos de idade, código: %d, sexo: %s%n", age, coder, gender);
        System.out.printf("Measure normal: %f%nMeasure arendondada: %.3f%nMeasure point: %f", measure, measure,  measure02);
    }
}