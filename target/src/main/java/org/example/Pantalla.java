package org.example.model;

import org.example.Game;

import java.util.Scanner;

public class Pantalla {
    public static void menu(int estatuspartida,int eleccion) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        int opciones = 0;
        do {
            System.out.println("Bienvenido al juego de Piedra Papel y Tijera");
            System.out.println("Por favor, elija una opción (1 o 2):");
            System.out.println("1-Iniciar el Juego");
            System.out.println("2-Finalizar el Juego");
            String input = scanner.nextLine();
            try {
                opcion = Integer.parseInt(input);
                if (opcion != 1 && opcion != 2) {
                    System.out.println("Opción inválida. Por favor, ingrese 1 o 2.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor, ingrese un número entero.");
                opcion = 0;
            }
        } while (opcion != 1 && opcion != 2);

        if (opcion == 1) {
            do {
                System.out.println("Seleccione si quiere piedra , papel o tijera.");
                System.out.println("Por favor, elija una opción (1 , 2 o 3):");
                System.out.println("1-Piedra");
                System.out.println("2-Papel");
                System.out.println("3-Tijera");
                String input = scanner.nextLine();
                try {
                    opciones = Integer.parseInt(input);
                    if (opciones != 1 && opciones != 2 & opciones != 3) {
                        System.out.println("Opción inválida. Por favor, ingrese 1 , 2 o 3");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Entrada inválida. Por favor, ingrese un número entero.");
                    opcion = 0;
                }
            } while (opcion != 1 && opcion != 2);
            estatuspartida += 1;
            eleccion = opciones;
            Game game = new Game();
            game.iniciarjuego(estatuspartida, eleccion);
        }
    }
    public static void pelea(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Seleccione el ataque que desea realizar:");
        //Tengo que hacer de alguna manera que se muestre en base a la eleccion de la persona
        // el ataque que corresponde a cada una de las clases.

    }
}
