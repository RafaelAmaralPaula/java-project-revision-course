package com.lovelacetecnologia.introducao_generics;

import java.util.ArrayList;
import java.util.List;

public class TesteRetirandoElementos {

	public static void main(String[] args) {

		List<Funcionario> lista = new ArrayList<>();
		List<String> lista2 = new ArrayList<>();

		lista.add(new Funcionario("Rafael"));
		
		lista2.add("Filipe");
		
		Funcionario f = TesteRetirarElementos.retirar(lista);
		String s = TesteRetirarElementos.retirar(lista2);
		
		System.out.println("NOME FUNCIONARIO - > " + f.getNome());
		System.out.println("NOME FUNCIONARIO - > " + s);
		
	}

}
