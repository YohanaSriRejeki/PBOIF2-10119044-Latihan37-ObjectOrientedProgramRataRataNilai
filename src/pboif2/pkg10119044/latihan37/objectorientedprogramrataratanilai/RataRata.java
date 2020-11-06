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
class RataRata {
    public int mahasiswa;
    public float jumlah;
    public float nilai;
    
    public void banyakNilai(){
        Scanner input = new Scanner(System.in);
        int i = 1;
        while(i<=mahasiswa){
            System.out.print("Nilai Mahasiswa ke-"+i+" : ");
            nilai = input.nextFloat();
            jumlah += nilai;
            i++;
        }
    }
    
    public float hitungRataRata(){
        float rata = jumlah/mahasiswa;
        System.out.println();
        System.out.println("Maka, Rata-rata Nilainya adalah " + rata);
        System.out.println("Developed by : Yohana Sri Rejeki");
        return rata;
    }  
    
    public void gabungan(float jumlah, int mahasiswa){
        banyakNilai();
        hitungRataRata();
    }
}
