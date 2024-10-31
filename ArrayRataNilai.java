
import java.util.Scanner;

public class ArrayRataNilai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nilaiMhs = new int[10];
        double total = 0, rataRata;

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.println("Masukkan nilai Mahasiswa ke- "+(i+1)+": ");
            nilaiMhs[i] = sc.nextInt();
        }
        for (int i = 0; i < nilaiMhs.length; i++) {
            total += nilaiMhs[i];
        }
        rataRata = total/nilaiMhs.length;
        System.out.println("Rata rata nilai = " + rataRata);
        sc.close();
    }
}
