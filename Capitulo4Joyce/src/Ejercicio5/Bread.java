package Ejercicio5;

public class Bread {

    public static final String MOTTO = "El personal de la vida";
    private String pan;
    private Double calorias;


    public Bread(String pan, Double calorias){
        this.pan = pan;
        this.calorias = calorias;
    }

    public String getPan() {
        return pan;
    }

    public void setPan(String pan) {
        this.pan = pan;
    }

    public Double getCalorias() {
        return calorias;
    }

    public void setCalorias(Double calorias) {
        this.calorias = calorias;
    }
}
