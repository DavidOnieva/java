import java.util.Scanner;
public class Ejerciciot4_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce una hora del día (0-23): ");
        int hora = Integer.parseInt(sc.nextLine());
        if (hora >= 6 && hora <= 12) {
            System.out.println("Buenos días");
        } else if (hora >= 13 && hora < 20) {
            System.out.println("Buenas tardes");
        } else if (hora >= 21 || hora <= 5) {
            System.out.println("Buenas noches");
        } else {
            System.out.println("Hora no válida");
        }
        sc.close();
    }
}
