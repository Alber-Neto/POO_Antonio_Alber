package br.uern.di.poo.antonioalber.trabalho1;

import java.util.Scanner;

public class Quesao2_35 {

	public static void main(String[] args) {
		float qtd,plg,qml,custo,aux;
		int ted,pd;
		Scanner input = new Scanner (System.in);
		System.out.println("digite os quilômetros totais dirigidos por dia");
		qtd=input.nextFloat();
		System.out.println("digite o preço pro litro de gasolina");
		plg=input.nextFloat();
		System.out.println("digite os quilômetros médio por litros");
		qml=input.nextFloat();
		System.out.println("digite a taxas de estacionamento por dia");
		ted=input.nextInt();
		System.out.println("digite os pedágios por dia");
		pd=input.nextInt();
		aux=(qtd/qml)*plg;
		custo=aux;
		System.out.println("Seu gasto é:");
		System.out.println(custo);
	}

}
