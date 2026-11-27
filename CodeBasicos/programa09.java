package codebasicos;

public class programa09 {
    public static void main(String[] args) { 
        double preco, desconto;

        preco = 34.50; 

        if (preco < 20.00) { 
            desconto = preco *  0.1;
            System.out.println("O desconto aplicado foi de R$ " + desconto); 
        }
        else { 
            desconto = preco * 0.5;
            System.out.println("O desconto aplicado foi de R$ " + desconto);
        }

        }
    }