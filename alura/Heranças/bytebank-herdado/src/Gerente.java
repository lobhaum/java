// Gerente é um funcionário e herda da classe Funcionário
public class Gerente extends Funcionario{

	// atributos:
	private int senha;

	// metodos:
	// metodo definir senha:
	public void setSenha(int senha) {
		this.senha = senha;
	}
	// end definir senha

	// metodo autenticacao para gerente:
	public boolean autentica(int senha) {
		if (this.senha == senha) {
			return true;
		}
		return false;
	}
	// end autenticacação

	// metodo bonificacao
	// opção sem protected
//	public double getBonificacao() {
//		return getSalario() * 1.5;
//	}
	// end opcao sem protected
	// com protected
//	public double getBonificacao() {
//		return super.salario *= 1.5; // super fala que é da classe máe
//		// enquanto this fala que é da classe atual
//	}
	// end com protected
	//protect com metodo
	public double getBonificacao() {
		return super.getBonificacao() + super.getSalario();
	}
	// end protect com metodo
	// end bonificacao
}
