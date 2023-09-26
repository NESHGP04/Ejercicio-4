/*Ejercicio #4 - Herencia
 * Marinés García - 23391
 * HIJO 1
 */

import java.util.ArrayList;
import java.util.Scanner;
import java.lang.ArithmeticException;
//import java.util.Collections;

public class Portero extends Jugador {

    //Declaración variables 
    protected int pardas;
    protected int goles_r;
    protected Scanner sc = new Scanner(System.in);
    protected float efectPortero;
    protected ArrayList<Jugador> porteroList = new ArrayList<Jugador>();
    protected String nombreSc;
    protected String paisSc;
    protected int faltasSc;
    protected ArrayList<Float> efectPorteroList = new ArrayList<Float>();
    protected int paradasSc;
    protected int goles_rSc;
    protected int goles_dSc;
    protected int lanzamientosSc;

    public Portero(String nombre, String pais, int faltas, int goles_d, int lanzamientos, int paradas, int goles_r){
        super(nombre, pais, faltas, goles_d, lanzamientos);
        this.pardas = paradas;
        this.goles_r = goles_r;
    }

    //Getters
    public int getParadas(){
        return this.pardas;
    }

    public int getGoles_r(){
        return this.goles_r;
    }

    //Efectividad porteros
    public void efectPortero(int paradasSc, int goles_rSc, int goles_dSc, int lanzamientosSc){
        try{
            efectPortero = ((paradasSc - goles_rSc) * 100 / (paradasSc + goles_rSc)) + goles_dSc *100 / lanzamientosSc;
        } catch(ArithmeticException e) {
        }

        if(efectPortero == 0){
            System.out.println("Efectividad: 0");
        } else{
            System.out.println("Efectividad porteros: " + efectPortero);
        }
    }
    
    public double efectPorteros(){
        return ((paradasSc - goles_rSc) * 100 / (paradasSc + goles_rSc)) + goles_dSc *100 / lanzamientosSc;
    }

    public String toString(){
        return nombre + "\n-> Paradas:  " + this.pardas + "\n-> Goles recibidos: " + this.goles_r;
    }
}
