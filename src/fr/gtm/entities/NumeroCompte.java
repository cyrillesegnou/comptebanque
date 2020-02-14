package fr.gtm.entities;

public class NumeroCompte {
	
	private NumEtablissement num1 ;
	private NumGuichet num2 ;
	private Compte num3;
	private Rib num4 ;
	public NumeroCompte(NumEtablissement num1, NumGuichet num2, Compte num3, Rib num4) {
	
		String numeroCompte = num1.getNumero()+num2.getNumero()+num3.getNumero()+num4.getNumero();
		this.num1 = num1;
		this.num2 = num2;
		this.num3 = num3;
		this.num4 = num4;
	} 
	
	
	

}
