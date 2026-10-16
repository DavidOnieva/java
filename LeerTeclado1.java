import java.util.Scanner;

public class LeerTeclado1 {
    
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
            System.out.print("Introduce un número entero: ");
            int numeroEntero =  teclado.nextInt();
            
            System.out.print("Introduce dos números con decimales: ");
            double numeroDecimal1 = teclado.nextDouble();
            double numeroDecimal2 = teclado.nextDouble();
            //Los numeros decimales con comas, no puntos.
            System.out.print("Introduce tu nombre: ");
            String nombre = teclado.nextLine();
            /*Al poner nextInt() y nextDouble() no hace falta poner parse pero la siguiente línea de código no funciona correctamente porque
            nextInt() y nextDouble() arrastra el salto de línea, por lo que al poner nextLine() después de ellos, este se salta la lectura del nombre.*/
            System.out.println("Entero: " + (numeroEntero + numeroEntero));
            System.out.println("Decimal: " + (numeroDecimal1 + numeroDecimal2));
            System.out.println("Nombre: " + nombre);
        }
    }

