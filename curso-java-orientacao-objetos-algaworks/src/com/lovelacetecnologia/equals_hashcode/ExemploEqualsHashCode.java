package com.lovelacetecnologia.equals_hashcode;

import java.util.Set;

public class ExemploEqualsHashCode {
	
	public static void main(String[] args) {
	
		Set<Aluno> aluno = SimuladorBancosDeDados.lista();
		
		// De alguma forma , sorteia o nome do 
		
		Aluno alunoSorteado = new Aluno("Alexandre");
		
		if(aluno.contains(alunoSorteado)) {
			System.out.println("Parabéns " + alunoSorteado.getNome() + "  Você Ganhou Prêmio !");
			
		}else {
			System.out.println("Aluno não cadastrado no bancos de dados !");
		}

		
		
	
		
	}
	
}
