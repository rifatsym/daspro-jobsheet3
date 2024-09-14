import java.util.Scanner;
 public class Listrik11 {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hargaListrik = 1500, jmlListrik, totalHargaListrik; //input harga listrik, jumlah listrik, dan total harga listrik
        boolean statusListrik; //input status listrik

        System.out.print("Masukkan Jumlah Listrik (kwh)\t\t: ");
        jmlListrik = sc.nextInt();

        statusListrik = jmlListrik > 500; //cek apakah penggunaan listrik melebihi 500 kwh
        totalHargaListrik = jmlListrik * hargaListrik; //hitung total harga listrik

        System.out.println("apakah listrik melebihi 500 kwh? : " + statusListrik); //cetak status penggunaan listrik
        System.out.println("jumlah listrik: " + jmlListrik); //cetak jumlah listrik
        System.out.println("harga listrik (kwh): " + hargaListrik); //cetak harga listrik (kwh)
        System.out.println("total bayar listrik: " + totalHargaListrik); //cetak harga listrik yang harus dibayar
  }
}