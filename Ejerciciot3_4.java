import java.util.Scanner;

public class Ejerciciot3_4 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el primer número: ");
        double num1 = Double.parseDouble(sc.nextLine());

        System.out.print("Introduce el segundo número: ");
        double num2 = Double.parseDouble(sc.nextLine());

        double sum = num1 + num2;
        double rest = num1 - num2;
        double mult = num1 * num2;
        double div = num1 / num2;
        System.out.printf("El resultado de la suma es: %.2f%n", sum);
        System.out.printf("El resultado de la resta es: %.2f%n", rest);
        System.out.printf("El resultado de la multiplicación es: %.2f%n", mult);
        System.out.printf("El resultado de la división es: %.2f%n", div);

        sc.close();
    }
}