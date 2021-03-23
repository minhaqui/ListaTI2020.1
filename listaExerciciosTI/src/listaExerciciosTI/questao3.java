/*
Números palíndromos são aqueles que se escrevem da mesma forma tanto da
esquerda para a direita quanto da direita para a esquerda (ex: 1221). Faça um
algoritmo que determine e imprima os primeiros 30 números palíndromos do
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
					System.out.println((i + 1) + "º palíndromo = " + numero);
					achou = true;
				}
				numero = numero + 1;
			}
		}
	}
}
/*
Resultado:
1º palíndromo = 1001
2º palíndromo = 1111
3º palíndromo = 1221
4º palíndromo = 1331
5º palíndromo = 1441
6º palíndromo = 1551
7º palíndromo = 1661
8º palíndromo = 1771
9º palíndromo = 1881
10º palíndromo = 1991
11º palíndromo = 2002
12º palíndromo = 2112
13º palíndromo = 2222
14º palíndromo = 2332
15º palíndromo = 2442
16º palíndromo = 2552
17º palíndromo = 2662
18º palíndromo = 2772
19º palíndromo = 2882
20º palíndromo = 2992
21º palíndromo = 3003
22º palíndromo = 3113
23º palíndromo = 3223
24º palíndromo = 3333
25º palíndromo = 3443
26º palíndromo = 3553
27º palíndromo = 3663
28º palíndromo = 3773
29º palíndromo = 3883
30º palíndromo = 3993
 */