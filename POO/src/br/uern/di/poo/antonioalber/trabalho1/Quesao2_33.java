package br.uern.di.poo.antonioalber.trabalho1;
import java.util.Scanner;

public class Quesao2_33 {

	public static void main(String[] args) {
		float altura,peso;
		double imc;
		Scanner input = new Scanner (System.in);
		System.out.println("Digite sua altura em metros");
		altura=input.nextFloat();
		System.out.println("digite seu peso em KG");
		peso=input.nextFloat();
		imc=peso/Math.pow(altura, 2);
			System.out.println(imc);
			System.out.println("BMI VALUES");
			System.out.println("Underweight: less than 18.5");
			System.out.println("Normal: between 18.5 and 24.9");
			System.out.println("Overwight: between 25 and 29.9");
			System.out.println("Obese: 30 or greater");
		
	}

}
