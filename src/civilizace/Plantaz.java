/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package civilizace;

/**
 *
 * @author acer
 */

/** Třída představuje plantáž, na které porostou melounovníky */
public class Plantaz {
    /** počet rostlin; každá týdně vyplodí 1 meloun */
    private int pocetRostlin;
        
    public Plantaz (int pocetRostlin) {
        this.pocetRostlin = pocetRostlin;
    }
    
    /** Metoda předá obj. sypka počet nových melounů */ 
    public void sklizen (Sypka sypka) {
        sypka.sklizeno(pocetRostlin);
    }
    
    /** Metoda obdrží z obj. sypka počet nových rostlin */ 
    public void zasazeno (int pom) {
        pocetRostlin += pom;
    }  

    /** Metoda pošle zprávu o akt. počtu rostlin */
    public void zpravaPlantaz () {
        System.out.printf("Počet rostlin: %s\n", pocetRostlin);
    }
} 
