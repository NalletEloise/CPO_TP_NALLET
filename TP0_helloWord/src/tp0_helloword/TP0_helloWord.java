/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp0_helloword;

import java.util.Scanner;

/**hello world: dire bonjour
 * 20/10/25
 * @author Elna
 */
public class TP0_helloWord {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println( " Bonjour " ) ;
        System.out.println( " Au revoir " ) ;
        String prenom;
        Scanner sc ;
        sc = new Scanner (System.in) ;
        System.out.println("Quel est votre prénom ?");
        prenom = sc.nextLine();
    }
    
}
