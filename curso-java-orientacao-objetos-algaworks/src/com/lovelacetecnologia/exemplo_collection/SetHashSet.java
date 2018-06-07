package com.lovelacetecnologia.exemplo_collection;

import java.util.HashSet;
import java.util.Set;

public class SetHashSet {

	public static void main(String[] args) {
		
		
		Aluno a1 = new Aluno("Rafael");
		Aluno a2 = new Aluno("Mateus");
		Aluno a3 = new Aluno("Alexandre");
		Aluno a4 = new Aluno("Filipe");
		
		Set<Aluno> aluno = new HashSet<Aluno>();
		
		aluno.add(a1);
		aluno.add(a2);
		aluno.add(a3);
		aluno.add(a4);
		aluno.add(a4);
		
		imprimirAlunos(aluno);
	 	
	}
	
	public static void imprimirAlunos(Set<Aluno> lista) {

		for (Aluno a : lista) {

			System.out.println("Nome Do Aluno : " + a.getNome());
		}

	}


}
