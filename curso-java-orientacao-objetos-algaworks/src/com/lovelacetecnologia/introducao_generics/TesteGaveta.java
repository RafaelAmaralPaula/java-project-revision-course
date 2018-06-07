package com.lovelacetecnologia.introducao_generics;

public class TesteGaveta {

	public static void main(String[] args) {
		
		Gaveta<Livros> gaveta = new Gaveta<>();
		
		gaveta.colocar(new Livros("ALGOTIMO LÓGICA PROGRAMAÇÃO"));
		gaveta.colocar(new Livros("MY SQL PARA INICIANTES PRIMEIROS PASSOS"));
		gaveta.retirarPrimeiro();		
		
		
		Gaveta<Integer> gaveta1 = new Gaveta<>();
		gaveta1.colocar(4);
		
		
		
		
	}

}
