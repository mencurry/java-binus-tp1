import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //scanner
        Scanner mainScanner = new Scanner(System.in);

        //variables
        String nama;
        String namaPasangan;
        int umur;
        int umurPasangan;
        int x = (int) ((Math.random() * (100 - 50)) + 50);
        double kecocokan = x / 1.1;

        //welcoming user
        System.out.println("Selamat Datang Di Program Ramalan Cupu");
        System.out.println("++++++++++++++++++++++++++++++++++++++\n");

        //get and set user data
        System.out.println("Data Anda : ");
        System.out.println("*************************");
        System.out.print("Masukkan Nama Anda : ");
        nama = mainScanner.nextLine();
        System.out.print("Masukkan Umur Anda : ");
        umur = Integer.parseInt(mainScanner.nextLine());

        //get and set pasangan's data
        System.out.println("\nData Pasangan Anda : ");
        System.out.println("*************************");
        System.out.print("Masukkan Nama Pasangan Anda : ");
        namaPasangan = mainScanner.nextLine();
        System.out.print("Masukkan Umur Pasangan Anda : ");
        umurPasangan = Integer.parseInt(mainScanner.nextLine());

        //output nama + umur. bad implementation of heart icon
        System.out.println("\n" + nama + " [" + umur + "] " + "tahun");
        System.out.println("  ****..****");
        System.out.println("**************");
        System.out.println(" ************ ");
        System.out.println("  ********** ");
        System.out.println("     **** ");
        System.out.println("      ** ");
        System.out.println(namaPasangan + " [" + umurPasangan + "] " + "tahun");

        //prediction result;
        System.out.print("\nTekan ENTER untuk melihat hasil ramalan...");
        mainScanner.nextLine();
        System.out.print("\nKecocokan anda dengan pasangan anda adalah : ");
        System.out.printf("%.2f%%%n", kecocokan);
        System.out.println("\nTerima kasih karena anda telah menggunakan jasa Ramalan kami.. ^^v");
    }
}