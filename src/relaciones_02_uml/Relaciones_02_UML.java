package relaciones_02_uml;

import java.util.ArrayList;

public class Relaciones_02_UML {

    public static void main(String[] args) {
        ArrayList<Jugador> jugadores = new ArrayList<>();
        Jugador persona01 = new Jugador(1, "Jose");
        Jugador persona02 = new Jugador(2, "Juan");
        Jugador persona03 = new Jugador(3, "Karim");
        Jugador persona04 = new Jugador(4, "Maxi");
        Jugador persona05 = new Jugador(5, "Mauri");
        Jugador persona06 = new Jugador(6, "Diego");
        jugadores.add(persona01);
        jugadores.add(persona02);
        jugadores.add(persona03);
        jugadores.add(persona04);
        jugadores.add(persona05);
        jugadores.add(persona06);
        Juego game = new Juego();
        Revolver r = new Revolver();
        r.llenarRevolver();
        game.llenarJuego(jugadores, r);
        System.out.println("PosActual: "+r.getPosicionActual());
        System.out.println("PosAgua: "+r.getPosicionAgua());
        game.ronda();
    }
}
