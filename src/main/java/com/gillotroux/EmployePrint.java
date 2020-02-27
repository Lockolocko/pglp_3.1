package com.gillotroux;

public class EmployePrint extends Employe{
	
	public EmployePrint(String nom,String adresse){
		super(nom,adresse);
	}
	
	
	public void afficheCoordonnees() {
		System.out.println(super.nom+", "+super.adresse);
	}
}
