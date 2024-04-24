package org.example.model;

import java.util.Scanner;

public class Pelea {
    private int idpelea;

    private String ganadorronda1;

    private String ganadorronda2;

    private String ganadorfinal;

    //private int eleccion; // Se comenta eleccion ya que lo tiene desde game por singleton

    private int vidaRestante;

    //private int estatuspartida; // Se comenta eleccion ya que lo tiene desde game por singleton

    private static Boolean piedra = false;

    private static Boolean papel = false;

    private static Boolean tijera = false;

    private static Pelea instance;

    private Pelea(){

    }
    public static Pelea getInstance() {

        if (instance == null) {
            instance = new Pelea();
        }
        return instance;
    }

    public static void  obtenerdano1(){
        Game game = Game.getInstance();
        int estatuspartida = game.getEstatuspartida(); // Obtener el valor de estatuspartida Por SINGLETON
        int eleccion = game.getEleccion(); //Obtener el valor de eleccion que se utiliza para saber si es piedra
        Pelea pelea = Pelea.getInstance();
        // se recibe el estatus de partida que el mismo deberia ser 1 y se coloca en 2
        // haciendo referencia que se encuentra en la primera ronda de la pelea
        // estatus 3 (segunda ronda ) y 4 (ronda final ) , estatus 5 es definicion de partida
        estatuspartida += 1;
        if (eleccion == 1){
            piedra = true;
        } else if (eleccion == 2) {
            papel = true;
        }else if (eleccion == 3) {
            tijera = true;
        }
        if (estatuspartida == 2){
            //Pelea ronda 1
            //Creamos una instancia de Jugador.
            //Jugador jugador = new Jugador(100); a revisar !!!
            Jugador jugador = new Jugador();
            int vidaJugador = jugador.getVidaJugador();
            int idJugador = jugador.getIdJugador();
            int vidaPc = jugador.getVidaPc();
            while (vidaJugador > 0 && vidaPc > 0 ){
                //Primero el jugador ataca a la Pc
                int danodeAtaque = DanoEfectuado.obtenerDanodeAtaque();
                vidaPc -= danodeAtaque;
                //PC Ataca Jugador
                int danoAtaquepc = DanoEfectuado.obtenerdanodeataque2();
                vidaJugador -= danoAtaquepc;


            }
            //Ahora tenemos que tomar una eleccion con respecto a que ataque queremos realizar




            estatuspartida =+ 1;
        } else if (estatuspartida == 3) {
        }


    }
    public static int obtenerdano2(){
        return obtenerdano2();
    }
}