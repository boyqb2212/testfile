/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.Scanner;

/**
 *
 * @author at160
 */
public class Word {
    String eN;
    String vN;

    public Word() {
    }

    public Word(String eN, String vN) {
        this.eN = eN;
        this.vN = vN;
    }

    public String geteN() {
        return eN;
    }

    public void seteN(String eN) {
        this.eN = eN;
    }

    public String getvN() {
        return vN;
    }

    public void setvN(String vN) {
        this.vN = vN;
    }
    public void Nhap(){
        Scanner Input=new Scanner (System.in);
        System.out.println("Nhap nghia tieng anh");
        this.eN=Input.nextLine();
        System.out.println("Nhap nghia tieng viet");
        this.vN=Input.nextLine();
    }

    @Override
    public String toString() {
        return eN + "-"+ vN;
    }
    
}
