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

    public static void iniciarjuego(){
        Game game = Game.getInstance();
        int estatuspartida = game.getEstatuspartida(); // Obtener el valor de estatuspartida Por SINGLETON
        int eleccion = game.getEleccion(); //Obtener el valor de eleccion que se utiliza para saber si es piedra
        if (estatuspartida == 1) {
            //int vidaJugador = Jugador.getVidaJugador();
            //int vidaPc = Jugador.getVidaPc();
            //Lo que podemos hacer es hacer SE  T y GET
            //El estatus de la partida se tiene que pasar a estatus 2 ya que le asignamos juego la vida
            //El estatus de la partida se tiene que pasar a estarus 3 cuando ya este en primera fase de pelea
            if (eleccion == 1){
                //el jugador eligio Piedra
                Jugador.setPiedra(true);
            } else if (eleccion == 2) {
                //el jugador eligio Papel
                Jugador.setPapel(true);
            } else if (eleccion == 3) {
                //el jugador eligio Tijera
                Jugador.setTijera(true);
            }
            //Ataque de el jugador
            Pelea.obtenerdano1();
            Pelea.getDanodeAtaque();

            //Ataque de la PC
            Pelea.obtenerdano2();
            Pelea.getDanoAtaquepc();



            // Llamar al metodo de pelea para que empezar la pela.
            //Pelea.obtenerdano1();

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


}


