/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_manipnombresint_nallet;

import java.util.Scanner;

/**
 * 22/10/25
 * @author Elna
 */
public class TP1_manipNombresInt_NALLET {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int entier1;
        int entier2;
        int somme =0;
        int difference = 0;
        int produit =1;
        int division_entiere=1;
        double reste=0.0;
        
        Scanner sc = new Scanner(System.in); 
        System.out.println("Entrer le premier entier :");
        entier1=sc.nextInt();
        System.out.println("Entrer le deuxieme entier :");
        entier2=sc.nextInt();
        somme=entier1 + entier2;
        System.out.println("La somme des deux entiers est: " + somme);
        if (entier1<entier2) {
            difference=entier2 - entier1;
        }
        else {
            difference=entier1 - entier2;
        }
        System.out.println("La difference des deux entiers est: " + difference);
        produit=entier1 * entier2;
        System.out.println("Le produit des deux entiers est: " + produit);
        division_entiere=entier1 / entier2;
        System.out.println("La division entiere des deux entiers est: " + division_entiere);
        reste= entier1 % entier2;
        System.out.println("Le reste de la division des deux entiers est: " + reste);
    }
    
}
