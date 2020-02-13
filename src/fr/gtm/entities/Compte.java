package fr.gtm.entities;

public class Compte {
	
	
	private char compte[] = new char[11] ;
	
	public Compte (char value) throws InvalidFormsExceptions {
		if (compte.length != 11) {
			throw new InvalidFormsExceptions("vous devez renter 11 charactères");
		
		}
		
	}

	public char[] getCompte() {
		return compte;
	}
	

	
}
