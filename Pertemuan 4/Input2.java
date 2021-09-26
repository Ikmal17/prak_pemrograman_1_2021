import java.util.Scanner;

public class Input2 {

    public static void main(String [] args){

        Scanner userInput = new Scanner(System.in);
        int panjang, lebar, luas, tinggi, volume;
        //Membuat perhitungan menghitung luas persegi panjang
        //luas = panjang * lebar
        
        System.out.println("===== Menghitunng Luas =====");
        System.out.print("Panjang = ");
        panjang = userInput.nextInt();
        System.out.print("Lebar = ");
        lebar = userInput.nextInt();

        luas = panjang * lebar;
        System.out.println("Luas = " + luas);

        System.out.println("===== Menghitung Volume =====");
        System.out.print("Tinggi = ");
        tinggi = userInput.nextInt();
        volume = luas * tinggi;
        System.out.print("Volume = " + volume);
    }  
}