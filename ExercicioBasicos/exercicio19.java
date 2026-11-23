package ExercicioBasicos;

public class exercicio19 {
    public static void main(String[] args) {
        String original = "abcde FHGIJ klmn OPQ ro         ";

        String lower = original.toLowerCase();
        String upper = original.toUpperCase();
        String trim = original.trim();
        String sub = original.substring(2); // Um argumento
        String sub2 = original.substring(2, 10);

        char Char = original.charAt(0); // Imprimi a letra A

        System.out.println("Original: " + original);
        System.out.println("ToLowerCase: " + lower);
        System.out.println("ToUpperCase: " + upper);
        System.out.println("trim: " + trim);
        System.out.println("char: " + Char);
        System.out.println("substring: " + sub);
        System.out.println("substring[2]: " + sub2);
    }
}