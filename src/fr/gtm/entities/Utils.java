package fr.gtm.entities;

public class Utils {
	
	public static boolean isInteger (String number) {
		return number.matches("[0-9] {1,}");
		
		}
	public static char toDigit(char lettre) {
		
		char c = Character.toUpperCase(lettre);
				if(c>='0' && c<='9') 
				return c;
				
				if(c>='A' && c<='Z') 
					return (char) (c-'A'  + '1') ;
				
				if(c>='J' && c<='R') 
					return (char) (c-'J'  + '1');
				
				if(c>='S' && c<='Z') 
					return (char) (c-'S'  + '2');
				return 0;		
		
	}
	public static String normalize (String numero) {
		
		
		return numero;
		
	}

}
