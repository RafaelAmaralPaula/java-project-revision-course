package com.lovelacetecnologia.exemplo.stringbuilder_stringbuffer;

public class ExemploStringBuilder {

	public static void main(String[] args) {
	
		StringBuilder sb = new StringBuilder(); // não-thread-safe -mais rápido
		
		sb.append("Bem vindo ao curso de Java. ");
		sb.append("Fique a vontade para tirar suas dúvidas. ");
		sb.append("Estamos aqui para te ajudar. ");
		
		System.out.println(sb.toString());

	}


}
