package Ejercicio4;

public class TestBloodData {
    public static void main(String[] args) {
        BloodData persona = new BloodData();
        System.out.println(persona.getTipoDeSangre());
        System.out.println(persona.getFactor());

        persona.setTipoDeSangre("A");
        persona.setFactor('-');

        System.out.println(persona.getTipoDeSangre());
        System.out.println(persona.getFactor());
    }
}
