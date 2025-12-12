/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Elna
 */
import java.util.Random;

public class JeuCadenas {
    // Attributs décrivant l'état du jeu
    private int[] combinaisonSecrete;
    private int nbTentativesRestantes;
    private int exacts;
    private int tropHauts;
    private int tropBas;
    private boolean partieGagnee;

    public JeuCadenas() {
        combinaisonSecrete = new int[4];
        demarrerNouvellePartie();
    }

    public void demarrerNouvellePartie() {
        Random rand = new Random();
        this.nbTentativesRestantes = 10;
        this.partieGagnee = false;
        
        for (int i = 0; i < 4; i++) {
            this.combinaisonSecrete[i] = rand.nextInt(10);
        }
       
        this.exacts = 0;
        this.tropHauts = 0;
        this.tropBas = 0;
    }

    public void testerCombinaison(int[] proposition) {
        if (nbTentativesRestantes <= 0 || partieGagnee) return;

        exacts = 0;
        tropHauts = 0;
        tropBas = 0;

        for (int i = 0; i < 4; i++) {
            if (proposition[i] == combinaisonSecrete[i]) {
                exacts++;
            } else if (proposition[i] > combinaisonSecrete[i]) {
                tropHauts++;
            } else {
                tropBas++;
            }
        }

        nbTentativesRestantes--;

        if (exacts == 4) {
            partieGagnee = true;
        }
    }
    
    public int getExacts() { return exacts; }
    public int getTropHauts() { return tropHauts; }
    public int getTropBas() { return tropBas; }
    public int getNbTentativesRestantes() { return nbTentativesRestantes; }
    public boolean estGagne() { return partieGagnee; }
}