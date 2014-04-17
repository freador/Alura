public class Conta {
	private int saldo;
	private String nome;
	private int agencia;

	public Conta(String nome, int saldo, int agencia) {
		this.nome = nome;
		this.agencia = agencia;
		this.saldo = saldo;

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

}
