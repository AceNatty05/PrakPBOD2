package Koleksi;

/**
 *
 * @author Natasya
 */
public class MainKoleksi {
    public static void main(String[] args){
        // Kamus
        Koleksi<Character> K = new Koleksi<>();
        
        // Algo
        K.add('A');
        K.add('B');
        K.add('C');
        K.add('D');
        K.add('E');
        K.add('f');
        K.add('g');
        K.add('h');
        K.add('i');
        K.add('j');
        K.add('K'); // sudah penuh
        
        System.out.println("Isi koleksi pada index 7: " + K.getIsi(7));
        K.setIsi(7,'W');
        System.out.println("Isi koleksi pada index 7: " + K.getIsi(7));
        K.delete('j');
        K.showAll();
        K.delete('W');
        K.showAll();
        K.add('W');
        K.showAll();
    }
}
