/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package civilizace;

import java.util.Scanner;

/**
 *
 * @author acer
 */
public class Civilizace {

    /**
     * @param args the command line arguments
     */
    
    /** Hlavní třída s metodou main */
    public static void main(String[] args) {
        //vytvoření objektů
        Sypka sypka = new Sypka (0);
        Plantaz plantaz = new Plantaz (1);
        Tyden tyden = new Tyden (sypka, plantaz);
        //pomocná proměnná
        String volba;
        
        
        // a začíná boj o sklizeň ...
        while (true) {
            /*nejdřív musím uměle nasimulovat první rok,
            protože algoritmus běhá až od druhého roku */
            System.out.println("Uběhl 1. týden");
            System.out.println("Počet melounů: 0");
            System.out.println("Počet rostlin: 1");
            System.out.println("Pokračujeme ...");
            System.out.println();
            
            tyden.poTydnu();
            tyden.zpravaPoTydnu();
            sypka.zpravaSypka();
            plantaz.zpravaPlantaz();
            System.out.println();
            
            System.out.printf("Chceš pokračovat (N-ne)?");
            Scanner sc = new Scanner (System.in);
            volba = sc.nextLine();
            if (volba.equals("N")) {
                return;
            }
        }
    } 
}
