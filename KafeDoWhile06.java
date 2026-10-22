import java.util.Scanner;
public class KafeDoWhile06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int kopi, teh, roti;
        String nama;
        int hargaKopi=12000, hargaTeh=7000, hargaRoti=20000, totalHarga;

        do {
            System.out.print("Masukkan nama pelanggan (ketik 'batal' untuk keluar): ");
            nama = sc.nextLine();
            if (nama.equalsIgnoreCase("batal")){
                System.out.println("Transaksi dibatalkan.");
                break;
            }
            System.out.print("Jumlah Kopi: ");
            kopi = sc.nextInt();
            System.out.print("Jumlah Teh: ");
            teh = sc.nextInt();
            System.out.print("Jumlah Roti: ");
            roti = sc.nextInt();
            totalHarga = (kopi*hargaKopi) + (teh*hargaTeh) + (roti*hargaRoti);
            System.out.println("Total harga yang harus di bayar: " +totalHarga);
            sc.nextLine();
        } while (true);
    }
}
