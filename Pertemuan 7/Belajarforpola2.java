import java.util.Scanner;

public class Belajarforpola2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan nilai = ");
        int n = scan.nextInt();
        if (n % 2 ==0) {

        } else {
            for (int i = 1; i<=n ; i++) {
                for (int j=n; j>=1 ; j--) {
                    if (j<=i) {
                        System.out.print("*");
                    }else {
                        System.out.print(" ");
                    }
                }
                System.out.println("");
            }
        }
    }
}