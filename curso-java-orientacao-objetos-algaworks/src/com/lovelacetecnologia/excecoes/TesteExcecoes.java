package com.lovelacetecnologia.excecoes;

public class TesteExcecoes {

	public static void main(String[] args) {
		
		/*int x = 5 / 0 ;
		
		System.out.println(x);*/
		
//		String nome  = null;
//		String maiuscula = nome.toUpperCase();
	 
		
//		System.out.println(maiuscula);
		
		ContaCorrente contaCorrente = new ContaCorrente(100);
		
		try {
			System.out.println("Olá , Tudo Bem ?"); 
			contaCorrente.depositar(-10);
			System.err.println("ERROR");
		}catch(IllegalArgumentException e) {
			System.out.println("Você executou uma operação illegal : " + e.getMessage());
		}
		
	}

}
