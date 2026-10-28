public class OperadoresLogicos02 {
public static void main(String[] args) {
boolean a = true;
boolean b = false;
boolean c = false;
System.out.println("a = " + a);
System.out.println("b = " + b);
System.out.println("c = " + c);
System.out.println("a && b = " + (a && b));
System.out.println("a && c = " + (a && c));
System.out.println("b && c = " + (b && c));
System.out.println("a || b = " + (a || b));
System.out.println("a || c = " + (a || c));
System.out.println("b || c = " + (b || c));
System.out.println("a || b || c = " + (a || b || c));
System.out.println("!a = " + !a);
System.out.println("a || (6 > 10) = " + (a || (6 > 10)));
System.out.println("((4 <= 4) || false) && (!a) = " + (((4 <= 4) || false) && (!a)));
System.out.println("((1 <= 4) && true) && (!c) = " + (((1 <= 4) && true) && (!c)));
}
}