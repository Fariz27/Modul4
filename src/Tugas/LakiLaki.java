/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

/**
 *
 * @author Fariz
 */
public class LakiLaki extends Manusia  {
    double TinggiBadan;
    public LakiLaki(double TB){
        this.TinggiBadan=TB;
    }
    public double getTinggiBadan(){
        return this.TinggiBadan;
    }
    public double htgBBi(){
        return (this.TinggiBadan-100)-(((this.TinggiBadan-100)*10)/100);
    }
}
