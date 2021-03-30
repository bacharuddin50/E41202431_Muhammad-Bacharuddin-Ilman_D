/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bilangan_genap;

import java.util.Scanner;

/**
 *
 * @author GSerpentZX
 */
public class Bilangan_Genap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int bilangan_genap;
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Masukkan Batas Angka Bilangan Genap = ");
        bilangan_genap= keyboard.nextInt();

        for(int i=2; i <= bilangan_genap; i+=2){
            System.out.print(i + " ");
        }

    }
    
}
