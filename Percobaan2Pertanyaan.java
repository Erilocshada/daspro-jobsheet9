import java.util.Scanner;
public class Percobaan2Pertanyaan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nilaiAkhir = new int[10];

        System.out.println("Input Nilai Akhir\n");

        for (int i = 0; i < nilaiAkhir.length; i++) {
            System.out.println("Masukkan nilai akhir ke - "+i+" :");
            nilaiAkhir[i] = sc.nextInt();
        }
        System.out.println("\n Output Nilai Akhir");
        for (int i = 0; i < nilaiAkhir.length; i++) {
            if (nilaiAkhir[i] > 70) {
            System.out.println("Mahasiswa ke - "+i+" lulus!");
            }else{
                System.out.println("Mahasiswa ke - "+i+" tidak lulus!");
            }
        }
        sc.close();
    }
}
