/*
5. Uma locadora tem um acervo de locadores e de filmes. Os filmes são classificados por
gênero (comédia, fantasia, terror e drama) e têm tarifa de locação individualizada.
Quando locadores alugam filmes, registram-se cpf, nome e endereço do locador, o
tipo de filme locado, o seu valor e número de dias de locação. Faça um programa que
identifique os totais de locação por gênero e o tempo médio de locação dos filmes
em cada gênero. Filme NOIR é um flag.
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
			
			System.out.println("Digite o endereço do cliente.");
			enderecoLocador = teclado.next();
			
			System.out.println("Digite o genero do filme: "
					+ "(1 = comedia; 2 = fantasia; 3 = terror; 4 = drama)");
			genero = teclado.nextInt();
			
			System.out.println("Digite o CPF do cliente.");
			valor = teclado.nextInt();
			
			System.out.println("Digite a duração do filme.");
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
		
		System.out.println("Totais da locação:");
		
		System.out.println("Comedia: " + "/n" +
		"Locado "+ quantidadeComedia + " vezes e com tempo médio de " 
				+ duracaoComedia / quantidadeComedia);
		System.out.println("Fantasia: " + "/n" +
				"Locado "+ quantidadeFantasia + " vezes e com tempo médio de " 
						+ duracaoFantasia / quantidadeFantasia);
		System.out.println("Terror: " + "/n" +
				"Locado "+ quantidadeTerror + " vezes e com tempo médio de " 
						+ duracaoTerror / quantidadeTerror);
		System.out.println("Drama: " + "/n" +
				"Locado "+ quantidadeDrama + " vezes e com tempo médio de " 
						+ duracaoDrama / quantidadeDrama);
	}

}