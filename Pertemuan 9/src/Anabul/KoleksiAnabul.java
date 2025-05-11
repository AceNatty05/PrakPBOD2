package Anabul;

import Koleksi.Koleksi;

/**
 *
 * @author Natasya
 */
public class KoleksiAnabul {
    public static void main(String[] args){
        // Kamus 
        Koleksi<Anabul> K = new Koleksi<>();
        
        // Algo
        K.add(new Anjing("Melly"));
        K.add(new Kucing("Molly"));
        K.add(new Burung("Molla"));
        K.add(new Burung("Malle"));
        K.add(new Anjing("Mella"));
        K.add(new Anjing("Helly"));
        K.add(new Kucing("Hella"));
        K.add(new Anjing("Holla"));
        K.add(new Burung("Hallo"));
        K.add(new Kucing("Hello"));
        
        K.showAll();
    }
}
