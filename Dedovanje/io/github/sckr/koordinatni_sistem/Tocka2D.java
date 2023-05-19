package io.github.sckr.koordinatni_sistem;


public class Tocka2D {
    double x;
    double y;

    public Tocka2D(){}

    public Tocka2D(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }

    public String toString(){
        return String.format("Koordinata X: %f cm, Koordinata Y: %f cm", x, y);
    }
}
