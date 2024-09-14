import java.util.Scanner;

public class GajiKariawan11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double jmlJamKerja, upahPerjam; //input jumlah jam kerja dan upah per jam
        double bonusGaji, pajak, totalGaji, gajiBersih, gajiSetelahBonus; //input bonus gaji, pajak, total gaji, gaji bersih, dan gaji setelah bonus

        System.out.print("Masukkan Jumlah Jam Kerja Kariawan: ");
        jmlJamKerja = sc.nextDouble();
        System.out.print("Masukkan Upah Per Jam Kerja: ");
        upahPerjam = sc.nextDouble();

        totalGaji = jmlJamKerja * upahPerjam; //hitung total gaji: jumlah jam kerja x upah per jam
        bonusGaji = totalGaji * 0.1; //hitung bonus gaji: total gaji x 10% upah perjam
        pajak = totalGaji * 0.05; //hitung pajak: 5% dari total gaji
        gajiBersih = totalGaji - pajak; //hitung gaji bersih: total gaji - pajak
        gajiSetelahBonus = totalGaji + bonusGaji; //hitung gaji setelah bonus: total gaji + bonus gaji

        System.out.println("Jumlah Gaji Kariawan adalah: " + totalGaji); //cetak total gaji
        System.out.println("Bonus Gaji Kariawan adalah: " + bonusGaji); //cetak bonus gaji
        System.out.println("Total Gaji Setelah Bonus adalah: " + gajiSetelahBonus); //cetak gaji setelah bonus
        System.out.println("Total Pajak yang harus dibayar adalah: " + pajak); //cetak pajak yang harus dibayar
        System.out.println("Total Gaji setelah dikenakan pajak adalah: " + gajiBersih); //cetak gaji bersih setelah mendapat bonus dan potong pajak
    }
}
