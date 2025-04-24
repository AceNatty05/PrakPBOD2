public class Bus extends Vehicle{
    void calRent(int jarak,float harga){
        float fare = jarak*harga;
        fare -= 150.00f;
        System.out.println("harga sewa bus = " + fare);
    }
}