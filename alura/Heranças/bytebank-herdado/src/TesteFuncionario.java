
public class TesteFuncionario {

	public static void main(String[] args) {
		
		// Criação do funcionário:
		Gerente funcionario = new Gerente();
		// System.out.println(funcionario); //objeto funcionario armazenado em @15db9742
		funcionario.setNome("Nico Steppet");
		funcionario.setCpf("223.333.445-67");
		funcionario.setSalario(2600.0);
		
		System.out.println(funcionario.getNome());
		System.out.println(funcionario.getBonificacao());
	}
}
