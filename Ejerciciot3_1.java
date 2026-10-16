import java.util.Scanner;

public class Ejerciciot3_1 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el primer número: ");
        double num1 = Double.parseDouble(sc.nextLine());

        System.out.print("Introduce el segundo número: ");
        double num2 = Double.parseDouble(sc.nextLine());

        double resultado = num1 * num2;

        System.out.println("El resultado de la multiplicación es: " + resultado);

        sc.close();
    }
}