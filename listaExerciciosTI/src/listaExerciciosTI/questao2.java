/*
2. Escreva um programa LA que calcule o valor da sequência abaixo para valores de X
fornecidos em entrada. Adote um flag.
X^25  X^24  X^23  X^22         X
--- + --- - --- + --- - ... + ---
 1     2     3     4           25
*/

package listaExerciciosTI;
import java.util.Scanner;

public class questao2{

	public static void main (String args[]){
		//inicializar variaveis
		//uma variável double é uma variável inteira de tamanho maior
		Scanner teclado = new Scanner(System.in);
		double X;
		double potencia = 25;
		int sinal = 1;
		int baixo = 1;
		double total = 0;
		
		//primeira operação não faz parte do padrão de sinal
		//teclado.nextInt() recebe um número real (ponto flutuante) do teclado
		//Math.pow é a operação de potenciação da biblioteca de operações matemáticas do Java
		System.out.print("Digite um número X ");
		X = teclado.nextInt();
		teclado.close();
		total = Math.pow(X, potencia) / baixo;
		potencia = potencia - 1;
		baixo = baixo + 1;
		
		while(potencia > 1) {
			total = total + sinal * Math.pow(X, potencia) / baixo;
			potencia = potencia - 1;
			baixo = baixo + 1;
			
			//troca de sinal a cada iteração
			sinal = sinal * (-1);
		}
		
		//A última operação, +X/25, também não segue o padrão do sinal e precisa ser executada fora do loop
		total = total + Math.pow(X, potencia) / baixo;

		//imprimir resultado
		System.out.println("Total = " + total);
	}
}
//para X = 2, então total = 3.989856133725853 * 10^7	
//para X = 3, então total = 9.633279894981613 * 10^11
//para X = 4, então total = 1.2468505991364448 * 10^15