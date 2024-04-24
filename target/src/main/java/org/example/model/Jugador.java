package org.example.model;

public class Jugador {
    private static int contadorJugadores = 0;
    private static int vidaJugador = 100;
    private static int vidaPc = 100;
    private int idJugador;
    private int eleccion;
    private boolean papel;
    private boolean piedra;
    private boolean tijera;
    private int estatuspartida;

    public Jugador(int vidaInicial) {
        this.vidaJugador = vidaInicial;
    }

    public Jugador() {
        // Asignar un ID único al jugador
        this.idJugador = ++contadorJugadores;
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

    public void jugar() {
        Game game = Game.getInstance();
        int estatuspartida = game.getEstatuspartida(); // Obtener el valor de estatuspartida Por SINGLETON
        int eleccion = game.getEleccion(); //Obtener el valor de eleccion que se utiliza para saber si es piedra

        // Le asigna la vida al jugador para empezar el juego
        if (estatuspartida == 1) {
            // Restablecer la vida del jugador a 100
            vidaJugador = 100;
            System.out.println("check/Jugador");

            // Establece que tipo eligio el jugador
            if (eleccion == 1) {
                piedra = true;
            } else if (eleccion == 2) {
                papel = true;
            } else if (eleccion == 3) {
                tijera = true;
            }
        }
    }
    public void obtener() {
    }

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

}
