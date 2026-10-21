import java.util.Scanner;

public class Ejerciciot3_10 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Introduce cuantos MB tienes: ");
        double mb = Double.parseDouble(s.nextLine());

        double resultado = mb * 1024;

        System.out.printf(" KB: %.2f%n", resultado);

        s.close();
    }
}