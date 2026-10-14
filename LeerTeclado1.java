import java.util.Scanner;

public class LeerTeclado1 {
    
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce un número entero: ");
        int numeroEntero =  teclado.nextInt();

        System.out.print("Introduce un número con decimales: ");
        double numeroDecimal1 = teclado.nextDouble();
        double numeroDecimal2 = teclado.nextDouble(); 
        System.out.print("Introduce tu nombre: ");
        String nombre = teclado.nextLine();

        System.out.println("Entero: " + (numeroEntero + numeroEntero));
        System.out.println("Decimal: " + (numeroDecimal1 + numeroDecimal2));
        System.out.println("Nombre: " + nombre);

        teclado.close();
    }
}
