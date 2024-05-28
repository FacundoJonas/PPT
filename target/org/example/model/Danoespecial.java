package org.example.model;

import java.util.Random;

public class Danoespecial {
    //en un principio cuando tenemos los siguientes casos se aplica esta clase
    // Papel contra Piedra
    // Piedra contra Tijera
    // Tijera contra Papel
    //En esos casos se aplica el dano especial que tiene que ser mas alto
    // O
    // En caso de que ya pasaron 3 rondas y no se murio ninguno
    private static int danoEspecial;

    public final static int obtenerDanodeEspecial() {
        // Generar un número aleatorio entre 1 y 100
        return new Random().nextInt(99) + 1;
    }

    public final static int obtenerDanoEspecial2(){
        // Generar un número aleatorio entre 1 y 100 para PC
        return new Random().nextInt( 99) + 1;
    }

    public static int getDanoEspecial() {
        return danoEspecial;
    }

    public static void setDanoEspecial(int danoEspecial) {
        Danoespecial.danoEspecial = danoEspecial;
    }
}
