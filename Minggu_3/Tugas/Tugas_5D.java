/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas_5d;

import java.util.Scanner;

/**
 *
 * @author GSerpentZX
 */
public class Tugas_5D {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner belanja = new Scanner(System.in);
        System.out.println("--------------------------------------------");
        System.out.println("        Kharisma Agung Plaza < KAP >");
        System.out.println("          Promo Belanja Berhadiah");
        System.out.println("     Khusus Pembelian 5 Barang Pertama");
        System.out.println("      Dengan harga minimum Rp 10000,00");
        System.out.println("--------------------------------------------");
        
        System.out.println("Masukkan nama pembeli : Muhammad Bacharuddin Ilman");
        String nama = belanja.nextLine();
        System.out.println();
        
        System.out.print("Masukkan harga barang ke-1    : 10000");
        int harga1 = belanja.nextInt();
        System.out.print("Masukkan harga barang ke-2    : 20000");
        int harga2 = belanja.nextInt();
        System.out.print("Masukkan harga barang ke-3    : 15000");
        int harga3 = belanja.nextInt();
        System.out.print("Masukkan harga barang ke-4    : 45000");
        int harga4 = belanja.nextInt();
        System.out.print("Masukkan harga barang ke-5    : 10000");
        int harga5 = belanja.nextInt();

        int total = harga1 + harga2 + harga3 + harga4 + harga5;
        System.out.println("Total harga pembelian atas nama " + nama + " adalah Rp " + total);
        System.out.println();
        if (total > 10000){
            System.out.println("Selamat....");
            System.out.println("Anda mendapat hadiah 1 buah mug cantik");
        }else{
            System.out.println("Maaf....");
            System.out.println("Anda belum mendapatkan hadiah 1 buah mug cantik");
        }

        System.out.println();
        System.out.println("---------------------------------------------");
        System.out.println("               Terima Kasih");
        System.out.println("  Anda sudah belanja di Kharisma Agung Plaza");
    }
    
}
