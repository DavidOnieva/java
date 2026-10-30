import java.util.Scanner;
public class Ejerciciot4_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double horas, salario;

        System.out.print("Introduce las horas trabajadas esta semana: ");
        horas = Double.parseDouble(sc.nextLine());

        if (horas <= 40) {
            salario = horas * 12;
        } else {
            salario = (40 * 12) + ((horas - 40) * 16);
        }

        System.out.println("El salario semanal es: " + salario + " euros");

        sc.close();
    }
}
