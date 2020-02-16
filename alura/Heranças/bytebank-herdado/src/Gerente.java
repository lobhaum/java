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
//	public double getBonificacao() {
//		return this.salario * 1.5;
//	}
	// end bonificacao
}
