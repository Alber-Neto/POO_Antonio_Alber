package br.uern.di.poo.antonioalber.trabalho1;

import java.util.Scanner;

public class Questao3_16 {

	public static void main(String[] args) {
		
		int dia = 0,mes = 0,ano = 0,idade = 0;
		String nome = null,sobrenome = null;
		HeartRates pessoa = new HeartRates(nome, sobrenome, dia, mes, ano);
		Scanner input = new Scanner (System.in);
		System.out.println("digite seu nome");
		nome=input.next();
		pessoa.setNome(nome);
		System.out.println("digite seu sobrenome");
		sobrenome=input.next();
		pessoa.setSobrenome(sobrenome);
		System.out.println("digite o dia que você nasceu");
		dia=input.nextInt();
		pessoa.setDia(dia);
		System.out.println("digite o mes que você nasceu");
		mes=input.nextInt();
		pessoa.setMes(mes);
		System.out.println("digite o ano que você nasceu");
		ano=input.nextInt();
		pessoa.setAno(ano);
		
		System.out.println("seu nome");
		pessoa.getNome();
		System.out.println("seu sobrenome");
		pessoa.getSobrenome();
		System.out.println("data de nascimento");
		pessoa.getDia();
		pessoa.getMes();
		pessoa.getAno();
		System.out.println("sua idade");
		pessoa.calularidade(dia, mes, ano);
		idade=pessoa.calularidade(dia, mes, ano);
		System.out.println(idade);
		System.out.println("valor maximo");
		pessoa.maximo(idade);
		System.out.println("valor alvo");
		pessoa.alvo(idade);
	}
			
}
