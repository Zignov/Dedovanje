package io.github.sckr.paketor;





public class Krog {
    private double polmer;

    public Krog (double polmer){
        this.polmer = polmer;
    }

    public double getPolmer(){
        return polmer;
    }

    public double getObseg(){
        return (2* Math.PI * polmer);
    }

    public double getPloscina(){
        return (Math.PI * Math.pow(polmer, 2));
    }

    public String toString(){
        return String.format("Krog s Polmerom: %f cm", polmer);
    }
}