
public class Diretor extends Funcionario implements Aunteticavel {
	@Override
	public double getBonus() {
		return this.salario * 0.1;
	}
	
	public void cobraRelatorios(){
		System.out.println("Relatórios");
	}

	@Override
	public boolean autentica(int senha) {
		// TODO Auto-generated method stub
		return false;
	}
	
	
}
