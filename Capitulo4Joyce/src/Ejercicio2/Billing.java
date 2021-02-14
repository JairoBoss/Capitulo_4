package Ejercicio2;

public class Billing {
    public Double computeBill(int x){
        return ((x*.08) + x);
    }

    public Double computeBill(int x, int y){
        return (((x * y)*.08) + (x*y));
    }

    public double computeBill(int x, int y, int z){
        return (((x*y)*(z/100))+((x*y)*.08) + (x*y));
    }

}
