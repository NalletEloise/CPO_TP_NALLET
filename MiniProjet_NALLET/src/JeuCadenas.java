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
    private int[] combinaisonSecrete;
    private int nbTentativesRestantes;
    private int maxTentatives;
    private int exacts, tropHauts, tropBas;
    private boolean partieGagnee;

    public JeuCadenas() {
        combinaisonSecrete = new int[4];
        demarrerNouvellePartie(10);
    }

    public void demarrerNouvellePartie(int nombreDeVies) {
        Random rand = new Random();
        this.maxTentatives = nombreDeVies;
        this.nbTentativesRestantes = nombreDeVies;
        this.partieGagnee = false;
        
        for (int i = 0; i < 4; i++) {
            this.combinaisonSecrete[i] = rand.nextInt(10);
        }

    }

    public void testerCombinaison(int[] proposition) {
        if (nbTentativesRestantes <= 0 || partieGagnee) return;

        exacts = 0; tropHauts = 0; tropBas = 0;

        for (int i = 0; i < 4; i++) {
            if (proposition[i] == combinaisonSecrete[i]) exacts++;
            else if (proposition[i] > combinaisonSecrete[i]) tropHauts++;
            else tropBas++;
        }

        nbTentativesRestantes--;
        if (exacts == 4) partieGagnee = true;
    }

    public String getSolution() {
        String res = "";
        for (int i : combinaisonSecrete) res += i;
        return res;
    }

    public int getExacts() { return exacts; }
    public int getTropHauts() { return tropHauts; }
    public int getTropBas() { return tropBas; }
    public int getNbTentativesRestantes() { return nbTentativesRestantes; }
    public int getMaxTentatives() { return maxTentatives; }
    public boolean estGagne() { return partieGagnee; }
}