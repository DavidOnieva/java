import java.util.Scanner;

public class Ejerciciot3_12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce la nota en el primer examen: ");
        double ne1 = Double.parseDouble(sc.nextLine());
        System.out.print("Introduce la nota que quieres sacar en el trimestre: ");
        double nt = Double.parseDouble(sc.nextLine());

        double ne2 = (nt - ne1 * 0.4) / 0.6;

        System.out.printf("Nota necesaria en el segundo examen: %.2f%n", ne2);

        sc.close();
    }
}