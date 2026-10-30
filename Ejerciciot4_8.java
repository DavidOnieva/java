import java.util.Scanner;

public class Ejerciciot4_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota1, nota2, nota3, media;
        System.out.print("Introduce la primera nota: ");
        nota1 = Double.parseDouble(sc.nextLine());
        System.out.print("Introduce la segunda nota: ");
        nota2 = Double.parseDouble(sc.nextLine());
        System.out.print("Introduce la tercera nota: ");
        nota3 = Double.parseDouble(sc.nextLine());
        media = (nota1 + nota2 + nota3) / 3;
        System.out.println("La media es: " + media);
        if (media < 5) {
            System.out.println("Insuficiente");
        } else if (media < 6) {
            System.out.println("Suficiente");
        } else if (media < 7) {
            System.out.println("Bien");
        } else if (media < 9) {
            System.out.println("Notable");
        } else {
            System.out.println("Sobresaliente");
        }
        sc.close();
    }
}