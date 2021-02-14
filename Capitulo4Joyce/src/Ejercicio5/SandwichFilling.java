package Ejercicio5;

public class SandwichFilling {
    private String relleno;
    private Double calorias;

    public SandwichFilling(String relleno, Double calorias) {
        this.relleno = relleno;
        this.calorias = calorias;
    }

    public String getRelleno() {
        return relleno;
    }

    public void setRelleno(String relleno) {
        this.relleno = relleno;
    }

    public Double getCalorias() {
        return calorias;
    }

    public void setCalorias(Double calorias) {
        this.calorias = calorias;
    }
}
