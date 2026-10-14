import java.util.Scanner;

public class LeerTeclado {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce un número entero: ");
        int numeroEntero =  Integer.parseInt(teclado.nextLine());

        System.out.print("Introduce un número con decimales: ");
        double numeroDecimal1 = Double.parseDouble(teclado.nextLine());
        double numeroDecimal2 = Double.parseDouble(teclado.nextLine());
        System.out.print("Introduce tu nombre: ");
        String nombre = teclado.nextLine();

        System.out.println("Entero: " + (numeroEntero + numeroEntero));
        System.out.println("Decimal: " + (numeroDecimal1 + numeroDecimal2));
        System.out.println("Nombre: " + nombre);

        teclado.close();
    }
}
