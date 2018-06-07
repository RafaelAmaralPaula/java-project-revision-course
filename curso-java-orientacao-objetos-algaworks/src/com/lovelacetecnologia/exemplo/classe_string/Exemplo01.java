package com.lovelacetecnologia.exemplo.classe_string;

public class Exemplo01 {

	public static void main(String[] args) {

		String nome = "Pedro";
		
		System.out.println(nome.toUpperCase());
		System.out.println(nome);		
		
		//---------------------------------------------------
		
		String s1 = "Pedro";
		String s2 = "Pedro";
				
		System.out.println("S1 == S2 :" + (s1 == s2));		
		
		String s3 = new String("Pedro");
		System.out.println("S1 == S3 :" + (s1 == s3));
		
		System.out.println("S1 == S3 :" + (s1.equals(s3)));
		
		String s4 = "pEdRo";
		
		System.out.println("S1 == S4 :" + (s1.equalsIgnoreCase(s4)));
	}

}
