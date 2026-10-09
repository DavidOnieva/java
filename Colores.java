public class Colores {
public static void main(String[] args) {
String rojo = "\033[31m";
String verde = "\033[32m";
String naranja = "\033[33m";
String azul = "\033[34m";
String morado = "\033[35m";
String blanco = "\033[37m";
String cian = "\033[36m";
String gris = "\033[30m";
System.out.print(naranja + "mandarina" + verde + " hierba");
System.out.print(naranja + " saltamontes" + rojo + " tomate");
System.out.print(blanco + " sábanas" + azul + " cielo");
System.out.print(morado + " nazareno" + azul + " mar");
System.out.print(cian + " jaden" + gris + " ñañi");
System.out.print(cian + " ña" + gris + " \u00F1 ñi");
}
}