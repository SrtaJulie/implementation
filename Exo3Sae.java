/*
 * exerciceSAE.java			19/10/2021
 * Groupe JeuAnagramme 
 * pas de copyright
 */
package entrainement;
import java.util.Scanner;
/**
 * la classe exerciceSAe
 * 
 * 
 */
public class ExerciceSAe {
    /**
     * 
     * 
     */
    public static void main(String[] args) {
    	String chaine;
    	char caractos;
    	int indexChar;
    	Scanner saisie = new Scanner(System.in);
    	System.out.print("veuillez saisir un mot : ");
    	chaine = saisie.nextLine();
    	caractos = chaine.charAt(0);
    	if(chaine.isBlank()) {
    		System.out.println("vous avez entré un mot vide");
    		
    	}else {
    		System.out.print("veuillez entrez le rang de la lettre a"
    	                     +" consulter(de 1 à "+ (chaine.length()) + ") : " );
    		indexChar = saisie.nextInt() - 1;
    		if(indexChar >= chaine.length() || indexChar < 0) {
    			System.out.print("le rang est invalide veuillez relancer le programme");
    		}else {
    		    System.out.println("Le mot "+ chaine +" commence par la lettre" 
    		                       + caractos);
    		    caractos = chaine.charAt(indexChar);
    		    System.out.print("la lettre situé au rang "+ indexChar
    		    				 +" est " + caractos);
    		}
    	}
    }
}
