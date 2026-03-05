package modelos;

import java.awt.Rectangle;

public class Nave {
    public int x;
    public int y;
    public int velocidad = 8;
    public int vida;
    public int ancho;
    public int alto;

    public Nave(int x, int y, int velocidad, int vida) {
        this.x = x;
        this.y = y;
        this.velocidad = velocidad;
        this.vida = vida;
        this.ancho = 40;
        this.alto = 20;
    }

    public Rectangle getBounds() {
        return new Rectangle(x, y, ancho, alto);
    }
}
