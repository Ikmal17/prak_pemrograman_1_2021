import java.util.Scanner;

public class Tugas5 {
    public static void main(String[] args){
        System.out.println(" ");
        System.out.println("===== TUGAS PERTEMUAN 5 =====");
        System.out.println(" ");
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Nama Lengkap Anda        : ");
        String nama = sc.nextLine();

        System.out.print("Masukkan prodi Anda               : ");
        String prodi = sc.nextLine();

        System.out.print("Masukkan NIM Anda                 : ");
        Long nim =sc.nextLong();

        System.out.print("Masukkan rentan tahun kuliah Anda : ");
        int kuliah = sc.nextInt();
        
        System.out.print("Masukkan IPK Anda                 : ");
        Double ipk = sc.nextDouble();
        System.out.println(" ");

        System.out.println("----- Predikat Kelulusan Untuk Anda -----");
        if (ipk >= 3.51 && kuliah <= 4) {
            System.out.println("Selamat Anda Mendapatkan Predikat Summa Cumlaude");
        }else if (ipk >= 3.51) {
            System.out.println("Selamat Anda Mendapatkan Predikat Cumlaude");
        }else if (ipk >= 3.01 && ipk < 3.51) {
            System.out.println("Selamat Anda Mendapatkan Predikat Sangat Memuaskan");
        }else if (ipk >= 2.76 && ipk < 3.01) {
            System.out.println("Selamat Anda Mendapatkan Predikat Memuaskan");
        }else if (ipk >=2 && ipk <= 2.76) {
            System.out.println("Selamat Anda Mendapatkan Predikat Cukup");
        }else if (ipk < 2.00) {
            System.out.println("Selamat Anda Mendapatkan Predikat Tidak Lulus");
        }else {
            System.out.println("Maaf Data yang Anda Masukkan Tidak Valid");
        }
        System.out.println(" ");
    }
}
