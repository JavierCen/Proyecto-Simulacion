
package Proyecto;

public class Fila {
    
    private int i;
    private double aleatorio;

    public double getAleatorio() {
        return aleatorio;
    }

    public void setAleatorio(double aleatorio) {
        this.aleatorio = aleatorio;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    @Override
    public String toString() {
        return "Fila{" + "i=" + i + ", aleatorio=" + aleatorio + '}';
    }


}
