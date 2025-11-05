/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_bieres_nallet;

/**
 *
 * @author Elna
 */
public class TP2_Bieres_NALLET {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BouteilleBiere uneBiere = new BouteilleBiere("Cuvée des trolls", 7.0 ,"Dubuisson") ;
        uneBiere.lireEtiquette();
        BouteilleBiere autreBiere = new BouteilleBiere("Leffe", 6.6 ,"Abbaye de Leffe");
        autreBiere.lireEtiquette();
        BouteilleBiere maBiere = new BouteilleBiere("ELO", 11.09 ,"NALLET");
        maBiere.lireEtiquette();
        BouteilleBiere taBiere = new BouteilleBiere("MA", 27.10 ,"SIRAUDEAU");
        taBiere.lireEtiquette();
        BouteilleBiere saBiere = new BouteilleBiere("LULU", 16.01 ,"LECHERBONNIER");
        saBiere.lireEtiquette();
        maBiere.Décapsuler();
        taBiere.Décapsuler();
        System.out.println(maBiere);
        System.out.println(taBiere);
        System.out.println(uneBiere);
    }
}
