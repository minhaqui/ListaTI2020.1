/*
4. Uma rede de supermercados vende produtos por dia e os registra em um arquivo
indicando c�digo, valor da venda e quantidade vendida. Determine e imprima qual o
c�digo de produto que � o campe�o di�rio de vendas e quais foram os valores totais
de quantidade e pre�os vendidos. O produto zzzz � um flag.
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

		zzzz = "C�digo do produto = " + codigo + " quantidade de vendas = " + quantidadeVendida
				+ " pre�o vendido = " + valorVenda;
		
		escritor.write(zzzz);
		escritor.close();
	}
}