import java.util.Scanner;

public class ElseIf {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Umur Anda : ");
        int umur = sc.nextInt();
        if (umur < 5 && umur >= 0) {
            System.out.println("Anda masih Balita");
        }else if (umur > 5 && umur < 19){
            System.out.println("Anda sudah Remaja");
        }else if (umur > 19){
            System.out.println("Anda sudah Dewasa");
        }else {
            System.out.println("Umur anda tidak valid");
        }
    }
}
