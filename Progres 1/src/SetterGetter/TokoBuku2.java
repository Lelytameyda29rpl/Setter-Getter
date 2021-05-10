/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SetterGetter;

import java.util.Scanner;//library untuk inputan keyboard

/**
 *
 * @author MOKLET-2
 */
//Menerapkan keyword extends
public class TokoBuku2 extends TokoBuku1 {
    //Mendeklarasikan variabel
    //Menerapkan Enkapsulasi
    public int harga_bukunovel1 = 95000;
    public int harga_bukunovel2 = 94000;
    public int harga_bukunovel3 = 78000;
    public int harga_bukunovel4 = 85000;
    public int harga_bukunovel5 = 65000;
    public int harga_bukunovel6 = 75000;
    public int potongan_harganovel = 2500;
    
    //Untuk mengambil inputan dari keyboard
      Scanner scan = new Scanner(System.in);
    
    //Override
    //Menerapkan method void  
    public void Sapaan(){
        System.out.println("--- SELAMAT DATANG DI TOKO SALEMBA ---");
        System.out.println("======================================");
    }
    
    //Override
    //Menerapkan method void
    public void DartarBuku(){
        System.out.println("DAFTAR NAMA BUKU");
        System.out.println("1. Komet Minor");
        System.out.println("2. Senja dan Pagi");
        System.out.println("3. Laskar Pelangi");
        System.out.println("4. Mariposa");
        System.out.println("5. How Could?");
        System.out.println("6. Bintang");
    }
    
    //Override
    //Menerapkan method void
    public void Pemilihan(){
        System.out.print("Masukkan No.Daftar Nama Buku Yang Akan Anda Beli: ");
        pilihan = input.nextInt();
        
        //Menerapkan percabangan switch case untuk menentukan pilihan
        switch(pilihan){
            case 1:
                nama_buku = "Komet Minor";
                System.out.println("Harga Buku: "+harga_bukunovel1);
                System.out.print("Masukkan Jumlah Buku Yang Di Inginkan: ");
                jmlh_buku = input.nextInt();
                //Rumus untuk total
                total = harga_bukunovel1*jmlh_buku;
                
            break;
            
            case 2:
                nama_buku = "Senja dan Pagi";
                System.out.println("Harga Buku: "+harga_bukunovel2);
                System.out.print("Masukkan Jumlah Buku Yang Di Inginkan: ");
                jmlh_buku = input.nextInt();
                //Rumus untuk total
                total= harga_bukunovel2*jmlh_buku;
                
            break;
                
            case 3:
                nama_buku = "Laskar Pelangi";
                System.out.println("Harga Buku: "+harga_bukunovel3);
                System.out.print("Masukkan Jumlah Buku Yang Di Inginkan: ");
                jmlh_buku = input.nextInt();
                //Rumus untuk total
                total = harga_bukunovel3*jmlh_buku;
                
            break;
                
            case 4:
                nama_buku = "Mariposa";
                System.out.println("Harga Buku: "+harga_bukunovel4);
                System.out.print("Masukkan Jumlah Buku Yang Di Inginkan: ");
                jmlh_buku = input.nextInt();
                //Rumus untuk total
                total = harga_bukunovel4*jmlh_buku;
                
            break;
                
            case 5:
                nama_buku = "How Could?";
                System.out.println("Harga Buku: "+harga_bukunovel5);
                System.out.print("Masukkan Jumlah Buku Yang Di Inginkan: ");
                jmlh_buku = input.nextInt();
                //Rumus untuk total
                total = harga_bukunovel5*jmlh_buku;
                
                
            break;
                
            case 6:
                nama_buku = "Bintang";
                System.out.println("Harga Buku: "+harga_bukunovel6);
                System.out.print("Masukkan Jumlah Buku Yang Di Inginkan: ");
                jmlh_buku = input.nextInt();
                //Rumus untuk total
                total = harga_bukunovel6*jmlh_buku;
                
                
            break;
                
            default:
                nama_buku = "Maaf Tidak Ada Daftar Nama Buku Yang Anda Inginkan";
                
            break;
        }
        System.out.println("\nPilihan Nama Buku Yang Akan Anda Beli Adalah: "+nama_buku);
    }
    
