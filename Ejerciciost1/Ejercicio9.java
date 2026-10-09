public class Ejercicio9 {
    public static void main(String[] args) {

        String rojo = "\033[31m";
        String amarillo = "\033[33m";
        String azul = "\033[34m";
        String gris = "\033[37m";
        String reset = "\033[0m";

        System.out.println(rojo + "         /\\");
        System.out.println("        /  \\");
        System.out.println("       /____\\" + reset);

        System.out.println(amarillo + "      |      |");
        System.out.println("      |  " + azul + "[]" + amarillo + "  |");
        System.out.println("      |      |");
        System.out.println("      |______|" + reset);

        System.out.println(gris + "         ||");
        System.out.println("         ||" + reset);
    }
}
