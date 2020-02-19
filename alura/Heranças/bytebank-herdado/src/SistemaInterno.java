
public class SistemaInterno {

	private int senha = 2222;
	
	public void autentica(Funcionario funcionario) {
		boolean autenticou = funcionario.autentica(this.senha);
		if (autenticou) {
			System.out.println("Pode entrar no sistema");
		}else {
			System.out.println("N�o pode entrar no sistema");
		}
	}
}
