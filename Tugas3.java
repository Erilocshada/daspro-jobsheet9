import java.util.Scanner;

public class Tugas3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int hasil = 0;
        String menu [] = {"Nasi Goreng", "Mie Goreng",
        "Roti Bakar", "Kentang Goreng",
        "Teh Tarik", "Cappucino", "Chocolate Ice"};

        System.out.println("===============DAFTAR MENU=================");
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i+1) +". "+ menu[i]);
        }
        System.out.println();
        System.out.println("============= PENCARIAN MENU ================");
        System.out.print("Masukkan menu yang ingin dicari : ");
        String key = input.nextLine();
        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(key)) {
                hasil = i + 1;
                break;
            }
        }
        System.out.println();
        System.out.println("============= HASIL PENCARIAN ===============");
        
        if (hasil !=0) {
            System.out.println("Menu tersedia");
        } else{
            System.out.println("Menu tidak tersedia");
        }
        input.close();
    }
}