package br.uern.di.poo.antonioalber.trabalho1;

import java.util.Scanner;

public class Quesao3_17 {
	
	
public static void main(String[] args) {
		
		int dia = 0,mes = 0,ano = 0,idade = 0;
		float peso=0,altura=0;
		String nome = null,sobrenome = null,sexo = null;
		HealthProfile pessoa = new HealthProfile(nome, sobrenome,sexo, dia, mes, ano,peso,altura);
		Scanner input = new Scanner (System.in);
		System.out.println("digite seu nome");
		nome=input.next();
		pessoa.setNome(nome);
		System.out.println("digite seu sobrenome");
		sobrenome=input.next();
		pessoa.setSobrenome(sobrenome);
		System.out.println("digite o seu sexo");
		sexo=input.next();
		pessoa.setSexo(sexo);
		System.out.println("digite o dia que você nasceu");
		dia=input.nextInt();
		pessoa.setDia(dia);
		System.out.println("digite o mes que você nasceu");
		mes=input.nextInt();
		pessoa.setMes(mes);
		System.out.println("digite o ano que você nasceu");
		ano=input.nextInt();
		pessoa.setAno(ano);
		System.out.println("digite o seu peso");
		peso=input.nextFloat();
		pessoa.setPeso(peso);
		System.out.println("digite a sua altura");
		altura=input.nextFloat();
		pessoa.setAltura(altura);
		
		System.out.println("seu nome");
		pessoa.getNome();
		System.out.println("seu sobrenome");
		pessoa.getSobrenome();
		System.out.println("seu sexo:");
		pessoa.getSexo();
		System.out.println("data de nascimento");
		pessoa.getDia();
		pessoa.getMes();
		pessoa.getAno();
		System.out.println("sua altura");
		pessoa.getAltura();
		System.out.println("seu peso");
		pessoa.getPeso();
		System.out.println("sua idade");
		pessoa.calularidade(dia, mes, ano);
		idade=pessoa.calularidade(dia, mes, ano);
		System.out.println(idade);
		System.out.println("valor maximo");
		pessoa.maximo(idade);
		System.out.println("valor alvo");
		pessoa.alvo(idade);
		System.out.println("IMC");
		pessoa.imc(altura, peso);
		System.out.println("BMI VALUES");
		System.out.println("Underweight: less than 18.5");
		System.out.println("Normal: between 18.5 and 24.9");
		System.out.println("Overwight: between 25 and 29.9");
		System.out.println("Obese: 30 or greater");
		
	}
			
}

