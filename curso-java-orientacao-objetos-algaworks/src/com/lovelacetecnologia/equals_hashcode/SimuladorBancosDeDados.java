package com.lovelacetecnologia.equals_hashcode;

import java.util.HashSet;
import java.util.Set;

public class SimuladorBancosDeDados {

	public static Set<Aluno> lista(){
		
		Set<Aluno> aluno = new HashSet<Aluno>();
		aluno.add(new Aluno ("Rafael"));
		aluno.add(new Aluno ("Filipe"));
		aluno.add(new Aluno ("Normandes"));
		aluno.add(new Aluno ("Alexandre"));
		aluno.add(new Aluno ("Thiago"));
		aluno.add(new Aluno ("Gustavo Guanabara"));
		aluno.add(new Aluno ("Neri Neitze"));
			
		return aluno ;
	}
	
}
