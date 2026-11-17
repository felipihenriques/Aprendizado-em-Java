public class exercicio04 {
    public static void main(String[] args) {
        double a, b, c;
        a = 1;
        b = 2;
        c = 8;

        double delta;

        delta = -b + Math.pow(b, 2) - 4 * a * c;

        double x1, x2;
        x1 = (-b + Math.sqrt(delta)) / 2.0 * a;
        x2 = (-b + Math.sqrt(delta)) / 2.0 * a;

        System.out.println(x1);
        System.out.println(x2);
    }
}