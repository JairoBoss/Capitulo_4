package Ejercicio5;

public class TestSandwich {
    public static void main(String[] args) {

        Bread bolillo = new Bread("Bolillo",132.3);
        SandwichFilling quesillo = new SandwichFilling("Quesillo",32.1);
        Sandwich chanwich = new Sandwich(bolillo,quesillo);

        chanwich.getPan();
        bolillo.setPan("Bimbo");
        chanwich.getPan();

    }
}
