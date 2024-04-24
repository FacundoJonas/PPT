package org.example.model;
import java.util.Random;


public class DanoEfectuado {

    private static int danoAtaque;

    public static int obtenerDanodeAtaque() {
        // Generar un número aleatorio entre 1 y 100
        return new Random().nextInt(99) + 1;
    }


    public static int obtenerdanodeataque2(){
        // Generar un número aleatorio entre 1 y 100 para PC
        return new Random().nextInt(99) + 1;
    }

    public static int getDanoAtaque() {
        return danoAtaque;
    }

    public static void setDanoAtaque(int danoAtaque) {
        DanoEfectuado.danoAtaque = danoAtaque;
    }
}


