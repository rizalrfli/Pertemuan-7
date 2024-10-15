import java.util.Scanner;

public class Tugas202 {
    
    public static void main(String[] args) {
        
        //deklarasi inputan
        Scanner input = new Scanner(System.in);

        //deklarasi variable
        int jenis, durasi, total = 0, totalAll = 0;

        //daftar kendaraan
        System.out.println("Daftar kendaraan : ");
        System.out.println("1. Mobil");
        System.out.println("2. Motor");
        System.out.println("0. Keluar");

        //logic & input
        do {
            //input kendaraan 
            System.out.println("----------------------------------------");
            System.out.print("Masukkan jenis kendaraan\t : ");
            jenis = input.nextInt();

            //total keseluruhan
            totalAll += total;

            //jika lanjut
            if (jenis == 1 || jenis == 2) {
                System.out.print("Masukkan durasi parkir (jam)\t : ");
                durasi = input.nextInt();
                if (durasi > 5) {
                    total = 12500;
                    System.out.println("total bayar\t\t\t : " + total);
                }
                else {
                    if (jenis == 1) {
                        total = durasi * 3000;    
                        System.out.println("total bayar\t\t\t : " + total);                    
                    }
                    else if (jenis == 2) {
                        total = durasi * 2000;
                        System.out.println("total bayar\t\t\t : " + total);
                    }
                }
            }

        } while (jenis != 0);

        //output ketika selesai
        System.out.println("----------------------------------------");
        System.out.println("Total pembayaran parkir\t\t : " + totalAll);

    }

}