// Gerente � um funcion�rio e herda da classe Funcion�rio
/*
* "a classe Gerente é um Funcionario, herda da classe Funcionario, "
* "assina o contrato Auntenticavel, e é um Autenticavel".
*/
public class Gerente extends Funcionario implements Autenticavel, Bonificavel{

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
	// end autenticaca��o

	// metodo bonificacao
	// op��o sem protected
//	public double getBonificacao() {
//		return getSalario() * 1.5;
//	}
	// end opcao sem protected
	// com protected
//	public double getBonificacao() {
//		return super.salario *= 1.5; // super fala que � da classe m�e
//		// enquanto this fala que � da classe atual
//	}
	// end com protected
	//protect com metodo
	public double getBonificacao() {
		System.out.println("Chamando método de bonificacao do GERENTE");
		return super.getBonificacao() + super.getSalario();
	}
	// end protect com metodo
	// end bonificacao
	
	@Override
	public void setSenha(int senha) {
		
		this.senha = senha;
	}
	
	@Override
	public boolean autentica(int senha) {
		
		if(this.senha == senha) {
			return true;
		}
		return false;
	}
	
}
