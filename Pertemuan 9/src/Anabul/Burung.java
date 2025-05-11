package Anabul;

/**
 *
 * @author Natasya
 */
public class Burung extends Anabul {
    public Burung(String nama){
        super(nama);
    }
    
    public void Gerak(){
        System.out.println("Terbang");
    }
    public void Bersuara(){
        System.out.println("Cuit");
    }
    
    @Override
    public String toString(){ /*Implementasinya bisa dengan memanggil Gerak()
        dan Bersuara() tapi harus dibuat function terlebih dahulu sehingga 
        kelas Anabul harus dibuat menjadi abstract class tapi di diagramnya
        bukan abstract (BERPIKIR KERASSS)*/
        return super.toString() + ", suara: Cuit, gerakan: Terbang";
    }
}
