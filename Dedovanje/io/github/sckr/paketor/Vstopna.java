package io.github.sckr.paketor;

public class Vstopna {
    public static void main(String[]args){
        Krog krog = new Krog(5);
        Valj valj = new Valj(10,5);
        
        System.out.println(krog);
        System.out.println(krog.getObseg());
        System.out.println(krog.getPloscina());

        System.out.println(valj);
        System.out.println(valj.getPovsrina());
        System.out.println(valj.getProstornina());
        
    }
}
