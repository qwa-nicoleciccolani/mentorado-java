package br.com.qwasolucoes.mentoria.implementacoes.logica_programacao;

import java.util.Arrays;

public class Cenario {
	public static void main(String[] args) {
		
	       LogicaProgramacaoProvider logicaProvider = new LogicaProgramacaoProvider();
	       
	       
	       //tabuada
	        int[][] resultadoTabuada = logicaProvider.tabuada(6);
	        for (int[] linha : resultadoTabuada) {
	            //System.out.println(Arrays.toString(linha));
	        }
	        
	        
	        
	      //Dobro até mil
	        int[] dobro = logicaProvider.obterDobrosAteMil(2);
	        System.out.println(Arrays.toString(dobro));


	}
}
