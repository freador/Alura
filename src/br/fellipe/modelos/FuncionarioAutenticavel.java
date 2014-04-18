package br.fellipe.modelos;

public abstract class FuncionarioAutenticavel extends Funcionario {
	private int senha;
	public boolean autentica(int senha) {
		// TODO Auto-generated method stub
		return this.senha == senha;
	}
	
}
