package Anabul;

/**
 *
 * @author Natasya  
 */
public class Anabul {
    // att
    private String nama;
    
    // kons
    public Anabul(String nama){
        this.nama = nama;
    }
    
    // meth
    public String getNama(){
        return nama;
    }
    
    public void Gerak(){};
    public void Bersuara(){};
    
    @Override
    public String toString(){ // Fungsi ini ternyata ngaruh banget 
        return "Nama: " + getNama();
    }
}
