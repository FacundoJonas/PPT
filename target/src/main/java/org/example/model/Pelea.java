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

    private static int eleccionPC; // Se utiliza para definirle piedra, papell o tijera a la PC
                                    // y asi aplicar los danos especiales sobre la pelea

    public final static int  obtenerdano1(int vidaPc, int eleccionPC){
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