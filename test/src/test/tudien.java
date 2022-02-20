/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import static java.lang.System.exit;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author at160
 */
public class tudien {
    ArrayList<Word> dict=new ArrayList<>();

    public tudien() {
    }

    public tudien(ArrayList dict) {
        this.dict = dict;
    }
    //--------------------------------------//
   public void Menu() throws IOException{
      while(true) {
       Scanner Input=new Scanner(System.in);
       System.out.println("1.Them 1 tu vao tu dien");
       System.out.println("2.Sua 1 tu trong tu dien");
       System.out.println("3.Xoa 1 tu trong tu dien");
       System.out.println("4.Xem tu dien");
       System.out.println("0.Thoat");
       int luachon=Input.nextInt();
       switch(luachon){
           case 1:{
               Word x=new Word();
               x.Nhap();
               dict.add(x);
               try{
               File f=new File("tudien.txt");
               FileWriter fw=new FileWriter(f);
               BufferedWriter bw=new BufferedWriter(fw);
               
               for(Word s:dict){
                   bw.write(s.toString()+"\n");
               }
               
               bw.close();
               fw.close();
           }catch(Exception e){
               
           }
           }break;
           case 2:{
                  Input.nextLine();
                  System.out.println("Nhap tu tieng anh muon sua");
                  String str=Input.nextLine();
               System.out.println("Nhap nghia tieng viet muon thay the");
               String str1=Input.nextLine();
               for(Word x:dict){
                   if(x.eN.equalsIgnoreCase(str)){
                       x.setvN(str1);
                   }
                   
               }
               try{
               File f=new File("tudien.txt");
               FileWriter fw=new FileWriter(f);
               BufferedWriter bw=new BufferedWriter(fw);
               
               for(Word s:dict){
                   bw.write(s.toString()+"\n");
               }
               
               bw.close();
               fw.close();
           }catch(Exception e){
               
           }
           }break;
           case 3:{
               System.out.println("Nhap tu tieng anh muon xoa");
               Input.nextLine();
               String str=Input.nextLine();
               for(Word x:dict){
                   if(x.eN.equalsIgnoreCase(str)){
                       dict.remove(x);
                       break;
                   }
                   
               }
               try{
               File f=new File("tudien.txt");
               FileWriter fw=new FileWriter(f);
               BufferedWriter bw=new BufferedWriter(fw);
               
               for(Word s:dict){
                   bw.write(s.toString()+"\n");
               }
               
               bw.close();
               fw.close();
           }catch(Exception e){
               
           }
           }break;
           case 4:{
               String str;
               try{
                   File f=new File("tudien.txt");
                   FileReader fr=new FileReader(f);
                   BufferedReader br=new BufferedReader(fr);
                   
                   while((str=br.readLine())!=null){
                       System.out.println(str);
                   }
                   
                   br.close();
                   fr.close();
                   
           }catch(Exception e){   
           }
           }break;
           case 0:{
               exit(0);
           }
   }
               
   }
   
}
}

