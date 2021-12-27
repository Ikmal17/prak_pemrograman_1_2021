public class BelajarMethod {
    public static void main(String []args){
        System.out.println(" ");
        menampilkanTeks();
        System.out.println(" ");
        ngawur();
        System.out.println(" ");
        cobacoba();
        System.out.println(" ");
        denganParameter("Ikmal Dwi Darmawan");
        System.out.println(" ");
        String teks = tambahKata("Kalimat Awal");
        System.out.println(teks);
        String nama = tambahDuaParameter("katapertama", "katakedua");
        System.out.println(nama);
    }

    public static void menampilkanTeks() {
        System.out.println("Halo");
        System.out.println("Saya Ikmal Dwi Darmawan");
        System.out.println("Saya Ganteng");
    }

    public static void cobacoba() {
        System.out.println("Kata yang lain");
    }

    public static void ngawur() {
        System.out.println("Bismillah");
    }

    public static void denganParameter(String nama) {
        System.out.println("Nama saya adalah " + nama);
    }

    public static String tambahKata(String kataAwal) {
        String kalimat = "ini adalah kalimat tambahan " + kataAwal;
        return kalimat;
    }

    public static String tambahDuaParameter(String katapertama, String katakedua) {
        String kalimat = "ini adalah kalimat tambahan " + katapertama + katakedua;
        return kalimat;
    }
}