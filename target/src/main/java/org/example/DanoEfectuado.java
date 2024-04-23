package org.example;
import java.util.Random;


public class DanoEfectuado {
    private int danoAtaque;
    public static int obtenerDanodeAtaque() {
        // Generar un número aleatorio entre 1 y 100
        return new Random().nextInt(100) + 1;
    }


    public static int obtenerdanodeataque2(){
        // Generar un número aleatorio entre 1 y 100
        return new Random().nextInt(100) + 1;
    }
}


