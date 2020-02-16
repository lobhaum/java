public class Conta {

	// atributos: (propriedades)
	double saldo = 100;
	int agencia;
	int numero;
	Cliente titular; // recebe o objeto Cliente


	// m�todos:
	public void deposita(double valor) { // void n�o devolve nada como resposta
		this.saldo += valor;
		// this � a conta qual eu estou invocando
		// saldo � atributo e valor � variavel que recebe o valor

	}

	public boolean saca(double valor) {

		if (this.saldo >= valor) {
			this.saldo -= valor;
			// este saldo fica valendo o saldo antigo menos o valor que deseja sacar
			return true;
		} else {
			return false;
		}
	}
	
	public boolean transfere(double valor, Conta destino) {
		if(this.saldo >= valor) {
			this.saca(valor);
			destino.deposita(valor);
			return true;
		}else {
			System.out.println("Saldo insuficiente");
			return false;
		}
		
	}
}
