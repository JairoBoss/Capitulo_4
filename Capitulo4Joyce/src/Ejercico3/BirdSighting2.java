package Ejercico3;

public class BirdSighting2 {

    private String especie;
    private Integer avistamientos;
    private Integer dia;

    public BirdSighting2(String especie,int avistamientos, int dia ){
        this.especie = especie;
        this.avistamientos = avistamientos;
        this.dia = dia;
    }

    public String getEspecie() {
        return especie;
    }

    public Integer getAvistamientos() {
        return avistamientos;
    }

    public Integer getDia() {
        return dia;
    }
}
