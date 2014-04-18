package br.fellipe.modelos;

public class GuardadordeObjetos {
	
	private Object[] contas;
	private int posicaoLivre;
	
	public GuardadordeObjetos(){
		contas = new Conta[100];
		posicaoLivre = 0;
	}
	
	public void adiciona(Object nova){		
		contas[posicaoLivre]= nova;
		posicaoLivre++;
	}
	
	public Object pega(int posicao) {
		return contas[posicao];
		
	}
	
}
