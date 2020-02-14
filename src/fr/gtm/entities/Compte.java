package fr.gtm.entities;

public class Compte {

	private String numero ;
	
	
	public Compte (String numero) throws InvalidFormatException {
		char ch1=numero.charAt(0);
		char ch2=numero.charAt(0);
		char ch3=numero.charAt(0);
		char ch4=numero.charAt(0);
		char ch5=numero.charAt(0);
		char ch6=numero.charAt(0);
		char ch7=numero.charAt(0);
		char ch8=numero.charAt(0);
		char ch9=numero.charAt(0);
		char ch10=numero.charAt(0);
		char ch11=numero.charAt(0);
		
		for (int i =0; i<=11; i++) {
			 
			
		}
		if (numero.length()>11 || numero.length() ==0) {
			throw new InvalidFormatException("le numero de compte doit etre comprit entre 0 et 11"); 
					}
		else { 
			for (int i = 0; i< 11 - numero.length() ; i++ ) {
				numero = "0" + Banque.conversion(numero) ;
			}
			
			this.numero = numero ;
		}
		}
	public String getNumero() {
		return numero;
	}
	
	private char num[]= new char [11];
	
}


