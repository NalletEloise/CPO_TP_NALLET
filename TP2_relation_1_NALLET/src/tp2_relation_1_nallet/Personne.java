/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_nallet;

/**
 *
 * @author Elna
 */
public class Personne {
    String nom;
    String prenom;
    Voiture[] listeVoitures;
    int nbVoitures;

    public Personne(String prenom, String nom) {
        this.nom = nom;
        this.prenom = prenom;
        this.listeVoitures = new Voiture[3];
        this.nbVoitures = 0;
    }

    public boolean ajouterVoiture(Voiture v) {
        if (v.proprietaire != null) {
            System.out.println("Erreur : voiture déjà possédée.");
            return false;
        }
        if (nbVoitures >= 3) {
            System.out.println("Erreur : limite de voitures atteinte.");
            return false;
        }
        listeVoitures[nbVoitures] = v;
        nbVoitures++;
        v.proprietaire = this;
        return true;
    }

    @Override
    public String toString() {
        String info = prenom + " " + nom + " possède " + nbVoitures + " voiture(s)";
        for (int i = 0; i < nbVoitures; i++) {
            info += "\n- " + listeVoitures[i].modele + " " + listeVoitures[i].marque;
        }
        return info;
    }
}

