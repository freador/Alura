package br.fellipe.modelos;

public class CopiadorDeRq implements Runnable {
	
	public void executa() {		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0; i< 10000; i++){
			System.out.println("COPIADOR");
		}
		
	}

}
