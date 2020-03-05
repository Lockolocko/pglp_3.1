/**
 * Package de Gillot-Roux.
 */
package com.gillotroux;
/**
 * Classe employe.
 * @author Lockolocko
 *
 */
public class Employe {
/**
 * Nom de l'employe.
 */
    private final String nom;
/**
 * Adresse de l'employe.
 */
    private final String adresse;
/**
 * Constructeur.
 * @param nom2
 * @param adresse2
 */
    public Employe(final String nom2, final String adresse2) {
        this.nom = nom2;
        this.adresse = adresse2;
    }
/**
 * Calcule le salaire.
 * @return 1
 */
    public double calculeScalaire() {
        return 1;
    }
/**
 * Retourne le nom.
 * @return nom
 */
    public String getNom() {
        return this.nom;
    }
/**
 * Retourne adresse.
 * @return adresse
 */
    public String getAdresse() {
        return this.adresse;
    }
}
