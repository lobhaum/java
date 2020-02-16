
public class TestaMetodo {

	public static void main(String[] args) {
		Conta contaDoPaulo = new Conta();
		contaDoPaulo.saldo = 100;
		contaDoPaulo.deposita(50);
		System.out.println(contaDoPaulo.saldo);
		boolean conseguiuRetirar = contaDoPaulo.saca(10); // armazena o retorno do metodo na variavel
		System.out.println(contaDoPaulo.saldo);
		System.out.println(conseguiuRetirar); // exibe retorno do metodo armazenado na variavel
		Conta contaDaMarcela = new Conta();
		contaDaMarcela.deposita(1000);
		contaDaMarcela.transfere(300, contaDoPaulo);
		System.out.println("Transferencia concluida");
		System.out.println("Saldo atual: " + contaDaMarcela.saldo);
		System.out.println("Saldo atual: " + contaDoPaulo.saldo);
		
		contaDoPaulo.titular = "Paulo Silveira";
		System.out.println(contaDoPaulo.titular);
	}
}
