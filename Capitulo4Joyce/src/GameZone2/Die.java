package GameZone2;

public class Die {
    private Integer numero;

    public Die() {
        this.lanzar();
    }

    public void lanzar(){
        this.numero = (int)(Math.random() * 6 + 1);
    }

    public Integer getValor() {
        return numero;
    }
}
