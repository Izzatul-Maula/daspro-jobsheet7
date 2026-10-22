import java.util.Scanner;
public class Prakir06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int jenis, durasi, total=0;

        do {
            System.out.print("Masukkan jenis transportasi (1.mobil/2.motor/0.keluar): ");
            jenis = sc.nextInt();
            if (jenis == 1 || jenis == 2 ){
                System.out.print("Masukkan durasi parkir: ");
                durasi = sc.nextInt();
                if (jenis == 1){
                    total+= durasi*3000;
                } else {
                    total += durasi*2000;
                }
                 System.out.println("total biaya: Rp." + total );
            } else if (jenis !=0);
                continue;
        } while (true);
           
        
    }
}
