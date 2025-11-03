/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_guessmynumber_nallet;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Elna
 */
public class TP1_guessMyNumber_NALLET {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int valeur;
        int compt=0;
        Random generateurAleat = new Random();
        int n = generateurAleat.nextInt(100);
        
        Scanner sc = new Scanner(System.in);
        int score=0;
        int choix;
        System.out.println("Le but du jeu est de trouver le nombre auquel je pense");
        System.out.println("Saisissez le mode que vous voulez :");
        System.out.println("1: Mode facile, il y a des indices");
        System.out.println("2: Mode difficile, le but et de reussir avant 10 tentatives");
        choix=sc.nextInt();
        while(score!=1){
        System.out.println("Saisissez une un nombre entre 0 et 100 :");
        valeur=sc.nextInt();
        
        if (choix==1){
            if (valeur<n){
                System.out.println("Trop petit !");
                compt=compt+1;
            }
            else if (n-valeur>30){
                System.out.println("Vraiment trop petit !");
                compt=compt+1;
            }
            else if (valeur-n>30){
                System.out.println("Vraiment trop grand !");
                compt=compt+1;
            }
            else if (valeur>n){
                System.out.println("Trop grand !");
                compt=compt+1;
            }
            else if (valeur==n){
                System.out.println("Gagné !");
                compt=compt+1;
                score=1;
                System.out.println("Bravo vous avez reussi en "+compt+" tentatives !");
            }
        }        
        if (choix==2){
            if (valeur<n){
                System.out.println("Trop petit !");
                compt=compt+1;
            }
            if (valeur>n){
                System.out.println("Trop grand !");
                compt=compt+1;
            }
            if (valeur==n){
                System.out.println("Gagné !");
                score=1;
                compt=compt+1;
                System.out.println("Vous avez fait "+compt+" tentatives !");
            }
        }
        }
        if (choix==2){
            if (compt<10){
                System.out.println("Vous avez reussi avant 10 tentatives !");
            }
            if (compt>10){
                System.out.println("Vous n'avez pas reussi avant 10 tentatives...");
            }
        }
    }
    
}
