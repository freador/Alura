package br.fellipe.programa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import br.fellipe.modelos.Conta;

public class TestaColecoes {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> nomes = new LinkedList<String>();
		nomes.add("Mauricio");
		nomes.add("Guilherme");

		System.out.println(nomes.get(0));
		System.out.println(nomes.contains("Guilherme"));

		Collections.sort(nomes);

		for (String nome : nomes) {
			System.out.println(nome);
		}

		ArrayList<Conta> contas = new ArrayList<Conta>();

		Conta c1 = new Conta("Fellipe", 400, 233);
		Conta c2 = new Conta("Mauricio", 308, 444);

		contas.add(c1);
		contas.add(c2);

		Collections.sort(contas);

		for (Conta c : contas) {
			System.out.println(c.getSaldo());
		}
	}

}
