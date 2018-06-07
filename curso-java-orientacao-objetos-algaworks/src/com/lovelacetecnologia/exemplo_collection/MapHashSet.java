package com.lovelacetecnologia.exemplo_collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapHashSet {
	
	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Rafael");
		Aluno a2 = new Aluno("Mateus");
		Aluno a3 = new Aluno("Alexandre");
		Aluno a4 = new Aluno("Filipe");
		
		Map<String, Aluno> aluno = new HashMap<String,Aluno>();
		
		aluno.put("1", a1);
		aluno.put("2", a2);
		aluno.put("3", a3);
		aluno.put("4", a4);
 		
		imprimirAlunos(aluno);
		
		Aluno recuperado = aluno.get("3");
		
		System.out.println("Aluno chave 3 " + recuperado.getNome());
		
	}
	
	public static void imprimirAlunos(Map<String , Aluno> lista) {

		for (Aluno a : lista.values()) {

			System.out.println("Nome Do Aluno : " + a.getNome());
		}

	}

	
}	
