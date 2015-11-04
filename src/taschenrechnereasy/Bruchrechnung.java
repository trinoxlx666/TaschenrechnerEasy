/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taschenrechnereasy;

import java.util.Scanner;

/**
 *
 * @author stenlux
 */
public class Bruchrechnung implements IFaceBruchrechnung{
    
    Integer zaehler=0;
    Integer nenner=0;
    boolean schleife=true;
    Bruchrechnung b3;

    

    @Override
    public Bruchrechnung bruecheAddieren() {
        Bruchrechnung b1 = new Bruchrechnung();
        Bruchrechnung b2 = new Bruchrechnung();
        b3 = new Bruchrechnung();
        Bruchrechnung temp = new Bruchrechnung();
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Bitte Zähler für 1. Bruch: ");
        b1.zaehler=scan.nextInt();
        System.out.println("Bitte Nenner für 1. Bruch: ");
        b1.nenner=scan.nextInt();
        System.out.println("Bitte Zähler für 2. Bruch: ");
        b2.zaehler=scan.nextInt();
        System.out.println("Bitte Nenner für 2. Bruch: ");
        b2.nenner=scan.nextInt();
        
        temp.nenner=b1.nenner*b2.nenner;
        b1.zaehler=temp.nenner/b1.nenner*b1.zaehler;    //Bruch1 Zaehler okay
        b2.zaehler=temp.nenner/b2.nenner*b2.zaehler;    //Bruch2 Zaehler okay
        b1.nenner=temp.nenner;
        b2.nenner=temp.nenner;
        b3.zaehler=b1.zaehler+b2.zaehler;       //Bruch komplett Zähler
        b3.nenner=b2.nenner;                    //Bruch komplett Nenner
        
        
        
        do{
        if((b3.zaehler%2)==0){
            if((b3.nenner%2)==0){
                kuerzen();
            }
            else {schleife=false;}
                }
        else{schleife=false;
        }
        }
        while(schleife ==true);
        
        
        
        
        
        
        
    System.out.println(b3.zaehler+"/"+b3.nenner);
        return b3;
    
    }
        
        
        public void kuerzen(){
            b3.zaehler=b3.zaehler/2;
            b3.nenner=b3.nenner/2;
            
            
            
            
        }
        
        }
      
        
        
    
    

    
    
    
    
    

