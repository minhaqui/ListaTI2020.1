/*
4. Uma rede de supermercados vende produtos por dia e os registra em um arquivo
indicando código, valor da venda e quantidade vendida. Determine e imprima qual o
código de produto que é o campeão diário de vendas e quais foram os valores totais
de quantidade e preços vendidos. O produto zzzz é um flag.
 */


package listaExerciciosTI;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class questao4 {

	public static void main(String[] args) throws IOException {
		
		File arquivo = new File ("arquivo.txt");
		File saida = new File("saida.txt");
		FileWriter escritor = new FileWriter(saida);

		Scanner lerArquivo = new Scanner(arquivo);

		String codigo = new String();
		float valorVenda = 0;
		int quantidadeVendida = 0;
		String zzzz = new String();
		
		while(lerArquivo.hasNextLine()) {
			String codigoTemporario = lerArquivo.next();
			float valorVendaTemporario = lerArquivo.nextFloat();
			int quantidadeVendidaTemporaria = lerArquivo.nextInt();
			
			if(valorVenda * quantidadeVendida < valorVendaTemporario * quantidadeVendidaTemporaria) {
				codigo = codigoTemporario;
				valorVenda = valorVendaTemporario;
				quantidadeVendida = quantidadeVendidaTemporaria;
			}
		}
		lerArquivo.close();	

		zzzz = "Código do produto = " + codigo + " quantidade de vendas = " + quantidadeVendida
				+ " preço vendido = " + valorVenda;
		
		escritor.write(zzzz);
		escritor.close();
	}
}