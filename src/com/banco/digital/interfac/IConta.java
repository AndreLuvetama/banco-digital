package com.banco.digital.interfac;

import java.time.LocalDateTime;


import com.banco.digital.Conta;

public interface IConta {	
	 void depositar(double valor);
	 void sacar(double valor);
	 void transferir(double valor, Conta contaDestino);
	 void imprimirExtrato();
	 void pagarFatura(double valor);
	 void dataCriacao(LocalDateTime data);
}
