package org.example.model;

public class Game {
    private int eleccion;
    private int estatuspartida;
    private static int danodeAtaque;  // de pelea
    private static int danoAtaquepc;
    private static int vidaJugador;
    private static int vidaPc;
    private String ganadorronda1;
    private String ganadorronda2;
    private String ganadorfinal;


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
            //Esto debria ir en pelea o en Pelea Handler
            // En base a la clase del 29/04

            int vidaPc = Jugador.getVidaPc();
            Game.setVidaPc(vidaPc);//Se le asigna el valor de vida al jugador de la clase jugador

            vidaPc = Pelea.obtenerdano1(vidaPc);
            Jugador.setVidaPc(vidaPc);
            int danodeAtaque = Pelea.getDanodeAtaque();


            //Ataque de la PC
            int vidaJugador = Jugador.getVidaJugador();
            vidaJugador = Pelea.obtenerdano2(vidaJugador);
            Jugador.setVidaJugador(vidaJugador);
            int danoAtaquepc = Pelea.getDanoAtaquepc();




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

    public static int getVidaPc() {
        return vidaPc;
    }

    public static void setVidaPc(int vidaPc) {
        Game.vidaPc = vidaPc;
    }

    public static int getVidaJugador() {
        return vidaJugador;
    }

    public static void setVidaJugador(int vidaJugador) {
        Game.vidaJugador = vidaJugador;
    }

    public static int getDanodeAtaque() {
        return danodeAtaque;
    }

    public static void setDanodeAtaque(int danodeAtaque) {
        Game.danodeAtaque = danodeAtaque;
    }

    public static int getDanoAtaquepc() {
        return danoAtaquepc;
    }

    public static void setDanoAtaquepc(int danoAtaquepc) {
        Game.danoAtaquepc = danoAtaquepc;
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
}



