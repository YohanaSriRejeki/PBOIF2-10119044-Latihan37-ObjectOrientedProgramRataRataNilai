/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119044.latihan37.objectorientedprogramrataratanilai;
import java.util.Scanner;
/**
 *
 * @author 
 * NAMA     : Yohana Sri Rejeki
 * KELAS    : IF2
 * NIM      : 10119044
 * Deskripsi Program : Program ini bertujuan menampilkan rata-rata nilai mahasiswa 
 * dengan perulangan menggunakan metode object oriented
 */
public class PBOIF210119044Latihan37ObjectOrientedProgramRataRataNilai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        RataRata rata = new RataRata();
        
        System.out.print("Masukkan Banyaknya Mahasiswa : ");
        rata.mahasiswa = input.nextInt();
        
        rata.gabungan(0, 0);
    }
}
