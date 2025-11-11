/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_manip_nallet;

/**
 *
 * @author Elna
 */
public class TP2_manip_NALLET {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tartiflette assiette1 = new Tartiflette(500);
        Tartiflette assiette2 = new Tartiflette(600);

        Tartiflette assiette3 = assiette2;

        System.out.println("nb de calories de Assiette 2 : " + assiette2.nbCalories);
        System.out.println("nb de calories de Assiette 3 : " + assiette3.nbCalories);

        assiette2.nbCalories++;

        System.out.println("Après avoir incrémenté assiette2 :");
        System.out.println("nb de calories de Assiette 2 : " + assiette2.nbCalories);
        System.out.println("nb de calories de Assiette 3 : " + assiette3.nbCalories);

        // Inversion des objets référencés
        Tartiflette temp = assiette1;
        assiette1 = assiette2;
        assiette2 = temp;

        System.out.println("Après inversion :");
        System.out.println("nb de calories de Assiette 1 : " + assiette1.nbCalories);
        System.out.println("nb de calories de Assiette 2 : " + assiette2.nbCalories);

        // Tableau de Moussaka
        Moussaka[] table = new Moussaka[10];
        for (int i = 0; i < table.length; i++) {
            table[i] = new Moussaka(400 + i * 50);
        }

        for (int i = 0; i < table.length; i++) {
            System.out.println("Moussaka " + i + " : " + table[i].nbCalories + " calories");
        }
    }
}

    
}
