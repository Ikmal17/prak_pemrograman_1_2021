import java.util.Scanner;

public class TugasKalkulator {
    
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan nilai A = ");
        int nilaiA = sc.nextInt();
        System.out.print("Masukan nilai B = ");
        int nilaiB = sc.nextInt();

        int hasil = penjumlahan(nilaiA, nilaiB);
        System.out.println("Nilai A + B = " + hasil);
    }

    public static int penjumlahan (int a, int b) {
        int hasil = a + b;
        return hasil;
    }
}
