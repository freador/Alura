public class TestaFuncionario {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Gerente merlim = new Gerente();
		merlim.setSalario(2000.00);
		merlim.cobraEntrega();

		System.out.println(merlim.getBonus());

		TotalizadorDeBonus totalizadorDeBonus = new TotalizadorDeBonus();
		totalizadorDeBonus.adiciona(merlim);


		System.out.println(totalizadorDeBonus.getTotal());

	}

}
