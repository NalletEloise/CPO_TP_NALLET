/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_nallet;

/**
 *
 * @author Elna
 */
public class Voiture {
    String modele;
    String marque;
    int puissanceCV;
    Personne proprietaire;

    public Voiture(String modele, String marque, int puissanceCV) {
        this.modele = modele;
        this.marque = marque;
        this.puissanceCV = puissanceCV;
        this.proprietaire = null;
    }

    @Override
    public String toString() {
        String proprietaireNom = (proprietaire == null) ? "aucun" : proprietaire.prenom + " " + proprietaire.nom;
        return modele + " " + marque + " " + puissanceCV + "CV, Proprietaire : " + proprietaireNom;
    }
}

