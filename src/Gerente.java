
public class Gerente extends Funcionario {
	
	/**
	 * @param args
	 */
	public double getBonus() {
		return this.salario * 0.3;
	}
	
	public void cobraEntrega(){
		System.out.println("Está Pronto?");
	}

}
