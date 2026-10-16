import java.util.Scanner;

public class Ejerciciot3_1 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el primer número: ");
        int num1 = sc.nextInt();

        System.out.print("Introduce el segundo número: ");
        int num2 = sc.nextInt();

        int resultado = num1 * num2;

        System.out.println("El resultado de la multiplicación es: " + resultado);

        sc.close();
    }
}