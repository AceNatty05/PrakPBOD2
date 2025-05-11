package Anabul;

/**
 *
 * @author Natasya
 */
public class Anjing extends Anabul {
    public Anjing(String nama){
        super(nama);
    }
    
    public void Gerak(){
        System.out.println("Melata");
    }
    public void Bersuara(){
        System.out.println("Guk");
    }
    
    @Override
    public String toString(){ /*Implementasinya bisa dengan memanggil Gerak()
        dan Bersuara() tapi harus dibuat function terlebih dahulu sehingga 
        kelas Anabul harus dibuat menjadi abstract class tapi di diagramnya
        bukan abstract (BERPIKIR KERASSS)*/
        return super.toString() + ", suara: Guk, gerakan: Melata";
    }
}
