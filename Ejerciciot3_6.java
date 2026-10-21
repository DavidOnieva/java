import java.util.Scanner;

public class Ejerciciot3_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la base: ");
        double b = Double.parseDouble(sc.nextLine());

        System.out.print("Introduce la altura: ");
        double h = Double.parseDouble(sc.nextLine());

        double resultado = (b * h)/2;

        System.out.printf("El área del triángulo es: %.2f%n", resultado);

        sc.close();
    }
}