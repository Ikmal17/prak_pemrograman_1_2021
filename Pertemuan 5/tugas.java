import java.util.Scanner;

public class tugas {
    //Buatlah program sederhana yang dapat mengetahui seseorang tersebut memiliki predikat kelulusan :
    public static void main(String[] args){
        Scanner IPK = new Scanner(System.in);
        System.out.print("Berapakah IPK anda : ");
        double ipk = IPK.nextDouble();
        System.out.print("Lulus dalam : ");
        int lulus = IPK.nextInt();
        
        //a. Dengan pujian tertinggi (Summa Cumlaude): IPK >= 3.51 dan lulus dalam <= 4 tahun
        if(ipk >= 3.51 && lulus <=4){
            System.out.println("Summa Cumlaude");
            //b. Dengan pujian (Cumlaude); IPK >= 3.51
        }else if (ipk >= 3.51){
            System.out.println("Cumlaude");
            //c. Sangat memuaskan : IPK >= 3.01 dan IPK < 3.51
        }else if (ipk >= 3.01 && ipk < 3.01){
            System.out.println("Sangat Memuaskan");
            //d. Memuaskan : IPK >= 2.76 dan IPK < 3.01
        }else if (ipk >= 2.76 && ipk < 3.01){
            System.out.println("Memuaskan");
            //e. Cukup : IPK >= 2.00 dan IPK , 2.76
        }else if (ipk >= 2.00 && ipk < 2.76){
            System.out.println("Cukup");
            //f. Tidak lulus : IPK < 2.00
        }else if (ipk < 2.00){
            System.out.println("Tidak lulus");
            //g. Tidak valid : IPK > 4 atau IPK < 0
        }else{
            System.out.println("Tidak valid");
        }
    }
    
}
