
public class TesteGerente {

	public static void main(String[] args) {
		
		Gerente gerente = new Gerente();
		gerente.setNome("Pinguim de Madagascar");
		gerente.setCpf("222.222.333-44");
		gerente.setSalario(15000.0);
		
		System.out.println("Nome: " + gerente.getNome());
		System.out.println("CPF : " + gerente.getCpf());
		System.out.println("Salário: " + gerente.getSalario());
		
		gerente.setSenha(2222);
		boolean autenticou = gerente.autentica(2222);
		System.out.println("Autenticou: " + autenticou);
	}
}
