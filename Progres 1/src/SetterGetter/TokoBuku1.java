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
public class TokoBuku1 {
    //Mendeklarasikan Variabel
    //Menerapkan Enkapsulasi
    public String nama_kasir;
    public String nama_pembeli;
    public String tgl_pembelian;
    public String jenis_buku;
    public String nama_buku;
    public String bonus_pembelian;
    public String display;
    public int harga_buku1 = 78000;
    public int harga_buku2 = 81000;
    public int harga_buku3 = 55000;
    public int harga_buku4 = 66000;
    public int harga_buku5 = 79000;
    public int harga_buku6 = 98000;
    public int potongan_harga = 3000;
    public int total;
    public int total_akhir;
    public int jmlh_buku;
    public int pilihan;
      
      //Untuk mengambil inputan dari keyboard
      Scanner input = new Scanner(System.in);
      
    //Menerapkan method void  
    public void Sapaan(){
        System.out.println("--- SELAMAT DATANG DI TOKO TOGAMAS ---");
        System.out.println("======================================");
    }
    
    //Menerapkan method void
    public void DartarBuku(){
        System.out.println("DAFTAR NAMA BUKU");
        System.out.println("1. Ilmu Pengetahuan Alam");
        System.out.println("2. Ilmu Pengetahuan Sosial");
        System.out.println("3. Pendidikan Agama Islam");
        System.out.println("4. Matematika");
        System.out.println("5. Pendidikan Pancasila dan Kewarganegaraan");
        System.out.println("6. Informati");
    }
  
    //Menerapkan method void
    public void Pemilihan(){
        System.out.print("Masukkan No.Daftar Nama Buku Yang Akan Anda Beli: ");
        pilihan = input.nextInt();
        
        //Menerapkan percabangan switch case untuk menentukan pilihan
        switch(pilihan){
            case 1:
                nama_buku = "Ilmu Pengetahuan Alam";
                System.out.println("Harga Buku: "+harga_buku1);
                System.out.print("Masukkan Jumlah Buku Yang Di Inginkan: ");
                jmlh_buku = input.nextInt();
                //Rumus untuk total
                total = harga_buku1*jmlh_buku;
                
            break;
            
            case 2:
                nama_buku = "Ilmu Pengetahuan Sosial";
                System.out.println("Harga Buku: "+harga_buku2);
                System.out.print("Masukkan Jumlah Buku Yang Di Inginkan: ");
                jmlh_buku = input.nextInt();
                //Rumus untuk total
                total= harga_buku2*jmlh_buku;
                
            break;
                
            case 3:
                nama_buku = "Pendidikan Agama Islam";
                System.out.println("Harga Buku: "+harga_buku3);
                System.out.print("Masukkan Jumlah Buku Yang Di Inginkan: ");
                jmlh_buku = input.nextInt();
                //Rumus untuk total
                total = harga_buku3*jmlh_buku;
                
            break;
                
            case 4:
                nama_buku = "Matematika";
                System.out.println("Harga Buku: "+harga_buku4);
                System.out.print("Masukkan Jumlah Buku Yang Di Inginkan: ");
                jmlh_buku = input.nextInt();
                //Rumus untuk total
                total = harga_buku4*jmlh_buku;
                
            break;
                
            case 5:
                nama_buku = "Pendidikan Pancasila dan Kewarganegaraan";
                System.out.println("Harga Buku: "+harga_buku5);
                System.out.print("Masukkan Jumlah Buku Yang Di Inginkan: ");
                jmlh_buku = input.nextInt();
                //Rumus untuk total
                total = harga_buku5*jmlh_buku;
                
                
            break;
                
            case 6:
                nama_buku = "Informatika";
                System.out.println("Harga Buku: "+harga_buku6);
                System.out.print("Masukkan Jumlah Buku Yang Di Inginkan: ");
                jmlh_buku = input.nextInt();
                //Rumus untuk total
                total = harga_buku6*jmlh_buku;
                
                
            break;
                
            default:
                nama_buku = "Maaf Tidak Ada Daftar Nama Buku Yang Anda Inginkan";
                
            break;
        }
        System.out.println("\nPilihan Nama Buku Yang Akan Anda Beli Adalah: "+nama_buku);
    }
    
