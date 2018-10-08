/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117104.latihan34.objectorientedkalkulator;

/**
 *
 * @author 
 * Nama : Aditya Suheryana
 * Nim : 10117104
 * Kelas : IF-3/PBO3
 * Deskripsi Program : Membuat program dan menampilkan 
 * hasil dari perhitungan kalkulator
 * 
 */
public class Kalkulator {
    public double value1;
    public double value2;
    
    
    public double tambahBilangan(){ 
        return value1+value2;
    }
    public double kurangBiangan(){
        return value1-value2;
    }
    public double kaliBilangan(){
        return value1*value2;
    }
    public double bagiBilangan(){ 
        return value1/value2;
    }
    public double sisaBilangan(){
        return value1%value2;
    }
    
}

