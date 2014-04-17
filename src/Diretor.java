
public class Diretor extends Funcionario {
	@Override
	public double getBonus() {
		return this.salario * 0.1;
	}
	
	public void cobraRelatorios(){
		System.out.println("Relatórios");
	}
	
	
}
