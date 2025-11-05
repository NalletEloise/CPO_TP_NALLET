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
        float var;
        int choix;
        Scanner sc = new Scanner(System.in);
        System.out.println("Saisissez la conversion que vous souhaitez effectuer :");
        System.out.println("1: De Celsius vers Kelvin");
        System.out.println("2: De Kelvin vers Celsius");
        System.out.println("3: De Fahrenheit vers Celsius");
        System.out.println("4: De Celsius vers Fahrenheit");
        System.out.println("5: De Kelvin vers Fahrenheit");
        System.out.println("6: De Fahrenheit vers Kelvin");
        Convertisseur conv = new Convertisseur();
        choix=sc.nextInt();
        System.out.println("Entrez un nombre :");
        var=sc.nextFloat();
        if (choix ==1){
            System.out.println(conv.CelciusVersKelvin(var) +" K");
        }
        
        else if (choix ==2){
            System.out.println(conv.KelvinVersCelcius(var)+" C");
        }
        
        else if (choix ==3){
            System.out.println(conv.FarenheitVersCelcius(var)+" C");
        }
        
        else if (choix ==4){
            System.out.println(conv.CelciusVersFarenheit(var)+" F");
        }
        
        else if (choix ==5){
            System.out.println(conv.KelvinVersFarenheit(var)+" F");
        }
        
        else if (choix ==6){
            System.out.println(conv.FarenheitVersKelvein(var)+" K");
        }
        else{
            System.out.println("C'est pas le bon nombre");
        }
    }
    
}
