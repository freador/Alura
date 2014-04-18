package br.fellipe.programa;

import br.fellipe.modelos.Conta;
import br.fellipe.modelos.GuardadordeObjetos;

public class TestaJavaLang {

	public static void main(String[] args) {
		Conta fe = new Conta("Fellipe", 3033, 8811);
		Conta bill = new Conta("Billing", 3122, 8910);

		GuardadordeObjetos armario = new GuardadordeObjetos();
		armario.adiciona(fe);
		armario.adiciona(bill);
		
		Conta armaraio0 =  (Conta) armario.pega(0);
		
		System.out.println(armaraio0.getSaldo());
	}

}