    //Override
    //Menerapkan method void
    public void Kasir(){
        System.out.println("Silahkan Melakukan Proses Pembayaran");
    }
    
    //Override
    //Menerapkan method void setter
    //Untuk meng-set nilai atribut ke dalam variabel
    public void setNama_Kasir(String nama_kasir){//Menerapkan parameter
    //Untuk memanggil method tertentu dari class induk (class TokoBuku1)
        super.nama_kasir = nama_kasir;
    }
    
    //Override
    //Menerapkan method void getter
    //Untuk mengambil nilai atribut dan di returnkan (dikembalikan)
    public String getNama_Kasir(){
    //Mengembalikan atau mengoutputkan nilai
        return nama_kasir;
    }
    
    //Override
    //Menerapkan method void setter
    //Untuk meng-set nilai atribut ke dalam variabel
    public void setNama_Pembeli(String nama_pembeli){//Menerapkan parameter
    //Untuk memanggil method tertentu dari class induk (class TokoBuku1)
        super.nama_pembeli = nama_pembeli;
    }
    
    //Override
    //Menerapkan method void getter
    //Untuk mengambil nilai atribut dan di returnkan (dikembalikan)
    public String getNama_Pembeli(){
    //Mengembalikan atau mengoutputkan nilai
        return nama_pembeli;
    }
    
    //Override
    //Menerapkan method void setter
    //Untuk meng-set nilai atribut ke dalam variabel
    public void setTgl_Pembelian(String tgl_pembelian){//Menerapkan parameter
    //Untuk memanggil method tertentu dari class induk (class TokoBuku1)
        super.tgl_pembelian = tgl_pembelian;
    }
    
    //Override
    //Menerapkan method void getter
    //Untuk mengambil nilai atribut dan di returnkan (dikembalikan)
    public String getTgl_Pembelian(){
    //Mengembalikan atau mengoutputkan nilai
        return tgl_pembelian;
    }
    
    //Override
    //Menerapkan method void setter
    //Untuk meng-set nilai atribut ke dalam variabel
    public void setJenis_Buku(String jenis_buku){//Menerapkan parameter
    //Untuk memanggil method tertentu dari class induk (class TokoBuku1)
        super.jenis_buku = jenis_buku;
    }
    
    //Override
    //Menerapkan method void getter
    //Untuk mengambil nilai atribut dan di returnkan (dikembalikan)
    public String getJenis_Buku(){
    //Mengembalikan atau mengoutputkan nilai
        return jenis_buku;
    }
    
    //Override
    //Menerapkan method void setter
    //Untuk meng-set nilai atribut ke dalam variabel
    public void setBonus_Pembelian(String bonus_pembelian){//Menerapkan parameter
    //Untuk memanggil method tertentu dari class induk (class TokoBuku1)
        super.bonus_pembelian = bonus_pembelian;  
    }
    
    //Override
    //Menerapkan method void getter
    //Untuk mengambil nilai atribut dan di returnkan (dikembalikan)
    public String getBonus_Pembelian(){
    //Mengembalikan atau mengoutputkan nilai
        return bonus_pembelian;
    }
    
    //Override
    //Menerapkan method void
    public void TotalBayar(){
        //Rumus untuk total_akhir
        total_akhir = total-potongan_harganovel;
        System.out.println("Total Pembayaran Anda Adalah: "+total_akhir);
    }
    
    //Override
    //Menerapkan method void
    public void Display(){
        System.out.println("Nama Kasir: "+getNama_Kasir());
        System.out.println("Nama Pembeli: "+getNama_Pembeli());
        System.out.println("Tanggal Pembelian: "+getTgl_Pembelian());
        System.out.println("Jenis Buku: "+getJenis_Buku());
        System.out.println("Bonus Pembelian: "+getBonus_Pembelian());
    }
    
   
      
}
