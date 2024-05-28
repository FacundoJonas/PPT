package org.example.model;

import org.example.controller.Game;

public class PeleaHandler {
    public final static int peleahandlerJugador(int vidaPc,int eleccionPC,int eleccion){
        Game game = Game.getInstance();
        if (eleccion == 1 & eleccionPC == 3){
            int danoEspecial = Danoespecial.obtenerDanodeEspecial();
        } else if (eleccion == 2 & eleccionPC == 1) {
            int danoEspecial = Danoespecial.obtenerDanodeEspecial();
        } else if (eleccion == 3 & eleccionPC == 2) {
            int danoEspecial = Danoespecial.obtenerDanodeEspecial();
        }
        vidaPc = game.getVidaPc();
        int danodeAtaque = game.getDanodeAtaque();
        vidaPc -= danodeAtaque;
        return vidaPc;
    }
    public final static int peleahandlerPc(int vidaJugador,int eleccionPC,int eleccion){
        Game game = Game.getInstance();
        if (eleccionPC == 1 & eleccion == 3){
            int danoEspecial = Danoespecial.obtenerDanoEspecial2();
        } else if (eleccionPC == 2 & eleccion == 1) {
            int danoEspecial = Danoespecial.obtenerDanoEspecial2();
        } else if (eleccionPC == 3 & eleccion == 2) {
            int danoEspecial = Danoespecial.obtenerDanoEspecial2();
        }
        vidaJugador = game.getVidaJugador();
        int danoAtaquepc = game.getDanodeAtaque();
        vidaJugador -= danoAtaquepc;
        return vidaJugador;
    }
}