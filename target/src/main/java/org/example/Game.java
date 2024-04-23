package org.example;

import org.example.model.Pantalla;
import org.example.model.Pelea;

import java.awt.*;
import java.util.Scanner;
class Main {
    private static int estatuspartida;
    private static int eleccion;
    public static void main(String[] args) {
        Menu menu = new Menu();
        Pantalla.menu(estatuspartida, eleccion);
    }
}
public class Game {
    private int eleccion;
    private int estatuspartida;

    public void iniciarjuego(int estatuspartida, int eleccion) {
        this.eleccion = eleccion;
        this.estatuspartida = estatuspartida;
        if (estatuspartida == 1) {
            // Crear una instancia de Jugador
            Jugador jugador = new Jugador();

            // Llamar al método jugar de Jugador y pasar el valor de estatuspartida.
            jugador.jugar(estatuspartida, eleccion);
            // Llamar al metodo de pelea para que empezar la pela.
            Pelea.obtenerdano1(estatuspartida,eleccion);

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

    public static void main(String[] args) {
        // Aquí puedes agregar código para ejecutar la lógica del juego
        // Por ejemplo:
        Game game = new Game();
        game.iniciarjuego(1, 1); // Simular inicio del juego con estatus de partida 1 y elección de jugador 1
    }
}


