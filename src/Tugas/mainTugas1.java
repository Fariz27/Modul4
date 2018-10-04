/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;
import java.util.Scanner;
/**
 *
 * @author Fariz
 */
public class mainTugas1 {
    public static void main(String[] args){
        Scanner n = new Scanner(System.in);
        System.out.print("Masukan tinggi badan : ");
        double tb = n.nextDouble();
        Manusia m1 = new LakiLaki(tb);
        Manusia m2 = new Perempuan(tb);
        
        System.out.println("1.Laki-laki\n2.Perempuan\nPilihhan(1/2) : ");
        int pil= n.nextInt();
        if(pil==1){
            System.out.println("Berat yang ideal adalah "+m1.htgBBi()+"Kg");
        }
        if(pil==2){
            System.out.println("Berat yang ideal adalah "+m2.htgBBi()+"Kg");
        }
    }
}
