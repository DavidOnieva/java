public class LeerTeclado2 {
    public static void main(String[] args){
        System.out.print("Introduce un número entero: ");
        int numeroEntero = Integer.parseInt(System.console().readLine());

        System.out.print("Introduce el primer número con decimales: ");
        double numeroDecimal1 = Double.parseDouble(System.console().readLine());

        System.out.print("Introduce el segundo número con decimales: ");
        double numeroDecimal2 = Double.parseDouble(System.console().readLine());

        System.out.print("Introduce tu nombre: ");
        String nombre = System.console().readLine();

        System.out.println("Entero: " + (numeroEntero + numeroEntero));
        System.out.println("Decimal: " + (numeroDecimal1 + numeroDecimal2));
        System.out.println("Nombre: " + nombre);
    }
}