/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taschenrechnereasy;

/**
 *
 * @author stenlux
 */
public interface IFaceEAOperationen {
    
    public void SetAddi(double a, double b);
    public void SetSubtra(double a, double b);
    public void SetMulti(double a, double b);
    public void SetDivi(double a, double b);
    
    public double getAddi();
    public double getSubtra();
    public double getMulti();
    public double getDivi();


    
}
