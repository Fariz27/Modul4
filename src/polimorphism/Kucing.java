/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorphism;

/**
 *
 * @author Fariz
 */
public class Kucing extends hewan {

    @Override
    void setNama() {
        String kucing = "Carberus";
        System.out.println("Nama kucing: "+kucing);
    }

    @Override
    void setSuara() {
        String suara = "Miaw Meow Meong";
        System.out.println("Suara Kucig: "+suara);
    }

    @Override
    void setBerat() {
        double berat = 2.0;
        System.out.println("Berat kucing: "+berat+"Kg");
    }
    
    
}
