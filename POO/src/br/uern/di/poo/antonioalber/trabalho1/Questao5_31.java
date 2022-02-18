package br.uern.di.poo.antonioalber.trabalho1;

import java.util.Scanner;

public class Questao5_31 {

	public static void main(String[] args) {
int q1,q2,q3,q4,q5,nota=0;
Scanner input = new Scanner (System.in);
System.out.println("O que e aquecimento global");
System.out.println("1-É as queimadas na amazonia"+"\n"+"2-É os deretimentos das calotas polares");
System.out.println("3-É o processo de mudança da temperatura média global da atmosfera e dos oceanos");
System.out.println("4-É o acumulo de lixo no espaço");
q1=input.nextInt();
if(q1==3){
	nota=nota+1;
}
System.out.println("O que e efeito estufa");
System.out.println("1-É um fenômeno fisico de aquecimento dos mares "+"\n"+"2-É o efeito dos gases emitidos pelos veiculos");
System.out.println("3-É o fenõmeno da luz ao entrar em contato com a agua");
System.out.println("4-É um fenômeno natural de aquecimento térmico da Terra,");
q2=input.nextInt();
if(q2==4){
	nota=nota+1;
}
System.out.println("Qual destes fenômenos sofre alteração com o agravamento do efeito estufa");
System.out.println("1-Circulação termoalina "+"\n"+"2-Bioluminescência marinha");
System.out.println("3-abalos sismicos"+"\n"+"4-Aurora boreal");
q3=input.nextInt();
if(q3==1){
	nota=nota+1;
}
System.out.println("Qual destes gases  agravam o efeito estufa");
System.out.println("1-Hélio (He) "+"\n"+"2-Neônio (Ne) ");
System.out.println("3-Dióxido de Carbono (CO2)"+"\n"+"4-Argônio (Ar)");
q4=input.nextInt();
if(q4==3){
	nota=nota+1;
}
System.out.println("As Nações Unidas em 1988 criou o IPCC com qual objetivo");
System.out.println("1-Com o objetivo de fiscalizar a orbita terrestre"+"\n"+"2-Com o objetivo de alertar os paises sobre o efeito estufa ");
System.out.println("3-Com o objetivo de avaliar as informações científicas, técnicas e socioeconômicas relevantes para a compreensão da mudança do clima.");
System.out.println("1-Com o objetivo de analisar os planos de combate ao aquecimento global dos baises ");
q5=input.nextInt();
if(q5==3){
	nota=nota+1;
	
}
if(nota==5) {
	System.out.println("excelente");
}
if(nota==4) {
	System.out.println("muito bem");
}
if(nota<=3) {
	System.out.println("é momento de aprimorar seu conhecimento sobre aquecimento global");
	System.out.println("https://www.wwf.org.br/informacoes/?uNewsID=6920&gclid=Cj0KCQiApL2QBhC8ARIsAGMm-KFI5x1lOq6NnIhfaOzPUXhPwF7Wtz9eBH-7xXgxZUHzNJY94ZXaWOEaAnlSEALw_wcB");
	System.out.println("https://pt.wikipedia.org/wiki/Aquecimento_global");
	System.out.println("https://www.ecycle.com.br/aquecimento-global/");
}
	}

}
