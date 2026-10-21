    import java.util.Scanner;
    public class Ejerciciot3_9 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Introduce el radio: ");
            double r = Double.parseDouble(sc.nextLine());

            System.out.print("Introduce la altura: ");
            double h = Double.parseDouble(sc.nextLine());

            double resultado = (1.0/3)*h*Math.PI*Math.pow(r,2);

            System.out.printf("El volumen del cono es: %.2f%n", resultado);

            sc.close();
        }
    }