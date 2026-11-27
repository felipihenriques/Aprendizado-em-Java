package aplicativos.entidades;


// Eu preciso entender
public class Product {
    public String nome;
    public double preco; 
    public int quantidade;

    public double totalValeInStock() {
        return preco * quantidade;
    }

    public void addProducts(int quantidade) {
        this.quantidade += quantidade;
    }
    public void removeProducts(int quantidade) { 
        this.quantidade -= quantidade;
    }
}
