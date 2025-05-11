package Anabul;

/**
 *
 * @author Natasya
 */
public class Kucing extends Anabul {
    public Kucing(String nama){
        super(nama);
    }
    
    public void Gerak(){
        System.out.println("Melata");
    }
    public void Bersuara(){
        System.out.println("Meong");
    }
    
    @Override
    public String toString(){ /*Implementasinya bisa dengan memanggil Gerak()
        dan Bersuara() tapi harus dibuat function terlebih dahulu sehingga 
        kelas Anabul harus dibuat menjadi abstract class tapi di diagramnya
        bukan abstract (BERPIKIR KERASSS)*/
        return super.toString() + ", suara: Meong, gerakan: Melata";
    }
}
