package GameZone2;

import java.util.ArrayList;

public class FiveDice {
    private ArrayList<Die> dados = new ArrayList<>();
    private Integer grande;
    private Integer repetidos;

    public FiveDice(){
        for (int i = 0; i < 5 ; i++) {
            this.dados.add(new Die());
        }

    }

    public Integer getGrande() {
        return grande;
    }

    public void setGrande(Integer grande) {
        this.grande = grande;
    }

    public Integer getRepetidos() {
        return repetidos;
    }

    public void setRepetidos(Integer repetidos) {
        this.repetidos = repetidos;
    }
}
