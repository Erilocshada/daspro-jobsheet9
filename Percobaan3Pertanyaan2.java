import java.util.Scanner;

/**
 * Percobaan3Pertanyaan
 */
public class Percobaan3Pertanyaan2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0, rataRataLulus, rataRataTidakLulus;
        int lulus = 0, tidakLulus = 0;

        System.out.println("Masukkan banyak mahasiswa :");
        int jmlMhs = sc.nextInt();
        int[] nilaiMhs = new int[jmlMhs];

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.println("Masukkan nilai Mahasiswa ke- "+(i+1)+": ");
            nilaiMhs[i] = sc.nextInt();
        }
        for (int i = 0; i < nilaiMhs.length; i++) {
            total += nilaiMhs[i];
            if (nilaiMhs[i] > 70) {
                lulus++;
                rataRataLulus = nilaiMhs[i] / lulus;
            } else if (nilaiMhs[i] <= 70) {
                tidakLulus++;
                rataRataLulus = nilaiMhs[i] / tidakLulus;
            }
        }
        System.out.println();
        System.out.println("Rata rata Mahasiswa Lulus :" + lulus);
        System.out.println("Rata rata Mahasiswa tidak Lulus :" + tidakLulus);
        sc.close();
    }
}
