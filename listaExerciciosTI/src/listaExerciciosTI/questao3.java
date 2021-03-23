/*
N�meros pal�ndromos s�o aqueles que se escrevem da mesma forma tanto da
esquerda para a direita quanto da direita para a esquerda (ex: 1221). Fa�a um
algoritmo que determine e imprima os primeiros 30 n�meros pal�ndromos do
conjunto dos naturais, maiores que 1000
 */

package listaExerciciosTI;

public class questao3 {

	public static void main(String[] args) {

		int numero = 1000;
		
		for(int i = 0; i < 30; i++) {
			
			boolean achou = false;
			
			while (!achou) {
				int milhar = 0;
				int centena = 0;
				int dezena = 0;
				int unidade = 0;
				
				unidade = numero % 10;
				dezena = (numero % 100 - unidade) / 10;
				centena = (numero % 1000 - dezena) / 100;
				milhar = (numero - centena) / 1000;
				
				if((unidade == milhar) && (dezena == centena)) {
					System.out.println((i + 1) + "� pal�ndromo = " + numero);
					achou = true;
				}
				numero = numero + 1;
			}
		}
	}
}
/*
Resultado:
1� pal�ndromo = 1001
2� pal�ndromo = 1111
3� pal�ndromo = 1221
4� pal�ndromo = 1331
5� pal�ndromo = 1441
6� pal�ndromo = 1551
7� pal�ndromo = 1661
8� pal�ndromo = 1771
9� pal�ndromo = 1881
10� pal�ndromo = 1991
11� pal�ndromo = 2002
12� pal�ndromo = 2112
13� pal�ndromo = 2222
14� pal�ndromo = 2332
15� pal�ndromo = 2442
16� pal�ndromo = 2552
17� pal�ndromo = 2662
18� pal�ndromo = 2772
19� pal�ndromo = 2882
20� pal�ndromo = 2992
21� pal�ndromo = 3003
22� pal�ndromo = 3113
23� pal�ndromo = 3223
24� pal�ndromo = 3333
25� pal�ndromo = 3443
26� pal�ndromo = 3553
27� pal�ndromo = 3663
28� pal�ndromo = 3773
29� pal�ndromo = 3883
30� pal�ndromo = 3993
 */