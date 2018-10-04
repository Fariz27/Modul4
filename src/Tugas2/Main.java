/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas2;
import java.util.Scanner;
/**
 *
 * @author Fariz
 */
public class Main {
    public static void main(String[] args){
        System.out.println("Masukan bilangan pertama");
        Scanner n = new Scanner(System.in);
        double bil1=n.nextDouble();
        System.out.println("Masukan bilanga kedua");
        double bil2=n.nextDouble();
        Oprasi O= new Kalkulator(bil1,bil2);
        System.out.println("Hasil Penjumlahan\t: "+O.penjumlahan());
        System.out.println("Hasil Pengurangan\t: "+O.pengurangan());
        System.out.println("Hasil Perkalian\t\t: "+O.perkalian());
        System.out.println("Hasil Pembagian\t\t: "+O.pembagian());
    }
}
