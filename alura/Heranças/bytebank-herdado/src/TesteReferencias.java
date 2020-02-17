
public class TesteReferencias {

	public static void main(String[] args) {
		
		Gerente gerente = new Gerente();
		
		gerente.setNome("Coelho da Pascoa");
		String nome = gerente.getNome();
		
		System.out.println(nome);
	}
}
