package relaciones_02_uml;

public class Revolver {

    private Integer posicionActual;

    private Integer posicionAgua;

    public Revolver() {
    }

    public Revolver(Integer posicionActual, Integer posicionAgua) {
        this.posicionActual = posicionActual;
        this.posicionAgua = posicionAgua;
    }

    public Integer getPosicionActual() {
        return posicionActual;
    }

    public Integer getPosicionAgua() {
        return posicionAgua;
    }

    public void setPosicionActual(Integer posicionActual) {
        this.posicionActual = posicionActual;
    }

    public void setPosicionAgua(Integer posicionAgua) {
        this.posicionAgua = posicionAgua;
    }
    
    public void llenarRevolver() {
        posicionActual = (int) (Math.random() * 6) + 1;
        posicionAgua = (int) (Math.random() * 6) + 1;
    }
    
    public boolean mojar() {
        if (posicionActual == posicionAgua) {
            //System.out.println("La posicion de agua es la misma de la posicion del revolver");
            return true;
        }
        else {
            //System.out.println("La posicion es diferente");
            return false;
        }
    }
    
    public void siguienteChorro() {
        if (posicionActual < 6) {
            posicionActual ++;
        }
        else {
            posicionActual = 1;
        }
    }

    @Override
    public String toString() {
        return "Revolver[" + "posicionActual = " + posicionActual + ", posicionAgua = " + posicionAgua + ']';
    }
    
}
