
import java.util.Scanner;

public class SearchNilai20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hasil = 0;
        int[] arrNilai = {80,85,78,96,90,82,86};
        int key = 90;

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
