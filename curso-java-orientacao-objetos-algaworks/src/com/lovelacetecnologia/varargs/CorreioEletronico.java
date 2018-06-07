package com.lovelacetecnologia.varargs;

public class CorreioEletronico {

	public void enviarEmail(String...emails ) {

		// Percorrer todos emails recebidos
		for (String email : emails) {

			System.out.println("E-mail enviado para " + email);

		}

	}

}
