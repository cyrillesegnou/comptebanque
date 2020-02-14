package fr.gtm.entities;

public class Banque {
	
//	public static String conversion1(String s) {
//	int f[]= {1,1,2,2,2,3,3,3,4,4,4,5,5,5,6,6,6,7,7,7,8,8,8,9,9,9} ;			
//	}	
	
			public static String conversion (String s) {
		String b = new String();
		switch(s.toUpperCase()) {
		case "A" : case "J" : 
		b = "1" ;
		break ;
		
		case "B" : case "K" : case "S" :
		b = "2" ;
		break ;
		
		case "C" : case "L" : case "T" :
		b = "3" ;
		break ;
		
		case "D" : case "M" : case "U" :
		b = "4" ;
		break ;
		
		case "E" : case "N" : case "V" :
		b = "5" ;
		break ;
		
		case "F" : case "O" : case "W" :
		b = "6" ;
		break ;
		
		case "G" : case "P" : case "X" :
		b = "7" ;
		break ;
		
		case "H" : case "Q" : case "Y" :
		b = "8" ;
		break ;
		
		case "I" : case "R" : case "Z" :
		b = "9" ;
		break ;
			}
		return b;
			}
}