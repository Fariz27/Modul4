/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas2;

/**
 *
 * @author Fariz
 */
public class Kalkulator implements Oprasi {
    double Bill1,Bill2;
    public Kalkulator(double Bill1,double Bill2){
        this.Bill1=Bill1;
        this.Bill2=Bill2;
    }

    public double getBill1() {
        return Bill1;
    }

    public double getBill2() {
        return Bill2;
    }
    public double penjumlahan(){
        return Bill1+Bill2;
    }
    public double pengurangan(){
        return Bill1-Bill2;
    }
    public double perkalian(){
        return Bill1*Bill2;
    }
    public double pembagian(){
        return Bill1/Bill2;
    }  
        
}
