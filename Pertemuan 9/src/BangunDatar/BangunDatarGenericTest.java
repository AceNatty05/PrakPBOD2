package bangundatar;

/**
 *
 * @author Natasya
 */
public class BangunDatarGenericTest {
    public static void main(String[] args){
        // LINGKARANNNNNN
        Lingkaran L = new Lingkaran(2);
        BangunDatarGenerik<Lingkaran> Ling = 
                new BangunDatarGenerik<Lingkaran>();
        Ling.set(L);
        System.out.println("Keliling lingkaran: " + 
                Ling.hitungKeliling());
        System.out.println("Tipe generic: " +
                Ling.get().getClass().getName());
        
        // PERSEGIIIII
        Persegi P = new Persegi(4);
        BangunDatarGenerik<Persegi> Per = 
                new BangunDatarGenerik<Persegi>();
        Per.set(P);
        System.out.println("Keliling persegi: " + 
                Per.hitungKeliling());
        System.out.println("Tipe generic: " +
                Per.get().getClass().getName());
        
        // PERSEGI PANJANGGGGGGGGGGGG 
        PersegiPanjang PP = new PersegiPanjang(2,4);
        BangunDatarGenerik<PersegiPanjang> PerPan = 
                new BangunDatarGenerik<PersegiPanjang>();
        PerPan.set(PP);
        System.out.println("Keliling persegi panjang: " + 
                PerPan.hitungKeliling());
        System.out.println("Tipe generic: " +
                PerPan.get().getClass().getName());
        
        // SEGITIGAAAAAAAAAAAAAAAA
        Segitiga S = new Segitiga(2,4,6);
        BangunDatarGenerik<Segitiga> Seg = 
                new BangunDatarGenerik<Segitiga>();
        Seg.set(S);
        System.out.println("Keliling segitiga: " + 
                Seg.hitungKeliling());
        System.out.println("Tipe generic: " +
                Seg.get().getClass().getName());
    }
}
