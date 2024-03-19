package relaciones_02_uml;

import java.util.ArrayList;

public class Juego {

    private ArrayList<Jugador> jugadores;

    private Revolver revolver;

    public Juego() {
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public Revolver getRevolver() {
        return revolver;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public void setRevolver(Revolver revolver) {
        this.revolver = revolver;
    }
    
    public void llenarJuego (ArrayList<Jugador> jugadores, Revolver r) {
        this.jugadores = jugadores;
        this.revolver = r;
    }
    
    public void ronda() {
        int i = 0;
        boolean salir = false;
        do {
            System.out.println("Ronda N°"+(i+1));
            System.out.println(jugadores.get(i));
            System.out.println(jugadores.get(i).getJugador()+" va a disparar");
            if (jugadores.get(i).disparo(revolver)) {
                System.out.println(jugadores.get(i).getJugador()+" se ah mojado");
                System.out.println("Ah finalizado el juego en la ronda N°"+(i+1));
                salir = true;
            }
            else {
                System.out.println("No ah salido nada");
                System.out.println("Se pasara a la siguiente ronda");
                System.out.println("------------------------------");
            }
            i++;
        } while (!salir); //Queria hacerlo con !getMojado pero no sale :c
    }
}
