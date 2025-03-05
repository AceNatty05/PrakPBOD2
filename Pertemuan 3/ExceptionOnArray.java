public class ExceptionOnArray {
    public static void main(String[] args) {
        // Instansiasi objek array integer
        Integer[] arrayInteger = new Integer[4]; // Array dengan ukuran 4 (indeks 0-3)

        try {
            arrayInteger[2] = 11;  // Valid (indeks dalam batas 0-3)
            arrayInteger[4] = 10;  // Error! Indeks 4 di luar batas
        } catch (ArrayIndexOutOfBoundsException exception) {
            exception.printStackTrace(); // Menampilkan error ke console
        } finally {
            System.out.println("clean up code..."); // Akan selalu dieksekusi
        }
    }
}
