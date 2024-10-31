
import java.util.Scanner;

/**
 * Percobaan1Pertanyaan
 */
public class Percobaan1Pertanyaan {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] bil = {5,13,-7,17};

        for (int i = 0; i < 4; i++) {
            System.out.println(bil[i]);
        }
        sc.close();
    }
}