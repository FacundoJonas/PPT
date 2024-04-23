package org.example.model;

import java.util.Scanner;

public class Pelea {
    private int idpelea;
    private String ganadorronda1;
    private String ganadorronda2;
    private String ganadorfinal;
    private int eleccion;
    private int ataque;
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
        int danodeAtaque = DanoEfectuado.obtenerDanodeAtaque();
        //Ahora tenemos que tomar una eleccion con respecto a que ataque queremos realizar
        Pantalla.pelea(estatuspartida, eleccion, danodeAtaque);
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