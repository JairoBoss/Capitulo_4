package Ejercicio6;

public class Circle {
    private Double radio;
    private Double diametro;
    private Double area;

    public Circle (){
        this.radio = 1.0;
        area = area();
    }

    public Double area(){
        return Math.PI*radio*radio;
    }

    public void setRadio(Double radio) {
        this.radio = radio;
    }

    public Double getDiametro() {
        return diametro;
    }

    public void setDiametro(Double diametro) {
        this.diametro = diametro;
    }

    public Double getArea() {
        return this.area;
    }

    public void setArea(Double area) {
        this.area = area;
    }
}
