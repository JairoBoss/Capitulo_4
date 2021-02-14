package Ejercicio5;

public class TestBread {
    public static void main(String[] args) {
        Bread bimbo = new Bread("Blanco",125.2);
        System.out.println(Bread.MOTTO);
        System.out.println(bimbo.getPan());
        System.out.println(bimbo.getCalorias());
    }
}
