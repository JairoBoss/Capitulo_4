package Ejercicio5;

public class Sandwich {
    private Bread pan;
    private SandwichFilling relleno;

    public Sandwich(Bread pan, SandwichFilling relleno) {
        this.pan = pan;
        this.relleno = relleno;
    }

    public void getPan() {
        System.out.println(pan.getPan());
    }

    public void setPan(Bread pan) {
        this.pan = pan;
    }


}
