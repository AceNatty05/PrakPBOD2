package bangundatar;

/**
 *
 * @author Natasya
 */
public class Segitiga extends BangunDatar {
    private double sisiA;
    private double sisiB;
    private double sisiC;
    
    public Segitiga(double sisiA, double sisiB, double sisiC){
        this.sisiA = sisiA;
        this.sisiB = sisiB;
        this.sisiC = sisiC;
    }
    
    public double hitungKeliling(){
        return sisiA+sisiB+sisiC;
    }
}
