// Nama file :
// Deskripsi :
// Nama||NIM : 

public class CoersionExample{
    public static void main(String[] args) {
        // 1
        int output1 = 'a';
        System.out.println("1. " + output1);

        // 2
        double x = 15.5;
        int output2 = (int)x;
        System.out.println("2. " + output2);

        // 3
        int y = 25;
        double output3 = y;
        System.out.println("3. " + output3);

        // 4
        int z = 78;
        char output4 = (char)z;
        System.out.println("4. " + output4);

        // 5
        char a = 'a';
        double output5 = a;
        System.out.println("5. " + output5);
    }
}