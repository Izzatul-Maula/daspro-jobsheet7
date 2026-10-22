import  java.util.Scanner;
public class SiakadFor06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nilai, tertinggi = 0, terendah = 100;
        byte jmlLulus =0, jmlGugur =0, nilaiKelulusan = 60;


        for (int i = 1; i <=10; i++){
            System.out.print("Masukkan Nilai Mahasiswa ke-" + i + ": ");
            nilai = sc.nextDouble();
            if (nilai > tertinggi){
                tertinggi = nilai;
            }
            if (nilai < terendah){
                terendah = nilai;
            }
                if (nilai > nilaiKelulusan){
                    jmlLulus++;
                } else {
                    jmlGugur++;
                }
        }
        System.out.println("Nilai Tertinggi: " + tertinggi);
        System.out.println("Nilai Terendah: " + terendah);
        System.out.println("Jumlah Mahasiswa Lulus: " + jmlLulus);
        System.out.println("Jumlah Tidak Lulus: " +  jmlGugur);
    }
    
}
