public class Variabel {
    /* Macam Variabel
    String, Integer, Float, Char, Boolean*/
    //Contoh Untuk String
    public static void main(String[] args){
        System.out.println("----- STRING ----");
        //dalam java nama varibel lebih baik diawali dengan huruf kecil
        String name = "Ikmal Dwi Darmawan";
        System.out.println(name);
        System.out.println(" ");
        System.out.println("-----INTEGER-----");
        int umur = 18;
        System.out.println("Umur Saya Adalah " + umur);
        System.out.println(" ");
        System.out.println("-----FLOAT-----");
        double ipk = 4.0;
        System.out.println("IPK Saya Adalah " + ipk);
        System.out.println(" ");
        System.out.println("-----HASIL-----");
        System.out.println("Nama Saya Adalah " + name);
        System.out.print("Saya Berumur "+ umur);
        System.out.print(" Saya lulus kuliah dengan IPK " + ipk);
    }
}
