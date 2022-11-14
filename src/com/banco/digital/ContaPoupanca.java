package com.banco.digital;

import java.time.LocalDateTime;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(Cliente cliente, LocalDateTime data) {
		super(cliente, data);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato da Conta Corrente ===");
		super.imprimitInfosComuns();
		//super.pagarFatura(valor);
		
	}

}
