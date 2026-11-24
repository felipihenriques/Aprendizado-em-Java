package ExercicioBasicos;

public class exercicio19 {
    public static void main(String[] args) {
        String original = "abbbbcde FHGIJ klmn OPQ ro bc      ";

        String lower = original.toLowerCase();
        String upper = original.toUpperCase();
        String trim = original.trim();
        String sub = original.substring(2); // Um argumento
        String sub2 = original.substring(2, 10); // ele vai pegar index 2 início(c) até os caracteres 10 Fim(FHGI)

        char Char = original.charAt(0); // Imprimi a letra A


        // Replace --> Substituir 
        String replace01 = original.replace("a", "P");
        String replace02 = original.replace("abcd", "felipi");
        String repleceall = original.replaceAll("b", "TT");

        // Outros
        int index = original.indexOf("bc");
        int index2 = original.lastIndexOf("bc");


        // Split
        String original02 = "potato,apple,lemon,android";
        // index:              0       1       2

        String[] vect = original02.split(","); // Ele só vai imprimir o que está entre virgulas 
        //String word1 = vect[0]; // Imprimir = potato
        //String word2 = vect[1]; // imprimiir = apple
        //String word3 = vect[2]; // imprimir = lemon
        //String word4 = vect[3]; // imprimir = lemon



        System.out.println("Original: " + original);
        System.out.println("ToLowerCase: " + lower);
        System.out.println("ToUpperCase: " + upper);
        System.out.println("trim: " + trim);
        System.out.println("char: " + Char);
        System.out.println("substring: " + sub);
        System.out.println("substring[2]: " + sub2);
        System.out.println("replece: " + replace01);
        System.out.println("replece 02: " + replace02);
        System.out.println("repleceAll: " + repleceall);
        System.out.println("IndexOf: " + index);
        System.out.println("LastIndexOf: " + index2);

        System.out.println(vect[0]);
        System.out.println(vect[1]);
        System.out.println(vect[2]);
        System.out.println(vect[3]);
    }
}