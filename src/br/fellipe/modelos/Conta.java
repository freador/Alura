package br.fellipe.modelos;
public class Conta implements Comparable<Conta> {
	private int saldo;
	private String nome;
	private int agencia;

	public Conta(String nome, int saldo, int agencia) {
		this.nome = nome;
		this.agencia = agencia;
		this.saldo = saldo;

	}

	void saca(double valor){
		this.saldo -=valor;
	}
	
	public synchronized void deposita(double valor){
			this.saldo += valor;
	}
	
	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public void imprime() {
		System.out.println(nome);
		System.out.println(agencia);
		System.out.println(saldo);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public int compareTo(Conta outra ) {
		// TODO Auto-generated method stub
		if( this.saldo < outra.saldo ) return -1;
		
		if( this.saldo > outra.saldo ) return 1;
		
		return 0;
	}

}
