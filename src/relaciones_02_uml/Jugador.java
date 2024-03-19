package relaciones_02_uml;

public class Jugador {

    private Integer id;

    private String jugador;

    private Boolean mojado = false;

    public Jugador() {
    }

    public Jugador(Integer id, String jugador) {
        this.id = id;
        this.jugador = jugador;
    }

    public Integer getId() {
        return id;
    }

    public String getJugador() {
        return jugador;
    }

    public Boolean getMojado() {
        return mojado;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setJugador(String jugador) {
        this.jugador = jugador;
    }

    public void setMojado(Boolean mojado) {
        this.mojado = mojado;
    }
    
    public boolean disparo (Revolver r) {
        if (r.mojar()) {
            mojado = true;
            return mojado;
        }
        else {
            r.siguienteChorro();
            mojado = false;
            return mojado;
        }
    }

    @Override
    public String toString() {
        return "Jugador[" + "ID: " + id + ", " + jugador + ", Mojado: " + mojado + ']';
    }
}
