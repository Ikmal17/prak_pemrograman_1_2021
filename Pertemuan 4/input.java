import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Nama anda : ");
        String namaDepan = scanner.nextLine();

        System.out.print("Masukkan Umur Anda : ");
        int Umur = scanner.nextInt();

        System.out.println("Nama Saya adalah " + namaDepan);
        System.out.println("Umur Saya adalah " + Umur);
    }
}