package br.fellipe.modelos;

abstract class Funcionario {
	private String nome;
	protected double salario;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public void setSalario(double salario){
		this.salario = salario;
	}
	
	abstract double getBonus();
	
	public String getNome(){
		return nome;
	}



}
