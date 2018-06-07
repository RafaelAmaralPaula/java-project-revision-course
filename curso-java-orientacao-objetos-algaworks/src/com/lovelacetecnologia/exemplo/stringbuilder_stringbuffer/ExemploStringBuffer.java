package com.lovelacetecnologia.exemplo.stringbuilder_stringbuffer;

public class ExemploStringBuffer {

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer();// thread -safe - use no contexto de concorrência
		
		sb.append("Bem vindo ao curso de Java. ");
		sb.append("Fique a vontade para tirar suas dúvidas. ");
		sb.append("Estamos aqui para te ajudar. ");

		System.out.println(sb.toString());
		
	}

}
	