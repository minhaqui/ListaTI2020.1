/*
6. Um hospital de uma dada rede de hospitais tem registros de pacientes em um arquivo
geral. Nesse arquivo há dados de cada paciente (cpf, nome e idade), setor de
internação (A ou B), quantidade de dias internação e de medicamentos tomados,
além de indicativo de estado evolutivo atingido (leve, moderado, grave, óbito). O
arquivo está classificado por setor (A, B). Faca um algoritmo LA que determine a partir
do processamento do arquivo, por setor de internação, o total de pacientes
internados, quantos dias eles passaram em média na internação, qual quantidade
média de remédios que eles tomaram, e contabilize os totais de cada tipo de
evolução. Informe também o total geral de pacientes tratados. O setor ZZ deve ser
um flag
 */

package listaExerciciosTI;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class questao6 {

	public static void main(String[] args) throws FileNotFoundException {
		
		File arquivoGeral = new File ("arquivoGeral.txt");
		Scanner lerArquivo = new Scanner(arquivoGeral);
		
		int contador = 0;
		int setorInternacaoA = 0;
		int setorInternacaoB = 0;
		int diasInternadoA = 0;
		int diasInternadoB = 0;
		int medicamentosTomadosA = 0;
		int medicamentosTomadosB = 0;
		int estadoEvolutivoLeve = 0;
		int estadoEvolutivoModerado = 0;
		int estadoEvolutivoGrave = 0;
		int estadoEvolutivoObito = 0;
		String SaidaA = new String();
		String SaidaB = new String();
		
		while(lerArquivo.hasNextLine()) {
			String cpf = lerArquivo.next();
			String nome = lerArquivo.next();
			int idade = lerArquivo.nextInt();
			String setorInternacao = lerArquivo.next();
			int diasInternado = lerArquivo.nextInt();
			int medicamentosTomados = lerArquivo.nextInt();
			String estadoEvolutivo = lerArquivo.next();
			
			if(setorInternacao.equals("A")) {
				setorInternacaoA = setorInternacaoA + 1;
				diasInternadoA = diasInternadoA + diasInternado;
				medicamentosTomadosA = medicamentosTomadosA + medicamentosTomados;
			}
			else {
				if(setorInternacao.equals("B")) {
					setorInternacaoB = setorInternacaoB + 1;
					diasInternadoB = diasInternadoB + diasInternado;
					medicamentosTomadosB = medicamentosTomadosB + medicamentosTomados;
				}
				else {
					if(setorInternacao.equals("ZZ")) break;
				}
			}
			
			switch(estadoEvolutivo) {
			case "leve": estadoEvolutivoLeve = estadoEvolutivoLeve + 1;
			case "moderado": estadoEvolutivoModerado = estadoEvolutivoModerado + 1;
			case "grave": estadoEvolutivoGrave = estadoEvolutivoGrave + 1;
			case "obito": estadoEvolutivoObito = estadoEvolutivoObito + 1;
			default: break;
			}
			
		contador = contador + 1;
		}
		lerArquivo.close();
		
		int mediaInternacaoA = diasInternadoA / setorInternacaoA;
		SaidaA = "SETOR A \n" + "Total de pacientes internados no setor A: " + setorInternacaoA + "\n" 
		+ "Dias que eles passaram internados no setor A, em média: " + mediaInternacaoA + "\n";
		int mediaInternacaoB = diasInternadoB / setorInternacaoB;
		SaidaB = "SETOR B \n" + "Total de pacientes internados no setor B: " + setorInternacaoB + "\n" 
		+ "Dias que eles passaram internados no setor B, em média: " + mediaInternacaoB + "\n";
			
		System.out.println(SaidaA);
		System.out.println(SaidaB);
		
		System.out.println("Total de pacientes em estado evolutivo leve: " + estadoEvolutivoLeve);
		System.out.println("Total de pacientes em estado evolutivo moderado: " + estadoEvolutivoModerado);
		System.out.println("Total de pacientes em estado evolutivo grave: " + estadoEvolutivoGrave);
		System.out.println("Total de pacientes em estado evolutivo obito: " + estadoEvolutivoObito);
		System.out.println("Total geral de pacientes tratados: " + contador);
	}
}
