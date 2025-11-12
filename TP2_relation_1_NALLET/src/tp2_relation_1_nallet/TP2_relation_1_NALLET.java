/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_relation_1_nallet;

/**
 *
 * @author Elna
 */
public class TP2_relation_1_NALLET {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Voiture uneClio = new Voiture("Clio", "Renault", 5);
        Voiture uneAutreClio = new Voiture("Clio", "Renault", 5);
        Voiture une2008 = new Voiture("2008", "Peugeot", 6);
        Voiture uneMicra = new Voiture("Micra", "Nissan", 4);

        Personne bob = new Personne("Bobby", "Sixkiller");
        Personne reno = new Personne("Reno", "Raines");

        System.out.println("Liste des voitures disponibles :");
        System.out.println(uneClio);
        System.out.println(uneAutreClio);
        System.out.println(une2008);
        System.out.println(uneMicra);

        System.out.println("\nAttribution des voitures...");
        bob.ajouterVoiture(uneClio);
        bob.ajouterVoiture(uneAutreClio);
        reno.ajouterVoiture(une2008);
        reno.ajouterVoiture(uneMicra);

        System.out.println("\nAprès attribution des voitures :");
        System.out.println(bob);
        System.out.println(reno);

        System.out.println("\nDétails des voitures après attribution :");
        System.out.println(uneClio);
        System.out.println(uneMicra);
    }
}

