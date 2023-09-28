package edu.marcelo.tiposvariaveis;

public class TiposVariaveis {

	public static void main (String [] args) {
		//Tipos Primitivos
		
		int saldo; //Tipo "int", nome "saldo", com nenhum valor atribuído. 
		int anoFabricacao = 2021; //tipo "int", nome "anoFabricacao", com valor 2021.
		double salarioMinimo = 2.500; //tipo "double", nome "salarioMinimo", valor 2.500.
		
		//Peculiaridades
		byte idade = 123;
		short ano = 2021;
		int cep = 21070333; // se começar com zero, talvez tenha que ser outro tipo
		long cpf = 98765432109L; // se começar com zero, talvez tenha que ser outro tipo
		float pi = 3.14F;
		double salario = 1275.33;
		
		//Erro na certa
		// TiposEVariaveis.java
		short numeroCurto = 1;
		int numeroNormal = numeroCurto;
		//short numeroCurto2 = numeroNormal; Uma variavel short nao aceitaria outra int.
			
		
	}
	
}
