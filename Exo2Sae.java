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
    	Character caractere;
    	char caractos;
    	Scanner saisie = new Scanner(System.in);
    	System.out.print("veuillez saisir une caractére : ");
    	caractere = saisie.nextLine().charAt(0);
    	caractos = caractere ;
    	System.out.print("le caractére " + caractere + " est une " );
    	if(caractere.isLetter(caractere)) {
    	    System.out.println("est une lettre");
    	    if(caractere.isUpperCase(caractos)) {
    		    System.out.print("le caractére " + caractere 
                                     + " est une majuscule \n son équivalent minuscule est : " 
                                     + caractere.toLowerCase(caractos) );
    	    }
    	     else {
    		System.out.print("le caractére " + caractere 
                                 + " est une minuscule son équivalent majuscule est : " 
                                 + caractere.toUpperCase(caractos) ); 
    	    }
	 }else {
	    if(caractere.isDigit(caractos)) {
	        System.out.print("est un chiffre");
    	    }else {
    	        System.out.print("est un caractére spéciale");
    	    }
	}
    }
}
