public class Main {
    public static void main(String[] args) {

        int dia1 = 120;
        int dia2 = 80;
        int dia3 = 150;
        int dia4 = 90;
        int dia5 = 200;

        int total = 0;
        int diasBuenos = 0;

        for (int i = 1; i <= 5; i++) {

            int ventas = 0;

            if (i == 1) {
                ventas = dia1;
            } else if (i == 2) {
                ventas = dia2;
            } else if (i == 3) {
                ventas = dia3;
            } else if (i == 4) {
                ventas = dia4;
            } else {
                ventas = dia5;
            }

            System.out.println("Día: " + i);
            System.out.println("Ventas: " + ventas + " euros");

            total += ventas;

            if (ventas > 100) {
                diasBuenos++;
                System.out.println("Buenas ventas");
            } else {
                System.out.println("Ventas bajas");
            }

            System.out.println("Total acumulado: " + total);
            System.out.println("-------------------");
        }

        double media = (double) total / 5;

        System.out.println("Total de ventas: " + total);
        System.out.println("Días buenos: " + diasBuenos);
        System.out.println("Media diaria: " + media);
    }
}

