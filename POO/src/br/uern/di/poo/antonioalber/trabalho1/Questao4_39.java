package br.uern.di.poo.antonioalber.trabalho1;

public class Questao4_39 {

	public static void main(String[] args) {
		double[] populacao=new double[75],cresimento=new double[75];
		int[] anos=new int[75];
		anos[0]=1;
		populacao[0]=7.753;
		cresimento[0]=populacao[0]*0.01;
		for(int i=1;i<75;i++) {
			anos[i]=anos[i-1]+1;
			populacao[i]=populacao[i-1]+cresimento[i-1];
			cresimento[i]=populacao[i]*0.01;
		}
		System.out.println("anos/população/cresimento");
		for(int i=0;i<75;i++) {
			System.out.println(anos[i]+"/"+populacao[i]+"/"+cresimento[i]);
		}
		for(int i=1;i<75;i++) {
			if(7.753 * 2<=populacao[i] && populacao[i] < 7.753*2.02) {
				System.out.println("a população vai ser o dobro em "+anos[i]+" anos");	
			}
		}
	}

}
