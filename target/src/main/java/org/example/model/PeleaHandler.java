package org.example.model;

public class PeleaHandler {
    public final static int peleahandlerJugador(){
        int vidaPc = Game.getVidaPc();
        int danodeAtaque = Game.getDanodeAtaque();
        vidaPc -= danodeAtaque;
        return vidaPc;
    }
    public final static int peleahandlerPc(){
        int vidaJugador = Game.getVidaPc();
        int danoAtaquepc = Game.getDanodeAtaque();
        vidaJugador -= danoAtaquepc;
        return vidaJugador;
    }
}
