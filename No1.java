/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.no1;

/**
 *
 * @author Acer
 */

import java.util.Scanner;

public class No1 {

    public static void main(String[] args) {
        Scanner angka = new Scanner(System.in);
        System.out.println("masukan n(n harus => 1): ");
 
        int n= angka.nextInt();
        
        for (int i=1; i <= n; i++){
            System.out.println(i);
        }
       
    }
}
