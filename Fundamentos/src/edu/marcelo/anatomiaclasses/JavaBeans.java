/* Autor: Marcelo Afonso
 * Data: 25.09.2023
 */
package edu.marcelo.anatomiaclasses;

public class JavaBeans {

/* Nao Recomendado para Variaveis
	double salMedio = 1500.23  //variável abreviada, o que dificulta a compreensão
	
			String emails = "aluno@escola.com" //confuso se a variável seria um array ou único e-mail
			
			String myName = "JOSEPH" //se idioma pt-BR, o valor poder ser de outro idioma mas o nome da variável não 
*/
	
	
	/* Recomendado para Variaveis*/
	double salarioMedio=1500.23;
	String email ="aluno@escola.com";
	String [] emails = {"aluno@escola.com","professor@escola.com"};
	String meuNome = "JOSEPH";
	
	
	/* Exemplos de Metodos 
	somar(int n1, int n2){};

	abrirConexao(){};

	concluirProcessamento() {};

	findById(int id){}; // não se assuste, você verá muito método em inglês em sua jornada

	calcularImprimir(){}; // há algo de errado neste método, ele deveria ter uma única finalidade
	*/
	
}
