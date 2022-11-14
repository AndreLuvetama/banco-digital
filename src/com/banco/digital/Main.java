package com.banco.digital;

import java.text.ParseException;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Main {

	public static void main(String[] args) throws ParseException {
		 LocalDateTime dataCorrente = LocalDateTime.now(); 
		
		
		Cliente cliente = new Cliente();
		cliente.setNome("Andre Luvetama"); //Informando o nome do cliente
		
		Conta cc = new ContaCorrente(cliente, dataCorrente ); // Criando uma nova conta cc
		Conta cp = new ContaPoupanca(cliente, dataCorrente); // Criando uma nova conta CP
		
		 
		
		cc.depositar(400);
		cc.transferir(100, cp);
		cc.imprimirExtrato();
		cp.imprimirExtrato();		
		cc.pagarFatura(100);
		//cc.dataCriacao(dataCorrente);

	}

}
