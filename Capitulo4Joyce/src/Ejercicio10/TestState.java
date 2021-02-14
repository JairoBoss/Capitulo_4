package Ejercicio10;

public class TestState {
    public static void main(String[] args) {
        Estado oaxaca = new Estado("Oaxaca",900,"Oaxaca de juarez",120,"Candiani",123);

        System.out.println(oaxaca.getNombre());
        System.out.println(oaxaca.getPoblacion());

        System.out.println(oaxaca.getNombreCapital());
        System.out.println(oaxaca.getHabitantesCapital());

        System.out.println(oaxaca.getNombreMasPoblada());
        System.out.println(oaxaca.getHabitantesMasPoblada());


    }

}
