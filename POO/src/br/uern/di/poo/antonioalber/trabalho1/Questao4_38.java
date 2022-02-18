package br.uern.di.poo.antonioalber.trabalho1;
import java.util.Scanner;
public class Questao4_38 {

	public static void main(String[] args) {
		int[] dado = new int[4];
		int[] aux=new int[4];
		Scanner input = new Scanner (System.in);
		System.out.println("digite o numero a ser cryptografado");
		for(int i=0;i<4;i++) {
		dado[i]=input.nextInt();
		dado[i]=dado[i]+7;
		}
		for(int i=0;i<4;i++) {
			dado[i]=dado[i]%10;
		}
		aux[0]=dado[2];
		aux[1]=dado[3];
		aux[3]=dado[1];
		aux[2]=dado[0];
		System.out.println("numero cryptografado");
		System.out.println(aux[0]);
		System.out.println(aux[1]);
		System.out.println(aux[2]);
		System.out.println(aux[3]);
		for(int i=0;i<4;i++) {
			
			if(dado[i]==0) {
				dado[i]=3;
			}
			else if(dado[i]==1) {
				dado[i]=4;
				}
			else if(dado[i]==2) {
				dado[i]=5;
				}
			else if(dado[i]==3) {
				dado[i]=6;
			}
			else if(dado[i]==4) {
				dado[i]=7;
			}
			else if(dado[i]==5) {
				dado[i]=8;
			}
			else if(dado[i]==6) {
				dado[i]=9;
				}
			else if(dado[i]>6) {
				dado[i]=dado[i]-7;
			}
			
		}
		System.out.println("numero descryptografado");
		System.out.println(dado[0]);
		System.out.println(dado[1]);
		System.out.println(dado[2]);
		System.out.println(dado[3]);
	}

}
