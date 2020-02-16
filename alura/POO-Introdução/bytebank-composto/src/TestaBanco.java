
public class TestaBanco {

	public static void main(String[] args) {
		Cliente paulo = new Cliente();
		paulo.nome = "Paulo Silveira";
		paulo.cpf = "222.222.222-22";
		paulo.profissao = "programador";
		
		Conta contaPaulo = new Conta();
		contaPaulo.deposita(100);
		contaPaulo.titular = paulo;//recebe o objeto (ponteiro)
		System.out.println(contaPaulo.titular.nome);
	}
}
