package com.lovelacetecnologia.introducao_generics;

import java.util.ArrayList;
import java.util.List;

public class IntroducaoGenericsPrincipal {

	public static void main(String[] args) {

		List<Funcionario> colecao = new ArrayList<>();

		colecao.add(new Funcionario("Rafael"));
		colecao.add(new Funcionario("Filipe Bastos"));

		for (Funcionario f : colecao) {

			System.out.println("NOME DO FUNCIONARIO - >  " + f.getNome());

		}

	}

}
