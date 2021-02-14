package Ejercicio2;

public class Main {
    public static void main(String[] args) {
        Billing libro = new Billing();

        System.out.println(libro.computeBill(10));
        System.out.println(libro.computeBill(10,2));
        System.out.println(libro.computeBill(10,2,50));
    }
}
