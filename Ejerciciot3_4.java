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
        System.out.println("El resultado de la suma es: " + sum);
        System.out.println("El resultado de la resta es: " + rest);
        System.out.println("El resultado de la multiplicación es: " + mult);
        System.out.println("El resultado de la división es: " + div);

        sc.close();
    }
}