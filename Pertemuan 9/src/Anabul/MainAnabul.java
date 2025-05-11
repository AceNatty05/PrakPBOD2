package Anabul;

/**
 *
 * @author Natasya
 */
public class MainAnabul {
    public static void main(String[] args){
        // Anabul
        Anabul A = new Anabul("Unknown");
        A.Gerak();    // tidak keluar apapun
        A.Bersuara(); // tidak keluar apapun
        System.out.println(); // 1 baris kosong
        
        // Anjing
        Anjing Aj = new Anjing("Heli");
        Aj.Gerak();
        Aj.Bersuara();
        System.out.println();
        
        // Kucing
        Kucing K = new Kucing("Meli");
        K.Gerak();
        K.Bersuara();
        System.out.println();
        
        // Burung 
        Burung B = new Burung("Weni");
        B.Gerak();
        B.Bersuara();
    }
}
