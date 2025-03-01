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

public class no3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int a, b, c; 
        
        do {
            System.out.print("Masukkan a: ");
            a = input.nextInt();

            System.out.print("Masukkan b: ");
            b = input.nextInt();

            System.out.print("Masukkan c: ");
            c = input.nextInt();

        } while (a <= 0 || b <= 0 || c <= 0 || a > b || b > c); 

        int a2 = a * a;
        int b2 = b * b;
        int c2 = c * c;

        if (a2 + b2 == c2) {
            System.out.println("segitiga siku siku");
        } else if (a2 + b2 > c2) {
            System.out.println("segitiga lancip");
        } else {
            System.out.println("segitiga tumpul");
        }

    }
}