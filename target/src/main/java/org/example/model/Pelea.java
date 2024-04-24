package org.example.model;

import org.example.Jugador;

import java.util.Scanner;

public class Pelea {
    private int idpelea;
    private String ganadorronda1;
    private String ganadorronda2;
    private String ganadorfinal;
    private int eleccion;
    private int vidaRestante;
    private int estatuspartida;
    private static Boolean piedra = false;
    private static Boolean papel = false;
    private static Boolean tijera = false;
    public static void  obtenerdano1(int estatuspartida, int eleccion){
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
                Pantalla.pelea(estatuspartida, eleccion, danodeAtaque, danoAtaquepc, vidaPc, vidaJugador);

            }
            //Ahora tenemos que tomar una eleccion con respecto a que ataque queremos realizar




            estatuspartida =+ 1;
        } else if (estatuspartida == 3) {
        }


    }
    public static int obtenerdano2(){
        return obtenerdano2();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("cadena de texto");
        String cadena = scanner.nextLine();
        System.out.println("La cadena de Texto ingresada es : " + cadena);
        scanner.close();
    }
}