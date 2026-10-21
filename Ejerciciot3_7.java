import java.util.Scanner;

public class Ejerciciot3_7{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la base imponible: ");
        double base = Double.parseDouble(sc.nextLine());
        double resultado = (base * 1.21);

        System.out.println("El importe total con IVA es: " + resultado);

        sc.close();
    }
}