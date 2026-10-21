import java.util.Scanner;

public class Ejerciciot3_8{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce las horas trabajadas: ");
        double h = Double.parseDouble(sc.nextLine());
        double resultado = (h * 12);

        System.out.println("El salario semanal es: " + resultado);

        sc.close();
    }
}