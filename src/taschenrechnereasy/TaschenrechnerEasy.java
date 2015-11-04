/*
 * MenueKlasse für den Taschenrechner
 * Rechenoperationen +,-,*,/
 * immer 2 Zahlen //Bruch noch nicht einsatzbereit, deshal auskommentiert
 */
package taschenrechnereasy;

import java.util.*;

/**
 *
 * @author stenlux
 */
public class TaschenrechnerEasy extends EasyOperationen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        TaschenrechnerEasy te = new TaschenrechnerEasy();  //neues Objekt
        te.menue();                                        //Menü aufrufen

    }

    public void konsoleLöschen() {                      //Terminal löschen
        for (int x = 0; x < 14; x++) {
            System.out.println(" ");
        }
    }

    @SuppressWarnings("empty-statement")

    public void menue() {
        EasyOperationen t = new EasyOperationen();  //neues Objekt 
        Eingabe e = new Eingabe();                  //neues Objekt
        Scanner scan = new Scanner(System.in);
        int eingabe;
        

        //Start Menü
        do {

            System.out.println("****Taschenrechner Menü****");
            System.out.println("***************************************************");
            System.out.println("Bitte wählen Sie aus folgenden Operationen aus");
            System.out.println("(1) Addition 2er Zahlen");
            System.out.println("(2) Subtraktion 2er Zahlen");
            System.out.println("(3) Multiplikation 2er Zahlen");
            System.out.println("(4) Division 2er Zahlen");
            System.out.println("(5) Addieren von Brüchen");
            System.out.println("(6) Beenden des Programms");
            System.out.println("***************************************************");
            System.out.println("Bitte treffen Sie Ihre Auswahl: ");
            eingabe = scan.nextInt();

            switch (eingabe) {

                case 1:
                    konsoleLöschen();
                    System.out.println("**Addition wurde gewählt**");
                    e.eingeben();
                    t.SetAddi(e.getA(), e.getB());
                    t.getAddi();
                    System.out.println(" ");
                    System.out.println("Das Ergebnis ist: " + t.getAddi());
                    System.out.println(" ");
                    System.out.println(" ");
                    break;
                case 2:
                    konsoleLöschen();
                    System.out.println("**Subtraktion wurde gewählt**");
                    e.eingeben();
                    t.SetSubtra(e.getA(), e.getB());
                    System.out.println("Das Ergebnis ist: " + t.getSubtra());
                    System.out.println(" ");
                    System.out.println(" ");
                    break;
                case 3:
                    konsoleLöschen();
                    System.out.println("**Multiplikation wurde gewählt**");
                    e.eingeben();
                    t.SetMulti(e.getA(), e.getB());
                    System.out.println("Das Ergebnis ist: " + t.getMulti());
                    System.out.println(" ");
                    System.out.println(" ");
                    break;
                case 4:
                    konsoleLöschen();
                    System.out.println("**Division wurde gewählt**");
                    e.eingeben();
                    t.SetDivi(e.getA(), e.getB());
                    System.out.println("Das Ergebnis ist: " + t.getDivi());
                    System.out.println(" ");
                    System.out.println(" ");
                    break;

                case 5:
                    Bruchrechnung br = new Bruchrechnung();
                    Bruchrechnung b1;
                    Bruchrechnung b2;
                    br.bruecheAddieren();
                    System.out.println(" ");
                    System.out.println(" ");
                    break;
                default:
                    System.err.println("Bitte eine gültige Zahl eingeben! 1-5");

            }

        } while (eingabe != 6);
    }

}
//Ende
