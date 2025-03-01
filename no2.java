/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.no1;

/**
 *
 * @author Acer
 */

import java.util.Scanner;
public class no2 {

    public static void main(String[] args) {
        Scanner angka = new Scanner(System.in);
        
         while(true){
        System.out.println("Masukkan panjang: ");
        int p = angka.nextInt();
        
        System.out.println("Masukkan lebar: ");
        int l = angka.nextInt();
        
        System.out.println("Masukkan tinggi: ");
        int t = angka.nextInt();
        
         if (p <= 0 || l <= 0 || t <= 0) {
                System.out.println("angka yang dimasukkan tidak tepat, Masukkan angka lebih dari 0");
                continue; 
            }
         break;
        }
        
        
    }
    
}
