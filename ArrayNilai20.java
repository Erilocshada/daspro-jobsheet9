import java.util.Scanner;

public class ArrayNilai20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nilaiAkhir = new int[10];

        System.out.println("Input Nilai Akhir\n");

        for (int i = 0; i < 10; i++) {
            System.out.println("Masukkan nilai akhir ke - "+i+" :");
            nilaiAkhir[i] = sc.nextInt();
        }
        System.out.println("\n Output Nilai Akhir");
        for (int i = 0; i < 10; i++) {
            System.out.println("Mahasiswa ke - "+i+" adalah " + nilaiAkhir[i]);
        }
        sc.close();
    }
}
