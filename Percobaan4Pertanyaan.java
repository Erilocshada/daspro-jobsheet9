
import java.util.Scanner;

public class Percobaan4Pertanyaan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hasil = 0;

        System.out.println("Masukkan banyaknya nilai yang diinput :");
        int jmlNilai = sc.nextInt();
        int[] arrNilai = new int[jmlNilai];
        for (int i = 0; i < arrNilai.length; i++) {
            System.out.println("Masukkan Nilai Mahasiswa ke-" +(i+1)+":");
            arrNilai[i] = sc.nextInt();
        }
        System.out.println("Masukkan Nilai yang ingin dicari :");
        int key = sc.nextInt();

        for (int i = 0; i < arrNilai.length; i++) {
            if (key == arrNilai[i]) {
                hasil=i+1;
                break;
            }
        }
        if (hasil != 0) {
            System.out.println("\nNilai " + key + " ketemu di indeks ke-" + hasil);
        } else {
            System.out.println("\nNilai " + key + " tidak ditemukan");
        }
        
        sc.close();
    }
}
