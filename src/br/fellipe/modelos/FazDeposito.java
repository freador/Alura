package br.fellipe.modelos;


public class FazDeposito implements Runnable {

	private final Conta conta;	
	public FazDeposito(Conta conta){
		this.conta= conta;
	}
	
	@Override
	public void run() {
		
		conta.deposita(100);
		// TODO Auto-generated method stub
		
		
	}

}
