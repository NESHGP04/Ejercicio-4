import java.util.Scanner;
import java.util.ArrayList;

public class Campeonato {
    public static void main(String[] args) {
        int efectPortero;
        int efectExtremos;
        
        String porteroList; //Modificar
        String extremosList;//Modificar
        boolean salir = false;
        Scanner sc = new Scanner (System.in);
        //Arraylist<Jugador> jugadorList = new ArrayList<Jugador>();

        while(salir){
            System.out.println("<<<CAMPEONATO BALONMANO>>>");

            System.out.println("\nIngrese su nombre: ");
            String nombreSc = sc.nextLine();
            System.out.println();

            System.out.println("Ingrese su país: ");
            String paisSc = sc.nextLine();
            System.out.println();

            System.out.println("Ingrese número de faltas: ");
            int faltasSc = sc.nextInt();
            sc.nextLine();
            System.out.println();

            System.out.println("Ingrese cantidad de goles directos: ");
            int goles_dSc = sc.nextInt();
            sc.nextLine();
            System.out.println();

            System.out.println("Ingrese total de lanzamientos: ");
            int lanzamientosSc = sc.nextInt();
            sc.nextLine();
            System.out.println();

            System.out.println("Ingrese si es portero o extremo o si desea salir: \n1.Portero \n2.Extremo \n3.Salir");
            int opc = sc.nextInt();
            sc.nextLine();
            System.out.println();

            if(opc == 1){
                // Jugador j = new Jugador(nombreSc,paisSc,faltasSc,goles_dSc,lanzamientosSc);
                System.out.println("<<<Portero>>> ");
                System.out.println("Ingrese cantidad de bolas paradas: ");
                int paradasSc = sc.nextInt();
                sc.nextLine();
                System.out.println();

                System.out.println("Ingrese cantidad de goles recibidos: ");
                int goles_rSc = sc.nextInt();
                sc.nextLine();
                System.out.println();

                Portero p = new Portero(nombreSc, paisSc, faltasSc, goles_dSc, lanzamientosSc, paradasSc, goles_rSc);
                System.out.println(p);
            } else if(opc == 2){
                System.out.println("<<<Extremos>>> ");
                System.out.println("Ingrese cantidad de pases dados: ");
                int pasesSc = sc.nextInt();
                sc.nextLine();
                System.out.println();

                System.out.println("Ingrese cantidad de asitenciass: ");
                int asistenciasSc = sc.nextInt();
                sc.nextLine();
                System.out.println();

                Extremos p = new Extremos(nombreSc, paisSc, faltasSc, goles_dSc, lanzamientosSc, pasesSc, asistenciasSc);
                System.out.println(p);
            } else if(opc == 3){
                salir = true;
            } else{
                System.out.println("Escriba un número dentro del menú...");
            }
        }
        sc.close();
    }
}
