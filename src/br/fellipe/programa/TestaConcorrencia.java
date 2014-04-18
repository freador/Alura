package br.fellipe.programa;

import br.fellipe.modelos.Conta;
import br.fellipe.modelos.FazDeposito;

public class TestaConcorrencia {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// BarradeProgresso barra = new BarradeProgresso();
		// Thread t1 = new Thread(barra);
		// t1.start();
		// barra.executa();
		//
		// CopiadorDeRq copy = new CopiadorDeRq();
		// Thread t2 = new Thread(copy);
		// t2.start();
		// copy.executa();

		Conta c1 = new Conta("Fellipe", 500, 5000);

		FazDeposito acao = new FazDeposito(c1);
		Thread t1 = new Thread(acao);
		Thread t2 = new Thread(acao);
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println(c1.getSaldo());

	}

}
