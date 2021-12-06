import java.util.Scanner;

public class BelajarPerulanganIf {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan bilangan genap maksimal yang akan ditampilkan = ");
        int n = sc.nextInt();
        int i = 1;
        while (i != n) {
            if (i % 2 == 0){
                System.out.println(i);
            } 
            i++;
        }
    }
}
