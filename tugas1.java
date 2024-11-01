import java.util.Scanner;
public class tugas1 {
    public static void main(String[] args) {

        double rata2;
        double total=0;
        int terendah = 100;
        int tertinggi = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("================= Input Nilai ================");
        System.out.print("Masukkan banyaknya nilai yang akan diinput : ");
        int jumlah = input.nextInt();

        int nilai[] = new int[jumlah];
        
        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
            nilai[i] = input.nextInt();
            
            if (nilai[i]<0 || nilai[i] > 100) {
                System.out.println("Nilai tidak valid, masukkan kembali nilai dengan benar");
                i--;
                continue;
        }
        total += nilai[i];
        }
            System.out.println();
            System.out.println("================ Nilai Mahasiswa ==============");
        for (int i = 0; i < jumlah; i++) {
            System.out.println("Nilai mahasiswa ke-" + (i + 1) + ": " + nilai[i]);
            if (nilai[i]<terendah) {
                terendah = nilai[i];
            } 
            if (nilai[i]>tertinggi) {
            tertinggi = nilai[i];
            }
        }
    rata2 = total/jumlah;
    
    System.out.println();
    System.out.println("========== Rata-Rata Nilai Mahasiswa ==========");
    System.out.println("Rata-rata nilai mahasiswa : " + rata2);
    System.out.println("Nilai terendah : " + terendah);
    System.out.println("Nilai tertinggi : " + tertinggi);
    }
}
