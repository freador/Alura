
public class SistemaInterno {
	
	public void autentica( Aunteticavel f){
		int senha = 123;
		
		
		if ( f.autentica(senha) == true){
			System.out.println("Bem vindo ao Systema");
		}else{
			System.out.println("N�o � bem vindo");
		}
	}

}
