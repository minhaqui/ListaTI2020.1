/*
1. Escreva em LA um programa para calcular e escrever a soma dos 20 primeiros termos
da série abaixo
100    97    94    91
---- + --- + --- + ---
1!     2!    3!    4!
*/

package listaExerciciosTI;

public class questao1{

	public static void main (String args[]){

		//inicializar variaveis com números reais (ponto flutuante)
		float cima = 103;
		float baixo = 1;
		float total = 0;

		//iteração com os 20 primeiros termos
		for(int i = 1; i<= 20; i++){
			//progressão linear
			cima = cima - i*3;

			//Calcular fatorial
			for(int j = 1; j <= i; j++){
				baixo = baixo * j;
			}

			total = total + (cima / baixo);
			
			//reinicializar variaveis
			cima = 103;
			baixo = 1;
		}
		//imprimir resultado
		System.out.println("Total = " + total);
	}
}
//Total = 168.82819