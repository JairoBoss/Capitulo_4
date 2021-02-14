package Ejercicio4;

public class BloodData {
    private String tipoDeSangre;
    private char factor;

    public BloodData(){
        this.setTipoDeSangre("O");
        this.setFactor('+');
    }

    public BloodData(String sangre, char factor){
        this.setTipoDeSangre(sangre);
        this.setFactor(factor);
    }

    public String getTipoDeSangre() {
        return tipoDeSangre;
    }

    public void setTipoDeSangre(String tipoDeSangre) {
        this.tipoDeSangre = tipoDeSangre;
    }

    public char getFactor() {
        return factor;
    }

    public void setFactor(char factor) {
        this.factor = factor;
    }
}
