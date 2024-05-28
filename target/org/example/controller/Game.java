package org.example.controller;

import org.example.model.Jugador;
import org.example.model.Pelea;
import org.example.model.PeleaHandler;

import java.util.Random;

public class Game {
    private int eleccion;
    private int eleccionPC;
    private int estatuspartida;
    private int danodeAtaque;  // de pelea
    private int danoAtaquepc;
    private int vidaJugador;
    private int vidaPc;
    private String ganadorronda1;
    private String ganadorronda2;
    private String ganadorfinal;

    private static Game instance;

    private Game() {
    }

    public static Game getInstance() {
        if (instance == null) {
            instance = new Game();
        }
        return instance;
    }

    public static void iniciarjuego() {
        Game game = Game.getInstance();
        Random random = new Random();
        int estatuspartida = game.getEstatuspartida();
        int eleccion = game.getEleccion();
        if (estatuspartida == 1) {
            if (eleccion == 1) {
                Jugador.setPiedra(true);
            } else if (eleccion == 2) {
                Jugador.setPapel(true);
            } else if (eleccion == 3) {
                Jugador.setTijera(true);
            }
            int eleccionPC = game.getEleccionPC();
            eleccionPC = random.nextInt(3 - 1 + 1) + 1;
            game.setEleccionPC(eleccionPC);

            int vidaPc = Jugador.getVidaPc();
            int danodeAtaque = Pelea.getDanodeAtaque();
            Jugador.setVidaPc(vidaPc);

            vidaPc = PeleaHandler.peleahandlerJugador(vidaPc, eleccionPC, eleccion);
            Jugador.setVidaPc(vidaPc);

            int vidaJugador = Jugador.getVidaJugador();
            vidaJugador = PeleaHandler.peleahandlerPc(vidaJugador, eleccionPC, eleccion);
            Jugador.setVidaJugador(vidaJugador);
            int danoAtaquepc = Pelea.getDanoAtaquepc();
        }
    }

    public static int terminarjuego() {
        return 0;
    }

    public static int ganador() {
        return 0;
    }

    public static int random() {
        return 0;
    }

    public static Boolean iniciarpelea() {
        return false;
    }

    public int getEleccion() {
        return eleccion;
    }

    public void setEleccion(int eleccion) {
        this.eleccion = eleccion;
    }

    public int getEstatuspartida() {
        return estatuspartida;
    }

    public void setEstatuspartida(int estatuspartida) {
        this.estatuspartida = estatuspartida;
    }

    public int getVidaPc() {
        return vidaPc;
    }

    public void setVidaPc(int vidaPc) {
        this.vidaPc = vidaPc;
    }

    public int getVidaJugador() {
        return vidaJugador;
    }

    public void setVidaJugador(int vidaJugador) {
        this.vidaJugador = vidaJugador;
    }

    public int getDanodeAtaque() {
        return danodeAtaque;
    }

    public void setDanodeAtaque(int danodeAtaque) {
        this.danodeAtaque = danodeAtaque;
    }

    public int getDanoAtaquepc() {
        return danoAtaquepc;
    }

    public void setDanoAtaquepc(int danoAtaquepc) {
        this.danoAtaquepc = danoAtaquepc;
    }

    public String getGanadorronda1() {
        return ganadorronda1;
    }

    public void setGanadorronda1(String ganadorronda1) {
        this.ganadorronda1 = ganadorronda1;
    }

    public String getGanadorronda2() {
        return ganadorronda2;
    }

    public void setGanadorronda2(String ganadorronda2) {
        this.ganadorronda2 = ganadorronda2;
    }

    public String getGanadorfinal() {
        return ganadorfinal;
    }

    public void setGanadorfinal(String ganadorfinal) {
        this.ganadorfinal = ganadorfinal;
    }

    public int getEleccionPC() {
        return eleccionPC;
    }

    public void setEleccionPC(int eleccionPC) {
        this.eleccionPC = eleccionPC;
    }
}