package Koleksi;

/**
 *
 * @author Natasya
 */
public class Koleksi<T> {
    // att
    private T[] wadah; // tipe Character agar bisa assign null
    private int nbelm;
    
    // kons
    public Koleksi(){
        this.wadah = (T[]) new Object[10]; // di modul 10
        this.nbelm = 0;
    }
    
    // meth
    public T getIsi(int idx){
        if(idx < 0 || idx >= wadah.length){
            throw new IndexOutOfBoundsException("Index di luar batas");
        }
        if(wadah[idx] == null){
            throw new NullPointerException("Index menunjuk ke objek null");
        }
        
        return wadah[idx];
    }
    
    public void setIsi(int idx, T elemen){
        if(idx < 0 || idx >= wadah.length){
            throw new IndexOutOfBoundsException("Index di luar batas");
        }
        if(wadah[idx] == null){ // hanya bisa mnegubah objek yang sudah ada
            throw new NullPointerException("Index menunjuk ke objek null");
        }
        
        wadah[idx] = elemen;
    }
    
    public void add(T elemen){
        if(nbelm < 10){ // maks 10 karakter
            wadah[nbelm] = elemen;
            nbelm++;
            System.out.println(elemen + " berhasil ditambahkan ke koleksi");
        }else{
            System.out.println("Koleksi sudah penuh");
        }
    }
    
    public void delete(T elemen){ 
        int i;
        for(i = 0; i < nbelm; i++){ 
            if(wadah[i].equals(elemen)) break;
        }
        if(wadah[i].equals(elemen)){
            for(int j = i; j < nbelm-1; j++) wadah[j] = wadah[j+1]; // majuin sisanya
            nbelm--;
            wadah[nbelm] = null; // hapus belakang
        }else{
            System.out.println("Tidak ditemukan " + elemen + " dalam koleksi");
        }
    }
    
    public void showAll(){
        System.out.println("Isi koleksi:");
        for(int i = 0; i < nbelm; i++){
            System.out.println(wadah[i]);
        }
    }
}
 
