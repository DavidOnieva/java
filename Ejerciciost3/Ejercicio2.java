package Ejerciciost3;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Introduce cuantos euros tienes: ");
        double euros = Double.parseDouble(s.nextLine());

        double resultado = euros * 166.38;

        System.out.println("El resultado es: " + resultado);

        s.close(); 
    }
}