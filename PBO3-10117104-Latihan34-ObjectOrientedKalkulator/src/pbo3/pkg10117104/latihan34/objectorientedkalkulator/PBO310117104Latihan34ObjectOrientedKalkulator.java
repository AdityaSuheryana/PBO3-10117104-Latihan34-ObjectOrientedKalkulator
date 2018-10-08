/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117104.latihan34.objectorientedkalkulator;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author
 * Nama : Aditya Suheryana
 * Nim : 10117104
 * Kelas : IF-3/PBO3
 * Deskripsi Program : Membuat program dan menampilkan 
 * hasil dari perhitungan kalkulator
 */
public class PBO310117104Latihan34ObjectOrientedKalkulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      Kalkulator kalutor = new Kalkulator();

        System.out.println("====Aplikasi Kalkulator Bilangan====");
        System.out.print("Masukkan Angka Ke-1 : ");
        kalutor.value1 = scn.nextDouble();
        System.out.print("Masukkan Angka Ke-2 : ");
        kalutor.value2 = scn.nextDouble();

        DecimalFormat df = new DecimalFormat("###.##");

        System.out.println("\nHasil Penjumlahan : "+kalutor.tambahBilangan());
        System.out.println("Hasil Pengurangan : "+kalutor.kurangBiangan());
        System.out.println("Hasil Perkalian : "+kalutor.kaliBilangan());
        System.out.println("Hasil Pembagian : "+df.format(kalutor.bagiBilangan()));
        System.out.println("Hasil Sisa : "+kalutor.sisaBilangan());
                
                
              
        
    
    }
    
}
  
