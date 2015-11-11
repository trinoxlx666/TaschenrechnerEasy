/*
 * Einfache Rechenoperationen Klasse
 * +,-,*,/
 * immer 2 Zahlenwerte (GleitkommaZahl)
 */
package taschenrechnereasy;

/**
 *
 * @author stenlux
 */
public class EasyOperationen extends Eingabe implements IFaceEAOperationen  {

    private double wertAddi;            //Variablen Anlegen ohne Wert
    private double wertSubt;
    private double wertMulti;
    private double wertDivi;            //Division hinzugefügt
    private int wertPoti;
    
    
    //Addition 2er Variablen
    @Override
    public void SetAddi(double a, double b) {
        
        this.wertAddi=a+b;

    }
    //Subtraktion 2er Variablen
    @Override
    public void SetSubtra(double a, double b) {
        
        this.wertSubt = a - b;

    }
    //Multiplikation 2er Zahlen
    @Override
    public void SetMulti(double a, double b) {
        
        this.wertMulti = a * b;

    }
    //Division 2er Zahlen
    @Override
    public void SetDivi(double a, double b) {
        
        if(b!=0){
        this.wertDivi = a / b;
        }
        else{ 
            System.out.println("Fehler, Division durch 0 nicht erlaubt!");
            this.wertDivi=0;
            
        }
        }
    @Override
    public void SetPoti(int a, int b){
        this.wertPoti=(int) Math.pow(a,b);
    }
    
    
    
    //Wiedergabe Methoden(immer mit Rückgabewert)
    @Override
    public double getAddi() {
        return wertAddi;
    }

    @Override
    public double getSubtra() {
        return this.wertSubt;
    }

    @Override
    public double getMulti() {
        return this.wertMulti;
    }

    @Override
    public double getDivi() {
        return this.wertDivi;
    }
    
    @Override
    public int getPoti() {
        return wertPoti;
    }
    
    

}
