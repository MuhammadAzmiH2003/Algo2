import model.perhitungan;

public class Jalankanperhitungan {
    public static void main(String[] args) {
        
        perhitungan s=new perhitungan(4, 5, 0);
        System.out.println("----------");
        System.out.println("Hasil pertambahan :");
        int hasiltambah = s.hasiltambah(30, 29);
        System.out.println(hasiltambah);


        System.out.println("----------");
        System.out.println("Hasil Perkalian :");
        int hasilkali = s.hasilkali(500, 10);
        System.out.println(hasilkali);
        

    }
    
}
// Tugas Mandiri
        // Tampilkan hasil perhitungan dengan memanggil method yg ada pada perhitungan.java,
        // Method yg dibuat menerima parameter dan mengembalikan nilai (method with return).
        // Dikumpulkan hari sabtu,23 april 2022
        // Dikirim ke "aherijanto@mimoapps.xyz"email berupa github repo masing2
        // Subject email : TM_NIM_NamaLengkap_Kelas
        // e.g : TM_21090036_Muhammmad Azmi Hidayatulloh_2C
