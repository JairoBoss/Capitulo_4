package EjercicioUno;

public class FormLetterWriter {

    public void displaySalutation(String name){
        System.out.println("Estimado señor o señora "+ name);
        System.out.println("Gracias por su pedido reciente");
    }

    public void displaySalutation(String x, String y){
        System.out.println("Estimado " + x + " " + y );
        System.out.println("Gracias por su pedido reciente");
    }
}
