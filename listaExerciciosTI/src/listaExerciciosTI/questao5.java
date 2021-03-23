/*
5. Uma locadora tem um acervo de locadores e de filmes. Os filmes s�o classificados por
g�nero (com�dia, fantasia, terror e drama) e t�m tarifa de loca��o individualizada.
Quando locadores alugam filmes, registram-se cpf, nome e endere�o do locador, o
tipo de filme locado, o seu valor e n�mero de dias de loca��o. Fa�a um programa que
identifique os totais de loca��o por g�nero e o tempo m�dio de loca��o dos filmes
em cada g�nero. Filme NOIR � um flag.
 */

package listaExerciciosTI;

import java.util.Scanner;

public class questao5 {

	public static void main(String[] args) {
		
		int quantidadeComedia = 0;
		int duracaoComedia = 0;
		int quantidadeFantasia = 0;
		int duracaoFantasia = 0;
		int quantidadeTerror = 0;
		int duracaoTerror = 0;
		int quantidadeDrama = 0;
		int duracaoDrama = 0;
		int duracao = 0;
		int genero = 0;
		int valor = 0;
		String nomeFilme = new String();
		String cpf;
		String nomeLocador;
		String enderecoLocador;
		Scanner teclado = new Scanner(System.in);
		
		while(!nomeFilme.equals("NOIR")) {
			
			System.out.println("Digite o CPF do cliente.");
			cpf = teclado.next();
			
			System.out.println("Digite o nome do cliente.");
			nomeLocador = teclado.next();
			
			System.out.println("Digite o endere�o do cliente.");
			enderecoLocador = teclado.next();
			
			System.out.println("Digite o genero do filme: "
					+ "(1 = comedia; 2 = fantasia; 3 = terror; 4 = drama)");
			genero = teclado.nextInt();
			
			System.out.println("Digite o CPF do cliente.");
			valor = teclado.nextInt();
			
			System.out.println("Digite a dura��o do filme.");
			duracao = teclado.nextInt();
			
			switch(genero) {
			case 1: {quantidadeComedia = quantidadeComedia + 1;
			duracaoComedia = duracaoComedia + duracao;
			}
			case 2: {quantidadeFantasia = quantidadeFantasia + 1;
			duracaoFantasia = duracaoFantasia + duracao;
			}
			case 3: {quantidadeTerror = quantidadeTerror + 1;
			duracaoTerror = duracaoTerror + duracao;
			}
			case 4: {quantidadeDrama = quantidadeDrama + 1;
			duracaoDrama = duracaoDrama + duracao;
			}
			default: System.out.println("Genero errado."); break;
			}
					
		}
		teclado.close();
		
		System.out.println("Totais da loca��o:");
		
		System.out.println("Comedia: " + "/n" +
		"Locado "+ quantidadeComedia + " vezes e com tempo m�dio de " 
				+ duracaoComedia / quantidadeComedia);
		System.out.println("Fantasia: " + "/n" +
				"Locado "+ quantidadeFantasia + " vezes e com tempo m�dio de " 
						+ duracaoFantasia / quantidadeFantasia);
		System.out.println("Terror: " + "/n" +
				"Locado "+ quantidadeTerror + " vezes e com tempo m�dio de " 
						+ duracaoTerror / quantidadeTerror);
		System.out.println("Drama: " + "/n" +
				"Locado "+ quantidadeDrama + " vezes e com tempo m�dio de " 
						+ duracaoDrama / quantidadeDrama);
	}

}