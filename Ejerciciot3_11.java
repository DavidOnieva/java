import java.util.Scanner;

public class Ejerciciot3_11 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Introduce cuantos KB tienes: ");
        double kb = Double.parseDouble(s.nextLine());

        double resultado = kb / 1024;

        System.out.printf(" MB: %.2f%n", resultado);

        s.close();
    }
}