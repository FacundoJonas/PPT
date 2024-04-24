package org.example.model;

public class Game {
    private int eleccion;
    private int estatuspartida;

    // 1. Instancia estática privada
    //Paso 1 para poder hacer una clase Singleton
    private static Game instance;

    // 2. Constructor privado
    //Paso 2 para poder hacer una clase Singleton
    private Game() {
        // Constructor privado para evitar la instanciación externa
    }

    public static Game getInstance() {
        // Si la instancia aún no ha sido creada, la creamos
        if (instance == null) {
            instance = new Game();
        }
        return instance;
        }

    public void iniciarjuego() {
        Game game = Game.getInstance();
        int estatuspartida = game.getEstatuspartida(); // Obtener el valor de estatuspartida Por SINGLETON
        int eleccion = game.getEleccion(); //Obtener el valor de eleccion que se utiliza para saber si es piedra
        if (estatuspartida == 1) {
            // Crear una instancia de Jugador
            Jugador jugador = new Jugador();

            // Llamar al método jugar de Jugador y pasar el valor de estatuspartida.
            jugador.jugar();
            // Llamar al metodo de pelea para que empezar la pela.
            Pelea.obtenerdano1();

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

    public static void main(String[] args) {
        // Aquí puedes agregar código para ejecutar la lógica del juego
        // Por ejemplo:
        Game game = new Game();
        game.iniciarjuego(); // Simular inicio del juego con estatus de partida 1 y elección de jugador 1
    }
}


