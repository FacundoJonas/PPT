package org.example.model;

import java.util.Scanner;

public class Pelea {
    private int idpelea;

    private String ganadorronda1;

    private String ganadorronda2;

    private String ganadorfinal;

    //private int eleccion; // Se comenta eleccion ya que lo tiene desde game por singleton

    //private int estatuspartida; // Se comenta eleccion ya que lo tiene desde game por singleton
    private static int danodeAtaque;

    private static int danoAtaquepc;

    public final static int  obtenerdano1(int vidaPc){
        // se recibe el estatus de partida que el mismo deberia ser 1 y se coloca en 2
        // haciendo referencia que se encuentra en la primera ronda de la pelea
        // estatus 3 (segunda ronda ) y 4 (ronda final ) , estatus 5 es definicion de partida

        //Pelea ronda 1
        //Creamos una instancia de Jugador.
        int danodeAtaque = DanoEfectuado.obtenerDanodeAtaque();
        Pelea.setDanodeAtaque(danodeAtaque);
        vidaPc -= danodeAtaque;
        return vidaPc;
    }
    public final static int obtenerdano2(int vidaJugador){
        //Lo utiizamos para obtener el random de PC
        int danoAtaquepc = DanoEfectuado.obtenerdanodeataque2();
        Pelea.setDanoAtaquepc(danoAtaquepc);
        vidaJugador -= danoAtaquepc;
        return vidaJugador;
    }

    public final static int getDanodeAtaque() {
        return danodeAtaque;
    }

    public final static void setDanodeAtaque(int danodeAtaque) {
        Pelea.danodeAtaque = danodeAtaque;
    }

    public final static int getDanoAtaquepc() {
        return danoAtaquepc;
    }

    public final static void setDanoAtaquepc(int danoAtaquepc) {
        Pelea.danoAtaquepc = danoAtaquepc;
    }
}