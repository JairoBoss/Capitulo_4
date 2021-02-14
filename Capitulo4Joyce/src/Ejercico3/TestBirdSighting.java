package Ejercico3;

public class TestBirdSighting {
    public static void main(String[] args) {
        BirdSighting paloma = new BirdSighting();

        System.out.println( paloma.getEspecie());

        BirdSighting cotorro = new BirdSighting("cotorro",12,87);

        System.out.println(cotorro.getEspecie());
        System.out.println(cotorro.getAvistamientos());
        System.out.println(cotorro.getDia());


    }
}
