import java.util.Scanner;
public class SiakadFor01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //deklarasi variabel
        double nilai, tertinggi = 0, terendah = 100;

        //memasukkan `kondisi
        for (int i = 1; i < 10; i++){
            System.out.print("Masukkan nilai mahasiswa ke-" + i + ": ");
            nilai = sc.nextDouble();
            if (nilai > tertinggi){
                tertinggi = nilai;
            }
            if (nilai < terendah){
                terendah = nilai;
            }
         }
         //output
         System.out.println("Nilai tertinggi: " + tertinggi);
         System.out.println("Nilai terendah: " + terendah);
    }
}