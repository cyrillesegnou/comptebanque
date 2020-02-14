package fr.gtm.entities;

public class NumGuichet {
	
	private String numero ;
	
	public NumGuichet(String numero) throws InvalidFormatException {
		if (numero.length() !=5 ) {
			throw new InvalidFormatException("le numero doit etre de 5 characteres") ;
		}
		else {
			this.numero = numero ;		
		}
	}
	public String getNumero() {
		return numero;
	}
}