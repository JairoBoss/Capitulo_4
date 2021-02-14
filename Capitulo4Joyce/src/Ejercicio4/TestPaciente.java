package Ejercicio4;

public class TestPaciente {
    public static void main(String[] args) {
        Paciente jairo = new Paciente();

        jairo.getSangre();
        System.out.println(jairo.getEdad());

        Paciente esteban = new Paciente(123,45,"A",'-');
        esteban.getSangre();
        System.out.println(esteban.getId());
    System.out.println(esteban.getEdad());
    }
}
