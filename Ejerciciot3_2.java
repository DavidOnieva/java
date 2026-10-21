import java.util.Scanner;

public class Ejerciciot3_2 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Introduce cuantos euros tienes: ");
        double euros = Double.parseDouble(s.nextLine());

        double resultado = euros * 166.38;

        System.out.printf("pesetas: %.2f%n", resultado);

        s.close(); 
    }
}