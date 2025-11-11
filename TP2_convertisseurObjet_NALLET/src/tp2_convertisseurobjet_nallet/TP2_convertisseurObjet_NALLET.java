/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_convertisseurobjet_nallet;

import java.util.Scanner;

/**
 *
 * @author Elna
 */
public class TP2_convertisseurObjet_NALLET {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Convertisseur conv1 = new Convertisseur();
        Convertisseur conv2 = new Convertisseur();

        int choix;
        double temp;
        boolean continuer = true;

        while (continuer) {
            System.out.println("1: Celsius vers Kelvin");
            System.out.println("2: Kelvin vers Celsius");
            System.out.println("3: Fahrenheit vers Celsius");
            System.out.println("4: Celsius vers Fahrenheit");
            System.out.println("5: Kelvin vers Fahrenheit");
            System.out.println("6: Fahrenheit vers Kelvin");
            System.out.println("0: Quitter");
            System.out.print("Choix : ");
            choix = sc.nextInt();

            if (choix == 0) {
                continuer = false;
            } else {
                System.out.print("Entrez la température à convertir : ");
                temp = sc.nextDouble();

                double resultat = 0;
                if (choix == 1) {
                    resultat = conv1.CelciusVersKelvin(temp);
                    System.out.println(temp + "°C = " + resultat + " K");
                } else if (choix == 2) {
                    resultat = conv1.KelvinVersCelcius(temp);
                    System.out.println(temp + " K = " + resultat + "°C");
                } else if (choix == 3) {
                    resultat = conv1.FahrenheitVersCelcius(temp);
                    System.out.println(temp + "°F = " + resultat + "°C");
                } else if (choix == 4) {
                    resultat = conv2.CelciusVersFahrenheit(temp);
                    System.out.println(temp + "°C = " + resultat + "°F");
                } else if (choix == 5) {
                    resultat = conv2.KelvinVersFahrenheit(temp);
                    System.out.println(temp + " K = " + resultat + "°F");
                } else if (choix == 6) {
                    resultat = conv2.FahrenheitVersKelvin(temp);
                    System.out.println(temp + "°F = " + resultat + " K");
                } else {
                    System.out.println("Choix invalide, réessayez.");
                }
            }
        }
        System.out.println("Conversions réalisées par conv1 : " + conv1);
        System.out.println("Conversions réalisées par conv2 : " + conv2);
        sc.close();
    }
}
