package org.example.model;

import org.example.controller.Game;

public class PeleaHandler {
    public final static int peleahandlerJugador(int vidaPc,int eleccionPC,int eleccion){
        // Obtenemos la la informacion a la hora que game llama a pelea
        //Pelea ronda 1
        //Codigo de las acciones de pelea con Danoespecial ------------------
        if (eleccion == 1 & eleccionPC == 3){
            
        } else if (eleccion == 2 & eleccionPC == 1) {
            
        } else if (eleccion == 3 & eleccionPC == 2) {
            
        }
        //-------------------------------------------------------------------
        vidaPc = Game.getVidaPc();
        int danodeAtaque = Game.getDanodeAtaque();// Corregirlo ya que Pelea se debe comunicar con danoataque
        vidaPc -= danodeAtaque;// Corregirlo ya que Pelea se debe comunicar con danoataque
        return vidaPc;
    }
    public final static int peleahandlerPc(int vidaJugador,int eleccionPC,int eleccion){
        //Codigo de las acciones de pelea con Danoespecial ------------------
        if (eleccionPC == 1 & eleccion == 3){

        } else if (eleccionPC == 2 & eleccion == 1) {

        } else if (eleccionPC == 3 & eleccion == 2) {

        }
        //-------------------------------------------------------------------
        vidaJugador = Game.getVidaPc();
        int danoAtaquepc = Game.getDanodeAtaque();// Corregirlo ya que Pelea se debe comunicar con danoataque
        vidaJugador -= danoAtaquepc;// Corregirlo ya que Pelea se debe comunicar con danoataque
        return vidaJugador;
    }
}