    //Menerapkan method void
    public void Kasir(){
        System.out.println("Silahkan Melakukan Proses Pembayaran");
    }
    
    //Menerapkan method void setter
    //Untuk meng-set nilai atribut ke dalam variabel
    public void setNama_Kasir(String nama_kasir){//Menerapkan parameter
    //this.variabel digunakan untuk mengakses variabel instance yang dibayangi oleh parameter
        this.nama_kasir = nama_kasir;
    }
    
    //Menerapkan method void getter
    //Untuk mengambil nilai atribut dan di returnkan (dikembalikan)
    public String getNama_Kasir(){
    //Mengembalikan atau mengoutputkan nilai
        return nama_kasir;
    }
    
    //Menerapkan method void setter
    //Untuk meng-set nilai atribut ke dalam variabel
    public void setNama_Pembeli(String nama_pembeli){//Menerapkan parameter
    //this.variabel digunakan untuk mengakses variabel instance yang dibayangi oleh parameter
        this.nama_pembeli = nama_pembeli;
    }
    
    //Menerapkan method void getter
    //Untuk mengambil nilai atribut dan di returnkan (dikembalikan)
    public String getNama_Pembeli(){
    //Mengembalikan atau mengoutputkan nilai
        return nama_pembeli;
    }
    
    //Menerapkan method void setter
    //Untuk meng-set nilai atribut ke dalam variabel
    public void setTgl_Pembelian(String tgl_pembelian){//Menerapkan parameter
    //this.variabel digunakan untuk mengakses variabel instance yang dibayangi oleh parameter
        this.tgl_pembelian = tgl_pembelian;
    }
    
    //Menerapkan method void getter
    //Untuk mengambil nilai atribut dan di returnkan (dikembalikan)
    public String getTgl_Pembelian(){
    //Mengembalikan atau mengoutputkan nilai
        return tgl_pembelian;
    }
    
    //Menerapkan method void setter
    //Untuk meng-set nilai atribut ke dalam variabel
    public void setJenis_Buku(String jenis_buku){//Menerapkan parameter
    //this.variabel digunakan untuk mengakses variabel instance yang dibayangi oleh parameter
        this.jenis_buku = jenis_buku;
    }
    
    //Menerapkan method void getter
    //Untuk mengambil nilai atribut dan di returnkan (dikembalikan)
    public String getJenis_Buku(){
    //Mengembalikan atau mengoutputkan nilai
        return jenis_buku;
    }
    
    //Menerapkan method void setter
    //Untuk meng-set nilai atribut ke dalam variabel
    public void setBonus_Pembelian(String bonus_pembelian){//Menerapkan parameter
    //this.variabel digunakan untuk mengakses variabel instance yang dibayangi oleh parameter
        this.bonus_pembelian = bonus_pembelian;  
    }
    
    //Menerapkan method void getter
    //Untuk mengambil nilai atribut dan di returnkan (dikembalikan)
    public String getBonus_Pembelian(){
    //Mengembalikan atau mengoutputkan nilai
        return bonus_pembelian;
    }
    
    //Menerapkan method void
    public void TotalBayar(){
        //Rumus untuk total_akhir
        total_akhir = total-potongan_harga;
        System.out.println("Total Pembayaran Anda Adalah: "+total_akhir);
    }
    //Menerapkan method void
    public void Display(){
        System.out.println("Nama Kasir: "+getNama_Kasir());
        System.out.println("Nama Pembeli: "+getNama_Pembeli());
        System.out.println("Tanggal Pembelian: "+getTgl_Pembelian());
        System.out.println("Jenis Buku: "+getJenis_Buku());
        System.out.println("Bonus Pembelian: "+getBonus_Pembelian());
    }
    
   
   
    
      
      
    
}
