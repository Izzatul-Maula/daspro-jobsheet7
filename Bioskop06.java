import java.util.Scanner;
public class Bioskop06 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int hargaTiket=50000, tiketTerjual=0, totalPendapatan=0, jmlTiket, totalHarga;
       double diskon=0, hargaAkhir, hargaDiskon;
        do {
            System.out.print("Masukkan jumlah Tiket (ketik '-1' untuk keluar): ");
            jmlTiket = sc.nextInt();
            if (jmlTiket == -1 ){
                System.out.println("Transaksi hari ini seleai.");
                break;
            }
    
            if (jmlTiket <0 ){
                System.out.println("Jumlah tiket tidak valid! Masukkan Kembali Jumlah Tiket.");
                continue;
            } else if (jmlTiket > 4 && jmlTiket <10){
                diskon = 0.10;
            } else if (jmlTiket > 10){
                diskon = 0.15;
            } else if ( jmlTiket < 4){
                diskon = 0;
            }
            totalHarga = jmlTiket * hargaTiket;
            hargaDiskon= totalHarga * diskon;
            hargaAkhir = totalHarga - hargaDiskon;

            tiketTerjual += jmlTiket;
            totalPendapatan += hargaAkhir;

            System.out.println("Total tiket terjual: " + jmlTiket + " tiket");
            System.out.println("Total harga penjualan tiket: Rp." + hargaAkhir);
        } while (true);
        System.out.println("Total seluruh tiket terjual: " + tiketTerjual + " tiket");
        System.out.println("Total pendapatan bersih : Rp." + totalPendapatan);
            
    }
}
