import java.util.Scanner;

public class Condition {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Bilangan Bulat : ");
        int x = sc.nextInt();
        int sisa = x % 2;
        if (sisa==0) {
            System.out.println("Anda memasukkan bilangan genap");
        }else {
            System.out.println("Anda memasukkan bilangan ganjil");
        }
        System.out.println("Terima Kasih");
    }
}
