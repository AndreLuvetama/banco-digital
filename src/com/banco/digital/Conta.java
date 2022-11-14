package com.banco.digital;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import com.banco.digital.interfac.IConta;

public abstract class Conta implements IConta{
	protected int agencia;
	protected int conta;
	protected int numero;
	protected double saldo;
	DateTimeFormatter dataFormatada = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
	
	
	//protected Date dataCriacao;
	private Cliente cliente;
	private LocalDateTime data;
	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;
	
	public Conta(Cliente cliente, LocalDateTime data) { // Toda conta deverá ter um cliente
		this.agencia = Conta.AGENCIA_PADRAO; // isso faz com que o número seja gerado automaticamente
		this.numero = SEQUENCIAL++;  //sempre que criar uma conta, o valor será incrementado
		this.cliente = cliente;
		this.data = data;
	}
	public int getNumero() {
		return numero;
	}

	
	
	public int getAgencia() {
		return agencia;
	}

	public int getConta() {
		return conta;
	}
	
	public double getSaldo() {
		return saldo;
	}

	@Override
	public void depositar(double valor) {
		saldo += valor;
		
	}

	@Override
	public void sacar(double valor) {
		saldo -= valor;
		
	}

	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	@Override
	public void transferir(double valor, Conta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);		
	}
	
	
	@Override
	public void dataCriacao(LocalDateTime dataCriacao) {
		data = dataCriacao;
	}
	
	@Override
	public void pagarFatura(double valor) {
		if(saldo >= valor) {
			this.saldo -=valor;	
			System.out.println("Fatura paga ");
		}else {
			System.out.println("Saldo insuficiente na conta " + this.getSaldo());
		}
		
	}

	protected void imprimitInfosComuns() {
		System.out.println(String.format("Titular: %s", this.cliente.getNome()));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Numero: %d", this.numero));
		System.out.println(String.format("Saldo: %2f", this.saldo));	
		System.out.println("Data da abertura: " + data);
		
	}
	
}
