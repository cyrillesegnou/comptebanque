package fr.gtm.entities;

public class Rib {
	
	private String numero ;

	public Rib (String numero) throws InvalidFormatException {
		if (numero.length()!=2 || (Integer.parseInt(numero)<=0 || (Integer.parseInt(numero))>97)) {
			throw new InvalidFormatException("la valeur doit etre comprise entre 1 et 97") ;
		}
		else {
			this.numero = numero ;
			
		}
		
	}
	
	
	public String getNumero() {
		return numero;
	}
	

}
