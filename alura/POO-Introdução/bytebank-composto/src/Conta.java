public class Conta {

	// atributos: (propriedades)
	double saldo = 100;
	int agencia;
	int numero;
	Cliente titular; // recebe o objeto Cliente


	// métodos:
	public void deposita(double valor) { // void não devolve nada como resposta
		this.saldo += valor;
		// this é a conta qual eu estou invocando
		// saldo é atributo e valor é variavel que recebe o valor

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
