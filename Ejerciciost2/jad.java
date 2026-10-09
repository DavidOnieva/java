import java.util.Scanner;
public class jad {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce un número entero: ");
        int numeroEntero = teclado.nextInt();

        System.out.print("Introduce un número con decimales: ");
        double numeroDecimal = teclado.nextDouble();

        teclado.nextLine(); // Limpiar el salto de línea

        System.out.print("Introduce tu nombre: ");
        String nombre = teclado.nextLine();

        System.out.println("Entero: " + (numeroEntero + numeroEntero));
        System.out.println("Decimal: " + numeroDecimal);

        teclado.close();
    }
}
