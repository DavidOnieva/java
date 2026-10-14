package Ejerciciost3;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Introduce un número decimal: ");
        double numeroDecimal1 = Double.parseDouble(s.nextLine());
        
        System.out.print("Introduce otro número decimal: ");
        double numeroDecimal2 = Double.parseDouble(s.nextLine());
        
        double resultado = numeroDecimal1 * numeroDecimal2;
        
        System.out.println("El resultado es: " + resultado);
        s.close();
        }
    }