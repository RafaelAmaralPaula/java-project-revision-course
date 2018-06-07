package com.lovelacetecnologia.exemplo_collection;

import java.util.ArrayList;
import java.util.List;

public class TesteListArray {

	public static void main(String[] args) {

		Aluno a1 = new Aluno("Rafael");
		Aluno a2 = new Aluno("Mateus");
		Aluno a3 = new Aluno("Alexandre");
		Aluno a4 = new Aluno("Filipe");

		List<Aluno> alunos = new ArrayList<Aluno>();

		alunos.add(a1);
		alunos.add(a2);
		alunos.add(a3);
		alunos.add(a4);
		alunos.add(a4);

		imprimirAlunos(alunos);

	}

	public static void imprimirAlunos(List<Aluno> lista) {

		for (Aluno a : lista) {

			System.out.println("Nome Do Aluno : " + a.getNome());
		}

	}

}
