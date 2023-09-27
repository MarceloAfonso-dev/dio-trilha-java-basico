/* Autor: Marcelo Afonso
 * Data: 25.09.2023
 */
package edu.marcelo.anatomiaclasses;

public class MinhaClasse {

	public static void main (String [] args) {
		
		String primeiroNome = "Marcelo";
		String segundoNome = "Afonso";
		
		String nomeCompleto = nomeCompleto (primeiroNome,segundoNome);
		
		System.out.println(nomeCompleto);
		
	}
	
	public static String nomeCompleto (String primeiroNome, String segundoNome) {
		return "Resultado do método: " + primeiroNome.concat(" ").concat(segundoNome);
	}
	
}
