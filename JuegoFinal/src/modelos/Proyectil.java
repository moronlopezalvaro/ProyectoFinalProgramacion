package modelos;

import java.awt.Rectangle;

public class Proyectil {
    public int x, y, velocidad, ancho, alto;

    public Proyectil(int x, int y, int velocidad){
        this.x = x;
        this.y = y;
        this.velocidad = velocidad;
        this.ancho = 5;
        this.alto = 10;
    }

    //Para cuando el proyectil 
    public Rectangle getBounds() {
        return new Rectangle(x, y, ancho, alto);
    }

    //Para mover el proyectil hacia arriba.
    public void mover() {
        y -= velocidad;
    }

}
