/*Ejercicio #4 - Herencia
 * Marinés García - 23391
 * MAIN
 */

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Campeonato {
    public static void main(String[] args) {

        //Definición de variables
        boolean salir = false;
        Scanner sc = new Scanner (System.in);
        String nombreSc = "";
        String paisSc= "";
        int faltasSc = 0;
        int goles_dSc = 0;
        int lanzamientosSc = 0;

        //Definición Array List
        ArrayList<String> jugadoresList = new ArrayList<String>();
        ArrayList<Jugador> porteroList = new ArrayList<Jugador>();
        ArrayList<Jugador> extremosList = new ArrayList<Jugador>();
        ArrayList<Jugador> jugadores = new ArrayList<>();

        System.out.println("\n<<<CAMPEONATO BALONMANO>>>");

        while(!salir){
            System.out.println("\nMENÚ: \n1.Ingrese datos Portero \n2.Ingrese datos Extremos \n3.Salir");
            int opc = sc.nextInt();
            sc.nextLine();
            System.out.println();
            
            switch(opc){
                case 1: 
                //Ingresa datos jugador portero
                    System.out.println("<<<Portero>>> ");
                    System.out.println("\nIngrese su nombre: ");
                    nombreSc = sc.nextLine();
                    System.out.println();

                    jugadoresList.add(nombreSc); //Agrega nombres de jugadores a lista para mostrar luego

                    System.out.println("\nIngrese su país: ");
                    paisSc = sc.nextLine();
                    System.out.println();

                    System.out.println("\nIngrese número de faltas: ");
                    faltasSc = sc.nextInt();
                    sc.nextLine();
                    System.out.println();

                    System.out.println("\nIngrese cantidad de goles directos: ");
                    goles_dSc = sc.nextInt();
                    sc.nextLine();
                    System.out.println();

                    System.out.println("\nIngrese total de lanzamientos: ");
                    lanzamientosSc = sc.nextInt();
                    sc.nextLine();
                    System.out.println();

                    System.out.println("Ingrese cantidad de bolas paradas: ");
                    int paradasSc = sc.nextInt();
                    sc.nextLine();
                    System.out.println();

                    System.out.println("Ingrese cantidad de goles recibidos: ");
                    int goles_rSc = sc.nextInt();
                    sc.nextLine();
                    System.out.println();

                    //Hace arraylist de datos portero
                    Portero pp = new Portero(nombreSc, paisSc, faltasSc, goles_dSc, lanzamientosSc, paradasSc, goles_rSc);
                    porteroList.add(pp);

                    pp.efectPortero(paradasSc, goles_rSc,goles_dSc,lanzamientosSc);

                    //Efectividad de los 3 mejores porteros
                    ArrayList<Portero> porteros = new ArrayList<>();
                    for (Jugador jugador : jugadores) {
                        if (jugador instanceof Portero) {
                            porteros.add((Portero) jugador);
                        }
                    }
                    Collections.sort(porteros, (a, b) -> Double.compare(b.efectPorteros(), a.efectPorteros())); //Ordena de mayor a menor

                    System.out.println("\nLos 3 Mejores Porteros: ");
                    for (int i = 0; i < Math.min(3, porteros.size()); i++) {
                        Portero portero = porteros.get(i);
                        System.out.println("Nombre: " + portero.nombreSc);
                        System.out.println("Efectividad: " + portero.efectPorteros());
                    }

                    //Imprime lista de jugadores incritos
                    System.out.println("\n \n--Jugadores incritos--");
                    System.out.println(jugadoresList);

                    break;

                case 2:
                    //Información extremos
                    System.out.println("<<<Extremos>>> ");
                    System.out.println("\nIngrese su nombre: ");
                    nombreSc = sc.nextLine();
                    System.out.println();

                    jugadoresList.add(nombreSc); //Agrega nombres de jugadores a lista para mostrar luego

                    System.out.println("\nIngrese su país: ");
                    paisSc = sc.nextLine();
                    System.out.println();

                    System.out.println("\nIngrese número de faltas: ");
                    faltasSc = sc.nextInt();
                    sc.nextLine();
                    System.out.println();

                    System.out.println("\nIngrese cantidad de goles directos: ");
                    goles_dSc = sc.nextInt();
                    sc.nextLine();
                    System.out.println();

                    System.out.println("\nIngrese total de lanzamientos: ");
                    lanzamientosSc = sc.nextInt();
                    sc.nextLine();
                    System.out.println();

                    //Pide datos extremos
                    System.out.println("Ingrese cantidad de pases dados: ");
                    int pasesSc = sc.nextInt();
                    sc.nextLine();
                    System.out.println();

                    System.out.println("Ingrese cantidad de asitenciass: ");
                    int asistenciasSc = sc.nextInt();
                    sc.nextLine();
                    System.out.println();

                    //Agrega datos extremos a lista
                    Extremos pe = new Extremos(nombreSc, paisSc, faltasSc, goles_dSc, lanzamientosSc, pasesSc, asistenciasSc);
                    extremosList.add(pe);

                    //Crea efectividad para extremos
                    pe.efectExtremos(pasesSc, asistenciasSc, goles_dSc, lanzamientosSc);

                    //Imprime lista de jugadores incritos
                    System.out.println("\n \n--Jugadores incritos--");
                    System.out.println(jugadoresList);

                    //Calcular 85% jugadores más efectividad
                    int efectExtremo = 0;
                    for (Jugador jugador : jugadores) {
                        if (jugador instanceof Extremos) {
                            Extremos extremo = (Extremos) jugador;
                            if (extremo.getEfectividadExtremos() > 85) {
                                efectExtremo++;
                            }
                        }
                    }
                    System.out.println("\nCantidad de Extremos con más de 85 de Efectividad: " + efectExtremo);

                    break;

                case 3:
                    System.out.println("Ha salido del programa!");
                    salir = true;
                    break;

                default:
                    System.out.println("Escriba un número dentro del menú...");
                    break;
            }
        }
        sc.close();
    }
}