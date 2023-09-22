public class Extremos extends Jugador{
    protected int pases;
    protected int asistencias;

    public Extremos(String nombre, String pais, int faltas, int goles_d, int lanzamientos, int pases, int asistencias){
        super(nombre, pais, faltas, goles_d, lanzamientos);
        this.pases = pases;
        this.asistencias = asistencias; 
    }

    public String toString(){
        return nombre + "-> Pases:  " + this.pases + ", Asistencias: " + this.asistencias;
    }

    
}
