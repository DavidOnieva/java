import java.util.Scanner;

public class Ejerciciot3_5 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce la base: ");
        double b = Double.parseDouble(sc.nextLine());

        System.out.print("Introduce la altura: ");
        double h = Double.parseDouble(sc.nextLine());

        double resultado = b * h;

        System.out.printf("El área del rectángulo es: %.2f%n", resultado);

        sc.close();
    }
}