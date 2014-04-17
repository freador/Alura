
public class Funcionario {
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
	
	public double getBonus() {
		return this.salario * 0.2;
	}
	
	public String getNome(){
		return nome;
	}

}
