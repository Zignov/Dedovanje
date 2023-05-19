package io.github.sckr.koordinatni_sistem;


public class Tocka3D extends Tocka2D{
    double x;
    double y;
    double z;
    
    
    public Tocka3D(){}
    
    public Tocka3D(double x, double y, double z){
        super(x, y);
        this.z = z;
    }

    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }

    public double getZ(){
        return z;
    }

    public String toString(){
        return String.format("Koordinata X: %f cm, Koordinata Y: %f cm, Koordinata Z: %f cm", x, y, z);
    }
    
}
