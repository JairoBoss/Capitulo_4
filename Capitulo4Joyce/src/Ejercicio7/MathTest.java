package Ejercicio7;

import java.util.Random;

public class MathTest {

    public void a(){
        System.out.println(Math.sqrt(37));
    }

    public void b(){
        System.out.println(Math.sin(300));
        System.out.println(Math.cos(300));
    }

    public void c(){
        System.out.println(Math.floor(22.8));
        System.out.println(Math.ceil(22.8));
        System.out.println(Math.round(22.8));
    }

    public void d(){
        System.out.println(Math.max('D',71));
    }

    Random rand = new Random();
    public void e(){
        System.out.println(rand.nextInt(20));
    }
}
