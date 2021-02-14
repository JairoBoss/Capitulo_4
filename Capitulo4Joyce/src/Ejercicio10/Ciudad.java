package Ejercicio10;

public class Ciudad {
    private String capital;
    private Integer habitantes;

    public Ciudad(String capital, int habitantes){
        this.capital = capital;
        this.habitantes = habitantes;
    }

    public String getCapital() {
        return capital;
    }

    public Integer getHabitantes() {
        return habitantes;
    }
}
