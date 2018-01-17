package lv.rigacoding.day4;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Diana
 */
public class Loops {
    
    //izveidojam statisko metodi
    public static void countToN(){
        Scanner input = new Scanner(System.in);
        System.out.println("Ievadi skaitli N: ");
        int n = input.nextInt();
        int total = 0;
        
        for(int i =1; i <=n; i++){
            System.out.println(i);
            total=total+i;
            //vai total += i;
          
        }
         System.out.println("Skaitļu summa = "+total);
    }
    
    public static void CountN(){
        Scanner input = new Scanner(System.in);
        System.out.println("Ievadiet cik skaitļus N vadīsies: ");
        int n1 = input.nextInt();
        int total1 = 0;
        double average = 0;
       
                
        for (int i = 1; i<= n1; i++){
            System.out.println("Ievadi " + i +". skaitlis");
            int skaitlis = input.nextInt();
            total1 = total1 + skaitlis;
        }
        average = (double)total1/n1;
        
        System.out.println("Skaitļu summa = "+total1);
        System.out.println("Vidējā vērtība = "+average);
        //Lai attēlotu tikai 2 ciparus aiz komata
        System.out.println("Vidējā vērtība = " + String.format("%.2f", average));
        
    }
    public static void NxN(){
        Scanner input = new Scanner(System.in);
        System.out.print("Ievadiet N skaitu: ");
        int n = input.nextInt();
        
        for(int rinda =1; rinda<=n; rinda++){
           for(int kolona = 0; kolona<n; kolona++){
                System.out.print("#");}
                System.out.println();
            }
        }
        /*Ja taisītu ar while funkciju, tad tas būtu šādi:
    int rinda =0
    while(rinda<n)
    {int kolona=0; while(kolona<n){System.out.print("#"); kolona++;}
    System.out.println();rinda++;}
     */
        public static void NTriangle(){
        Scanner input = new Scanner(System.in);
        System.out.print("Ievadiet rindu skaitu N: ");
        int n = input.nextInt();
        
        for (int skaitlis=1;skaitlis<=n;skaitlis++){
            for(int rinda =1; rinda<skaitlis+1; rinda++){System.out.print(rinda);}
             System.out.println();
                
            }
            
        }
        public static void Nback(){
            Scanner input = new Scanner(System.in);
        System.out.print("Ievadiet rindu skaitli N: ");
        int n = input.nextInt();
        int npedejaiscipars = n%10;
        int nveseladala=n/10;   
        int atlikums = npedejaiscipars;
        
        System.out.print("Atlikums ir: "+npedejaiscipars);
        //System.out.println("Veselā daļa: "+nveseladala);
        
        
        while(nveseladala>0){
           atlikums = nveseladala %10;      
            System.out.print(atlikums);
            
            nveseladala=nveseladala/10;
            
        }
        }
        
        public static void NDimond(){ 
        Scanner input = new Scanner(System.in);
        System.out.println("Ievadiet rindu skaitu N: ");
        int totalRindas = input.nextInt();
        // 2*totalRindas-1;
        int rinda = 0;
        int tuksums =' ';       
         
             for(int kolona=0; kolona==(2*totalRindas-2)-2; kolona++){
        
             //for (int skaitlis=0;skaitlis<=totalRindas;skaitlis++){
               //for(rinda=dimants; rinda<totalRindas; rinda++){
                    //for(dimants =totalDimantuskaits; dimants<=totalDimantuskaits; dimants++){
                      
           for(rinda=1; rinda<totalRindas-1; rinda++){
                            //for(int rinda1 =1; rinda1<rinda; rinda1++){
                    System.out.print("*");           
                    }
               //for(tuksums=totalRindas-1; tuksums>=rinda; tuksums++){
                  // System.out.print(" ");}
                        System.out.println();}
                    
         }
         //for (int i =0; i<totalDimantuskaits-2; i++){System.out.print("*"); }

     
         
} 
     
                 
        
        
        // for(int e=1; e<=cikls;e++){                     
        //for (int i = rinduskaits; i>=dimantuskaits-2; i++){
          //  System.out.print("*");}
            
        //System.out.println(" "+dimants+" ");}
        
    






