package aplicativos;

import aplicativos.entidades.Product;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Product product = new Product();
        IO.println("Digite os produtos: ");
        IO.println("Nome: ");
        product.nome = sc.nextLine();
        IO.println("Preço: ");
        product.preco = sc.nextDouble();
        IO.println("Quantidade em estoque: ");
        product.quantidade = sc.nextInt();

        IO.println("Produto: " + product.nome + ", Preço: " + product.preco + ", Quantidade: " + product.quantidade);



        sc.close();
    }
}
