
public class Teste {

	public static void main(String[] args) {
		
		FuncionarioTeste funcionario = new FuncionarioTeste();
		FuncionarioTeste gerente = new FuncionarioTeste();
		FuncionarioTeste diretor = new FuncionarioTeste();
		
		funcionario.setSalario(3000.0);
		System.out.println(funcionario.getTipo());
		System.out.println(funcionario.getBonificacao());
		
		gerente.setTipo(1);
		gerente.setSalario(7000.0);
		System.out.println(gerente.getTipo());
		System.out.println(gerente.getBonificacao());
		
		diretor.setTipo(2);
		diretor.setSalario(15000.0);
		System.out.println(diretor.getTipo());
		System.out.println(diretor.getBonificacao());
		
		
	}
}
