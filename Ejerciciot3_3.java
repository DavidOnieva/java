import java.util.Scanner;

public class Ejerciciot3_3 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Introduce cuantas pesetas tienes: ");
        double pesetas = Double.parseDouble(s.nextLine());

        double resultado = pesetas / 166.38;

        System.out.println("El resultado es: " + resultado);

        s.close(); 
    }
}