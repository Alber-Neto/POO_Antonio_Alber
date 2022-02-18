package br.uern.di.poo.antonioalber.trabalho1;

public class HealthProfile {
	private String nome,sobrenome,sexo;
	private int mes,dia,ano;
	private float altura,peso;
	
public HealthProfile (String nome, String sobrenome,String sexo, int mes, int dia, int ano,float peso,float altura) {
	super();
	this.nome = nome;
	this.sobrenome = sobrenome;
	this.mes = mes;
	this.dia = dia;
	this.ano = ano;
	this.sexo=sexo;
	this.peso=peso;
	this.altura=altura;
}
public void setMes(int mes){
	this.mes=mes;
}

public void setDia(int dia) {
	this.dia=dia;
}

public void setAno(int ano) {
	this.ano=ano;
}

public void setNome(String nome) {
	this.nome=nome;
}

public void setSobrenome(String sobrenome) {
	this.sobrenome=sobrenome;
}

public void setSexo(String sexo) {
	this.sexo=sexo;
}

public void setAltura(float altura) {
	this.altura=altura;
}

public void setPeso(float peso) {
	this.peso=peso;
}

public int getMes(){
	System.out.println(mes);
	return mes;
}

public int getDia() {
	System.out.println(dia);
	return dia;
}

public int getAno() {
	System.out.println(ano);
	return ano;
}

public String getNome() {
	System.out.println(nome);
	return nome;
}

public String getSobrenome() {
	System.out.println(sobrenome);
	return sobrenome;
}

public String getSexo() {
	System.out.println(sexo);
	return sexo;
}

public float getAltura() {
	System.out.println(altura);
	return altura;
}

public float getPeso() {
	System.out.println(peso);
	return peso;
}

	public int calularidade(int dia,int mes,int ano) {
		int idade,aux;
		if(dia==16 && mes==2) {
			aux=0;
		}
		else {
			aux=1;
		}
		idade= 2022-ano-aux;
		return idade;
	} 
	public int maximo(int idade) {
		int maximo;
		maximo=220-idade;
		System.out.println(maximo);
		return maximo;
	}
	public double alvo(int idade) {
		double alvo;
		alvo=(220-idade)*0.5;
		System.out.println(alvo);
		return alvo;
	}
	public double imc(float altura,float peso) {
		double imc;
		imc=peso/Math.pow(altura, 2);
		System.out.println(imc);
		return imc;
	}
	
}