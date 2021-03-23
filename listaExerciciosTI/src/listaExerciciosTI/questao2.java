/*
2. Escreva um programa LA que calcule o valor da sequ�ncia abaixo para valores de X
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
		//uma vari�vel double � uma vari�vel inteira de tamanho maior
		Scanner teclado = new Scanner(System.in);
		double X;
		double potencia = 25;
		int sinal = 1;
		int baixo = 1;
		double total = 0;
		
		//primeira opera��o n�o faz parte do padr�o de sinal
		//teclado.nextInt() recebe um n�mero real (ponto flutuante) do teclado
		//Math.pow � a opera��o de potencia��o da biblioteca de opera��es matem�ticas do Java
		System.out.print("Digite um n�mero X ");
		X = teclado.nextInt();
		teclado.close();
		total = Math.pow(X, potencia) / baixo;
		potencia = potencia - 1;
		baixo = baixo + 1;
		
		while(potencia > 1) {
			total = total + sinal * Math.pow(X, potencia) / baixo;
			potencia = potencia - 1;
			baixo = baixo + 1;
			
			//troca de sinal a cada itera��o
			sinal = sinal * (-1);
		}
		
		//A �ltima opera��o, +X/25, tamb�m n�o segue o padr�o do sinal e precisa ser executada fora do loop
		total = total + Math.pow(X, potencia) / baixo;

		//imprimir resultado
		System.out.println("Total = " + total);
	}
}
//para X = 2, ent�o total = 3.989856133725853 * 10^7	
//para X = 3, ent�o total = 9.633279894981613 * 10^11
//para X = 4, ent�o total = 1.2468505991364448 * 10^15