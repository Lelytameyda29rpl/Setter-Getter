/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SetterGetter;

/**
 *
 * @author MOKLET-2
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Mendeklarasikan objek
        TokoBuku1 object1 = new TokoBuku1();
        TokoBuku2 object2 = new TokoBuku2();
        
        //Untuk menghasilkan output berupa kalimat
        System.out.println("=======================================");
        System.out.println("Menampilkan Data Pembelian Toko Togamas");
        System.out.println("=======================================");
        
        //Untuk menjalankan method Sapaan
        object1.Sapaan();
        //Untuk menjalankan method DaftarBuku
        object1.DartarBuku();
        //Untuk menjalankan method Pemilihan
        object1.Pemilihan();
        //Untuk menjalankan method Kasir
        object1.Kasir();
        //Untuk menjalankan method setter untuk Nama_Kasir
        object1.setNama_Kasir("Dita");
        //Untuk menjalankan method setter untuk Nama_Pembeli
        object1.setNama_Pembeli("Raini");
        //Untuk menjalankan method setter Tgl_Pembelian
        object1.setTgl_Pembelian("29 April 2021");
        //Untuk menjalankan method setter Jenis_Buku
        object1.setJenis_Buku("Pelajaran");
        //Untuk menjalankan method setter Bonus_Pembelian
        object1.setBonus_Pembelian("Note Book");
        //Untuk menjalankan method Display
        object1.Display();
        //Untuk menjalankan method TotalBayar
        object1.TotalBayar();
        
        //Untuk menghasilkan output berupa kalimat
        System.out.println("=======================================");
        System.out.println("Menampilkan Data Pembelian Toko Salemba");
        System.out.println("=======================================");
        
        //Untuk menjalankan method Sapaan
        object2.Sapaan();
        //Untuk menjalankan method DaftarBuku
        object2.DartarBuku();
        //Untuk menjalankan method Pemilihan
        object2.Pemilihan();
        //Untuk menjalankan method Kasir
        object2.Kasir();
        //Untuk menjalankan method setter untuk Nama_Kasir
        object2.setNama_Kasir("Diana");
        //Untuk menjalankan method setter untuk Nama_Pembeli
        object2.setNama_Pembeli("Vina");
        //Untuk menjalankan method setter Tgl_Pembelian
        object2.setTgl_Pembelian("30 April 2021");
         //Untuk menjalankan method setter Jenis_Buku
        object2.setJenis_Buku("Novel");
         //Untuk menjalankan method setter Bonus_Pembelian
        object2.setBonus_Pembelian("Poster");
        //Untuk menjalankan method Display
        object2.Display();
        //Untuk menjalankan method TotalBayar
        object2.TotalBayar();
    }
    
}
