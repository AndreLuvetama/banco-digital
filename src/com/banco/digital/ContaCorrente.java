package com.banco.digital;

import java.time.LocalDateTime;

public class ContaCorrente extends Conta{
	double valor;
	public ContaCorrente(Cliente cliente, LocalDateTime data) {
		super(cliente, data);
		// TODO Auto-generated constructor stub
	}

// extends, conceito de herança
	
	
	public void imprimirExtrato() {
		System.out.println("=== Extrato da Conta Corrente ===");
		super.imprimitInfosComuns();
		//super.pagarFatura(valor);
		//super.dataCriacao();
	}

	
	
}
