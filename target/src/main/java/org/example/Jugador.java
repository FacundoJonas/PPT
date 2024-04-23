package org.example;

import org.example.model.Pelea;

public class Jugador {
    private static int contadorJugadores = 0;
    private int idJugador;
    private int vidaJugador = 100;
    private int eleccion;
    private boolean papel;
    private boolean piedra;
    private boolean tijera;
    private int estatusPartida;

    public Jugador() {
        // Asignar un ID único al jugador
        this.idJugador = ++contadorJugadores;
    }

    public void jugar(int estatusPartida,int eleccion) {
        // Asignar el estado de la partida al jugador
        this.eleccion = eleccion;
        this.estatusPartida = estatusPartida;

        // Le asigna la vida al jugador para empezar el juego
        if (estatusPartida == 1) {
            // Restablecer la vida del jugador a 100
            vidaJugador = 100;

            // Establece que tipo eligio el jugador
            if (eleccion == 1) {
                piedra = true;
            } else if (eleccion == 2) {
                papel = true;
            }else if (eleccion == 3) {
                tijera = true;
            }
        }
        return;
    }

    public static void obtener() {
        // Método de obtención de información (sin implementación actual)
    }
}
