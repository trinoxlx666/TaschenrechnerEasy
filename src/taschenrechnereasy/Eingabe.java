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
public class Eingabe {
    private double a;
    private double b;
    
    
protected void eingeben(){
    Scanner scan = new Scanner(System.in);
    System.out.println("Bitte geben sie die 1. Zahl ein: " );
    this.a=scan.nextDouble();
    System.out.println("Bitte geben sie die 2. Zahl ein: " );
    this.b=scan.nextDouble();
    
}

public double getA(){
    return this.a;
}
public double getB(){
    return this.b;
}

}
