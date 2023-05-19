package io.github.sckr.paketor;

public class Valj extends Krog {
    private double visina;

    public Valj(double visina, double polmer){
        super(polmer);
        this.visina = visina;
    }

    public double getVisina(){
        return visina;
    }

    public double getProstornina(){
        return getPloscina() * visina;
    }

    public double getPloscina(){
        return getObseg()*visina;
    }

    public double getPovsrina(){
        return 2* getObseg() + getPloscina();
    }

    public String toString(){
        return String.format("Valj z visino %f cm in polmerom %f cm.", visina, getPolmer());
    }
}
