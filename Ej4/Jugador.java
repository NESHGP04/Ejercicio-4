public class Jugador{
    
        protected String nombre;
        protected String pais;
        protected int faltas;
        protected int goles_d;
        protected int lanzamientos;
    
        public Jugador(String nombre, String pais, int faltas, int goles_d, int lanzamientos){
            this.nombre = nombre;
            this.pais = pais;
            this.faltas = faltas;
            this.goles_d = goles_d;
            this.lanzamientos = lanzamientos; 
        }

        public String toString(){
            return this.nombre + " de " + this.pais + " Faltas: " + this.faltas + "Goles directos:" + this.goles_d + "Lanzamientos: " + this.lanzamientos;
        }

        protected String getNombre(){
            return this.nombre;
        }
}