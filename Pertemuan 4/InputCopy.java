import java.util.Scanner;

public class InputCopy{
    public static void main(String[] args){
        System.out.println("=====INPUT JAVA=====");
        System.out.println(" ");
        Scanner ikmal = new Scanner(System.in);

        System.out.print("Masukkan Nama Anda          : ");
        String namaLengkap = ikmal.nextLine();

        System.out.print("Masukkan NIM Anda           : ");
        long nim = ikmal.nextLong();

        System.out.print("Masukkan Umur Anda          : ");
        int umur = ikmal.nextInt();

        System.out.print("Masukkan Tinggi Badan  Anda : ");
        int tinggiBadan = ikmal.nextInt();
        
        System.out.println("Nama Anda Adalah " + namaLengkap);
        System.out.println("NIM Anda Adalah " + nim);
        System.out.println("Umur Anda Adalah " + umur);
        System.out.println("Tinggi Anda Adalah " + tinggiBadan);
    }
}
