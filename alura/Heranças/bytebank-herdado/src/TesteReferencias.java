
public class TesteReferencias {

	public static void main(String[] args) {
		
		Funcionario funcionario = new Gerente();
		funcionario.setNome("Escudo de Carvalho");
		funcionario.setSalario(7250.99);
		
		// Gerente gerente = new Gerente();
		Gerente gerente = new Gerente();
		
		gerente.setNome("Coelho da Pascoa");
		gerente.setSalario(25000.0);
		String nome = gerente.getNome();
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(gerente);
		controle.registra(funcionario);
		
		System.out.println(nome);
		System.out.println(controle.getSoma());
	}
}
