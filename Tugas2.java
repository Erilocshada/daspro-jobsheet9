import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double total=0;
        System.out.println("================MENU KAFE=================");
        System.out.print("Masukkan banyaknya menu yang akan dipesan : ");
        int jumlah = input.nextInt();
        input.nextLine();

        String menu [] = new String[jumlah];
        double harga[] = new double[jumlah];
        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukkan menu ke-" +(i+1)+ " : ");
            menu[i] = input.nextLine();
            System.out.print("Masukkan harga menu ke-" + (i + 1) + " : ");
            harga[i] = input.nextInt();
            input.nextLine();
            total += harga[i];
        }
        System.out.println("Daftar Pesanan");
        for (int i = 0; i < jumlah; i++) {
            System.out.println((i+1)+". " + menu[i]+" = " +harga[i]);
        }
        System.out.println("Total harga : " + total);
    }
}