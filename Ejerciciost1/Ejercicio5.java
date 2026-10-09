public class Ejercicio5 {
    public static void main(String[] args) {
        String rojo = "\033[31m";
        String verde = "\033[32m";
        String azul = "\033[34m";
        String morado = "\033[35m";
        String celeste = "\033[36m";
        String blanco = "\033[37m";
        System.out.println(azul + "Lunes\tMartes\tMiérc.\tJueves\tViernes");
        System.out.println("======\t=======\t======\t======\t=======");
        System.out.println(verde + "PROG\tPROG\tPROG\tPROG" + rojo + "\tSIN");
        System.out.println(verde + "PROG\tPROG\tPROG\tPROG" + rojo + "\tSIN");
        System.out.println(celeste + "ED" + rojo + "\tSIN\tSIN" + blanco + "\tLM" + morado + "\tBDATO");
        System.out.println(azul + "FOL" + rojo + "\tSIN\tSIN" + blanco + "\tLM" + morado + "\tBDATO");
        System.out.println(azul + "FOL" + morado + "\tBDATO" + celeste + "\tED" + morado + "\tBDATO" + celeste + "\tED");
        System.out.println(azul + "FOL" + morado + "\tBDATO" + celeste + "\tED" + morado + "\tBDATO" + celeste + "\tED");
    }
}
