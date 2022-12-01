import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //scanner
        Scanner mainScanner = new Scanner(System.in);

        //variables
        String nama;
        String namaBarang;
        int jumlahBarang;
        float hargaBeli;
        float hargaJual;

        //get and set nama
        System.out.print("Masukkan nama anda: ");
        nama = mainScanner.nextLine();
        System.out.println("Stock Gudang Input Barang");
        System.out.println("#########################");
        System.out.println("Selamat datang " + nama);

        //get and set barang
        System.out.print("Masukkan nama barang: ");
        namaBarang = mainScanner.nextLine();
        System.out.print("Masukkan jumlah barang yang mau ditambah: ");
        jumlahBarang = mainScanner.nextInt();
        System.out.print("Masukkan harga beli untuk barang tersebut: ");
        hargaBeli = mainScanner.nextFloat();
        System.out.print("Masukkan harga jual untuk barang tersebut: ");
        hargaJual = mainScanner.nextFloat();

        //output data
        System.out.println("Stock Gudang Rincian Barang");
        System.out.println("#########################");
        System.out.println("Nama Barang: " + namaBarang);
        System.out.println("Jumlah Barang: " + jumlahBarang);
        System.out.print("Harga Beli: ");
        System.out.printf("%.2f\n", hargaBeli);
        System.out.print("Harga Jual: ");
        System.out.printf("%.2f\n", hargaJual);
    }
}