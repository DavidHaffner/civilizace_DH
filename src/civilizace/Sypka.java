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

/** Třída představuje sýpku, která bude uchovávat potravu */
public class Sypka {
    /** počet melounů; každý nasytí 1 obyvatele a týdně umožní zasadit další rostlinu */
    private int pocetMelounu;
    
    public Sypka (int pocetMelounu) {
        this.pocetMelounu = pocetMelounu;
    }
    
    /** Metoda obdrží z obj. plantaz počet nových melounů */ 
    public void sklizeno (int pom) {
        pocetMelounu += pom;
    }

    /** Metoda předá obj. plantaz počet nových rostlin */ 
    public void sadba (Plantaz plantaz) {
        plantaz.zasazeno(pocetMelounu);
    }

    /** Metoda pošle zprávu o akt. počtu melounů */
    public void zpravaSypka () {
        System.out.printf("Počet melounů: %s\n", pocetMelounu);
    }
}
