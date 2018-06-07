package com.lovelacetecnologia.excecoes;

public class ContaCorrente {

	private double saldo;

	
	public ContaCorrente(double saldo) {
		this.saldo = saldo;
	}

	
	public void depositar(double deposito) {
		if(deposito <= 0) {
			throw new IllegalArgumentException("Valor informado Ilegal ! ");
		}
		
		this.saldo += deposito;
	}

	
	public void sacar(double quantidade) throws SaldoIsuficienteException{
		
		double temp = saldo  - quantidade ;
		
		if(temp < 0){
			throw new SaldoIsuficienteException("Operação Ilegal , Foi não possui saldo suficiente !");
		}
		
		this.saldo -= quantidade;
	}

	
	public double getSaldo() {
		return this.saldo;
	}

}
