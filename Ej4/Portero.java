public class Portero extends Jugador {
    protected int pardas;
    protected int goles_r;

    public Portero(String nombre, String pais, int faltas, int goles_d, int lanzamientos, int paradas, int goles_r){
        super(nombre, pais, faltas, goles_d, lanzamientos);
        this.pardas = paradas;
        this.goles_r = goles_r;
    }

    public String toString(){
        return nombre + "-> Paradas:  " + this.pardas + ", Goles recibidos: " + this.goles_r;
    }
}
