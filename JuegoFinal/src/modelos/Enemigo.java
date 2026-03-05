package Modelos;

public class enemigo {
    double x, y;
    int velocidad, ancho, alto;

    public enemigo(double x, double y, int velocidad, int ancho, int alto) {
        this.x = x;
        this.y = y;
        this.velocidad = velocidad;
        this.ancho = ancho;
        this.alto = alto;
    }
    
    public Rectangle getBounds() {
        return new Rectangle((int)x, (int)y, ancho, alto);
    }
}

