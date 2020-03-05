/**
 * Package de Gillot-Roux.
 */
package com.gillotroux;
/**
 * Affichage des employ�s.
 * @author Lockolocko
 *
 */
public class EmployePrint extends Employe {
/**
 * Construteur.
 * @param nom2
 * @param adresse2
 */
    public EmployePrint(final String nom2, final String adresse2) {
        super(nom2, adresse2);
    }
/**
 * Affichage.
 */
    public void afficheCoordonnees() {
         System.out.println(super.getNom() + ", " + super.getAdresse());
    }
}
