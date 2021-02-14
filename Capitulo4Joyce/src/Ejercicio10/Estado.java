package Ejercicio10;

public class Estado {
    private String nombre;
    private Integer poblacion;
    private Ciudad capital;
    private Ciudad masPoblada;

    public Estado(String nombre,int poblacion, String cap, int poCap, String mP, int poMP ){
        this.nombre = nombre;
        this.poblacion = poblacion;
        capital = new Ciudad(cap,poCap);
        masPoblada = new Ciudad(mP,poMP);
    }

    public String getNombreMasPoblada(){
        return masPoblada.getCapital();
    }

    public Integer getHabitantesMasPoblada(){
        return masPoblada.getHabitantes();
    }

    public String getNombreCapital(){
        return capital.getCapital();
    }

    public Integer getHabitantesCapital(){
        return capital.getHabitantes();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(Integer poblacion) {
        this.poblacion = poblacion;
    }


}
