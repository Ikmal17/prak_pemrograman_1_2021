import java.util.Scanner;

public class Operator2 {
    public static void main(String[] args){
        System.out.println(" ");
        System.out.println("=====OPERATOR COMPARISON=====");
        System.out.println(" ");
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan Nilai A = ");
        double a = sc.nextDouble();
        System.out.print("Masukkan Nilai B = ");
        double b =  sc.nextDouble();
        System.out.println("A == B = " + (a==b));
        System.out.println("A != B = " + (a!=b));
        System.out.println("A > B = " + (a>b));
        System.out.println("A < B = " + (a<b));
        System.out.println("A >= B = " + (a>=b));
        System.out.println("A <= B = " + (a<=b));
        System.out.println(" ");
        System.out.println("=====OPERATOR LOGIC=====");
        System.out.println(" ");
        boolean hasil = (a > 7 && b < 8);
        System.out.println("Nilai dari a > 7 && b < 8 = " + hasil);
        System.out.println("Nilai dari a > 7 ! b < 8 = " + !hasil);
        System.out.println("Nilai dari A>B && A<B = " + (a>b && a<b));
        System.out.println("Nilai dari A<B || A==B = " + (a<b || a==b));
        System.out.println("Nilai dari A!=B ! A<B = " + !(a!=b && a<b));
    }
}
