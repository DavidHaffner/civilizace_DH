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

/** Třída bude simulovat všechny procesy, co se stanou za 1 týden času */
public class Tyden {
    /** zde se bude zaznamenávat počet uběhlých týdnů */
    private int kalendar = 1;
    private Sypka sypka;
    private Plantaz plantaz;
    
    public Tyden (Sypka sypka, Plantaz plantaz) {
        this.sypka = sypka;
        this.plantaz = plantaz;
    }
    
    /* Metoda provede všechny týdenní procedury */
    public void poTydnu () {
        kalendar ++;
        plantaz.sklizen(sypka);
        sypka.sadba(plantaz);
    }
    
    /**
     * Metoda předá zprávu o aktuálním týdnu */
    public void zpravaPoTydnu () {
        System.out.printf("Uběhl %s. týden\n", kalendar);
    }
}
