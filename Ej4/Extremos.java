/*Ejercicio #4 - Herencia
 * Marinés García - 23391
 * HIJO 2
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Extremos extends Jugador{

    //Declaración variables 
    protected int pases;
    protected int asistencias;
    protected ArrayList<Jugador> extremosList = new ArrayList<Jugador>();
    protected Scanner sc = new Scanner(System.in);
    protected float efectExtremos;
    protected String nombreSc = "";
    protected String paisSc= "";
    protected int faltasSc = 0;
    protected ArrayList<Float> efectExtremosList = new ArrayList<Float>();
    protected int  pasesSc,  asistenciasSc,  goles_dSc,  lanzamientosSc;

    public Extremos(String nombre, String pais, int faltas, int goles_d, int lanzamientos, int pases, int asistencias){
        super(nombre, pais, faltas, goles_d, lanzamientos);
        this.pases = pases;
        this.asistencias = asistencias; 
    }

    //Getters
    public int getPases(){
        return this.pases;
    }

    public int getAsistencias(){
        return this.asistencias;
    }
    
    //Efectividad Extremos
    public void efectExtremos(int pasesSc, int asistenciasSc, int goles_dSc, int lanzamientosSc){
        try{
            efectExtremos = ((pasesSc + asistenciasSc - faltasSc) * 100 / (pasesSc + asistenciasSc + faltasSc)) + goles_dSc * 100 / lanzamientosSc;
        } catch(ArithmeticException e) {
        }

        if(efectExtremos == 0){
            System.out.println("La efectividad es 0");
        } else{
            System.out.println("Efectividad extremos: " + efectExtremos);
        }

        //Crea arraylist de efectividades
        efectExtremosList.add(efectExtremos);
        
        Collections.sort(efectExtremosList);
        for (float i : efectExtremosList ){
            System.out.print(i+", ");
            }
    }

    public double getEfectividadExtremos(){
        return ((pasesSc + asistenciasSc - faltasSc) * 100 / (pasesSc + asistenciasSc + faltasSc)) + goles_dSc * 100 / lanzamientosSc;
    }

    public String toString(){
        return nombre + "-> Pases:  " + this.pases + "\n-> Asistencias: " + this.asistencias;
    }
}
