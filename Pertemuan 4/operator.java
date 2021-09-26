public class operator {
    public static void main(String[] args){
        System.out.println("===== OPERATOR =====");

        System.out.println("");
        //Operator
        System.out.println("1. Penegasan (=) ");

         int bilangan = 10;

         System.out.println("bilangan = " + bilangan);

         System.out.println("");

        System.out.println("2. Aritmetika (+, -, *, /, %, ++, --, +=, -=)");
        
        int bil1 = 18;
        int bil2 = 9;
        int hasil1 = bil1 + bil2;
        
        System.out.println("Hasil penjumlahan = " + hasil1);
        
        int bil3 = 18;
        int bil4 = 9;
        int hasil2 = bil3 - bil4;
         
        System.out.println("Hasil pengurangan = " + hasil2);
        
        int bil5 = 18;
        int bil6 = 9;
        int hasil3 = bil5 * bil6;
        
        System.out.println("Hasil perkalian = " + hasil3);
        
        int bil7 = 18;
        int bil8 = 9;
         int hasil4 = bil7 / bil8;
         
         System.out.println("Hasil pembagian = " + hasil4);
         
         int bil9 = 18;
         int bil10 = 9;
         int hasil5 = bil9 % bil10;
         
         System.out.println("Sisa hasil bagi = " + hasil5);
         
         int bil11 = 180;
         bil11++;
         
         //bilangan ditambah 1
         
         System.out.println("hasil plus satu dari = " + bil11);
         
         int bil12 = 190;
         bil12--;
         
         //bilangan dikurang 1
         
         System.out.println("hasil min satu dari = " + bil12);
         
         int bil13 = 180;
         bil13 += 7;
         
         //bilangan ditambah dengan bilangan yang ditulis yaitu 7
         
         System.out.println("hasil = " + bil13);
         
         float bil14 = 180;
         bil14 -= 10.5;
         
         //bilangan dikurang dengan bilanganyang ditulis yaitu 10.5
         //float apabila koma
         
         System.out.println("hasil = " + bil14);
         
         System.out.println("");
         
         System.out.println("3. Pembanding (<, >, <=, >=, ==, !=)");

         int bil15 = 27;
         int bil16 = 85;
         boolean hasil6 = bil15 < bil16;

         System.out.println("27 lebih kecil dari 85 adalah = " + hasil6);

         int bil17 = 27;
         int bil18 = 85;
         boolean hasil7 = bil17 > bil18;

         System.out.println("27 lebih besar dari 85 adalah = " + hasil7);

         int bil19 = 27;
         int bil20 = 85;
         boolean hasil8 = bil19 <= bil20;

         System.out.println("27 lebih kecil sama dengan dari 85 adalah = " + hasil8);

         int bil21 = 27;
         int bil22 = 85;
         boolean hasil9 = bil21 >= bil22;

         System.out.println("27 lebih besar sama dengan dari 85 adalah = " + hasil9);

         int bil23 = 27;
         int bil24 = 85;
         boolean hasil10 = bil23 == bil24;

         System.out.println("27 sama dengan dari 85 adalah = " + hasil10);

         int bil25 = 27;
         int bil26 = 85;
         boolean hasil11 = bil25 != bil26;

         System.out.println("27 tidak sama dengan dari 85 adalah = " + hasil11);

         System.out.println("");

         System.out.println("4. Logika (&&, //, !)");

        int totalBayar1 = 150000;
        boolean shoopingCard1 = false;
        
        //logika &&(dan) akan bernilai true bila semua true
        
        boolean hasil12 = totalBayar1 >= 100000 && shoopingCard1 == true;
        
        System.out.println("Apakah akan mendapat diskon = " + hasil12);

        int totalBayar2 = 150000;
        boolean shoopingCard2 = false;

        //logika ||(or) akan bernilai true bila salah satu true 

        boolean hasil13 = totalBayar2 >= 100000 || shoopingCard2 == true;
    
        System.out.println("Apakah akan mendapat diskon = " + hasil13);

        int totalBayar3 = 150000;
        boolean shoopingCard3 = false;

        //logika !(not) adalah logika yang membalikan hasil yaitu apabila true akan false

        boolean hasil14 = totalBayar3 >= 100000 || shoopingCard3 == true;
        hasil14 = !hasil14;
    
        System.out.println("Apakah akan mendapat diskon = " + hasil14);

        System.out.println("");

        System.out.println("===== Alhamdulillah Selesai =====");
        }
    }