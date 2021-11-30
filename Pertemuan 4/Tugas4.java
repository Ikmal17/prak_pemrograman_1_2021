import java.util.Scanner;

public class Tugas4 {
    public static void main(String[] args){
        System.out.println("=====TUGAS PERTEMUAN KE 4=====");
        System.out.println(" ");
        Scanner sc = new Scanner(System.in);

        System.out.print("Berapakah Harga Buah Jeruk             : ");
        long hargaJeruk = sc.nextLong();

        System.out.print("Berapakah Harga Buah Apel              : ");
        long hargaApel = sc.nextLong();
        
        long total = hargaJeruk + hargaApel;
        System.out.println("Uang yang harus anda bayar sebesar   : " + total);
        
        Long diskon = hargaJeruk - hargaApel;
        System.out.println("Diskon yang anda dapatkan            : " + diskon);

        System.out.print("Berapakah Buah Jeruk Yang Anda Beli    : ");
        int jumlahJ = sc.nextInt();
        
        long kaliJ = hargaJeruk * jumlahJ;
        System.out.println("Jumlah uang yang akan anda bayarkan  : " + kaliJ);

        System.out.print("Berapakah Buah Apel Yang Anda Beli     : ");
        int jumlahA = sc.nextInt();

        Long kaliA = hargaApel * jumlahA;
        System.out.println("Jumlah uang yang harus anda bayarkan : " + kaliA);

        Long pembagian = kaliJ / kaliA;
        System.out.println("Pembagian dari kedua buah tersebut   : " + pembagian);

        Long modulus = kaliJ % kaliA;
        System.out.println("Modulus dari kedua buah tersebut     : " + modulus);

        System.out.println(" ");
        System.out.println("=====Semoga Bermanfaat:)=====");
    } 
}