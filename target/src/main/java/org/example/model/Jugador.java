package org.example.model;

public class Jugador {
    private static int contadorJugadores = 0;
    private static int vidaJugador = 100;
    private static int vidaPc = 100;
    private int idJugador;
    private static int eleccion;
    private static boolean papel;// Se genera el Geter y Seter para poder saber el tipo
    private static boolean piedra;// Se genera el Geter y Seter para poder saber el tipo
    private static boolean tijera;// Se genera el Geter y Seter para poder saber el tipo
    private static int estatuspartida;

    public final void jugar() {
        //Acciones de jugar del jugador
    }
    public final void obtener() {}
    public int getEstatuspartida() {
        return estatuspartida;
    }

    public void setEstatuspartida(int estatuspartida) {
        this.estatuspartida = estatuspartida;
    }

    public int getEleccion() {
        return eleccion;
    }

    public void setEleccion(int eleccion) {
        this.eleccion = eleccion;
    }
    public static int getVidaPc() {
        return vidaPc;
    }

    public static void setVidaPc(int vidaPc) {
        Jugador.vidaPc = vidaPc;
    }

    public static int getVidaJugador() {
        return vidaJugador;
    }

    public static void setVidaJugador(int vidaJugador) {
        Jugador.vidaJugador = vidaJugador;
    }

    public int getIdJugador() {
        return idJugador;
    }

    public static boolean isPapel() {
        return papel;
    }

    public static void setPapel(boolean papel) {
        Jugador.papel = papel;
    }

    public static boolean isPiedra() {
        return piedra;
    }

    public static void setPiedra(boolean piedra) {
        Jugador.piedra = piedra;
    }

    public static boolean isTijera() {
        return tijera;
    }

    public static void setTijera(boolean tijera) {
        Jugador.tijera = tijera;
    }
}
