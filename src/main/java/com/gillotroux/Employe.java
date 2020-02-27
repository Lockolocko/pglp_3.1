package com.gillotroux;

public class Employe {
	protected final String nom;
	protected final String adresse;
	
	public Employe(String nom,String adresse){
		this.nom=nom;
		this.adresse=adresse;
	}
	
	public double calculeScalaire() {
		return 1;
	}
}
