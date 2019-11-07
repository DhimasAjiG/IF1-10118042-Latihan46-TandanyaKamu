
package if1.pkg10118042.latihan46.tandanyakamu;

import java.util.Scanner;

/**
 * @author
 * Nama  : Dhimas Aji Ghairrahmat
 * Kelas : IF1
 * NIM   : 10118042
 * Deskripsi Program : Program ini berfungsi untuk Menentukan Tanda Melalui Umur
 */
public class IF110118042Latihan46TandanyaKamu {

    public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);
        
        Kamu objKamu = new Kamu(2019);
        System.out.print("Masukan tahun Lahir Anda : ");
        objKamu.setYearBirth(scan.nextInt());
        System.out.println("");
        
        System.out.println("====Hasil Perhitungan Umur====");
        System.out.println("Tahun Lahir Anda "+objKamu.getYearBirth());
        System.out.println("Hari ini Tahun : "+objKamu.getYearNow());
        System.out.println("Umur kamu sampai saat ini adalah "+objKamu.hitungUmur
        ()+" tahun ");
        System.out.println("Tandanya Kamu "+objKamu.tandanyaKamu(objKamu.hitungUmur()));
    }
    
}
