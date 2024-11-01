import java.util.Scanner;

/**
 * Percobaan3Pertanyaan
 */
public class Percobaan3Pertanyaan {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0, rataRata;
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
            } else if (nilaiMhs[i] <= 70) {
                tidakLulus++;
            }
        }
        rataRata = total/nilaiMhs.length;
        System.out.println("Jumlah Mahasiswa Lulus :" + lulus);
        System.out.println("Jumlah Mahasiswa tidak Lulus :" + tidakLulus);
        System.out.println("Rata rata nilai : " + rataRata);
        sc.close();
    }
}