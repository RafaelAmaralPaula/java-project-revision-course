package com.lovelacetecnologia.excecoes;

public class TesteExcecoesChecadas {

	public static void main(String[] args) {
		
		ContaCorrente contaCorrente = new ContaCorrente(100);
		
		try {
			contaCorrente.sacar(60);
		
		} catch (SaldoIsuficienteException e) {
			System.out.println("Desculpe, saldo Insuficiente : " + e.getMessage());
		}
		
		System.out.println("Saldo : " + contaCorrente.getSaldo());
		
		try {
			contaCorrente.sacar(10);
			
		} catch (SaldoIsuficienteException e) {
			System.out.println("Desculpe, saldo Insuficiente : " + e.getMessage());
		}catch(Exception e){
			
		}
		finally {
			System.out.println("OBRIGADO POR UTILIZAR  NOSSO SISTEMA !");
		}
		
		System.out.println("Saldo AGORA: " + contaCorrente.getSaldo());
	
	}
}
