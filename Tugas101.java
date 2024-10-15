
import java.util.Scanner;

public class Tugas101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //deklarasi variabel
        int hargaTiket, jumlahTiket, diskon;
        double totalHarga = 0, totalTiket = 0;
        boolean isLanjut = true;

        //kondisi perulangan
        while (isLanjut) {
            System.out.print("Input jumlah tiket: ");
            jumlahTiket = sc.nextInt();
            if (jumlahTiket < -0) {
                System.out.println("Input invalid");
                continue;
            } else {
                hargaTiket = jumlahTiket * 50000;
                if(jumlahTiket > 10){
                    diskon = (int) (0.15 * hargaTiket);
                } else if (jumlahTiket > 4) {
                    diskon = (int) (0.1 * hargaTiket);
                }else {
                    diskon = 0;
                }
                hargaTiket=hargaTiket-diskon;
                totalTiket=totalTiket-jumlahTiket;
                totalHarga=totalHarga+hargaTiket;
                System.out.print("lanjut (true/false): ");
                isLanjut = sc.nextBoolean();
            }
        }
        System.out.println("Total tiket: " + totalTiket);
        System.out.println("Total harga: " + totalHarga);
    }
}

        