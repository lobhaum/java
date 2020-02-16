public class Conta {

	// atributos: (propriedades)
	private double saldo = 100;
	private int agencia;
	private int numero;
	private Cliente titular; // recebe o objeto Cliente


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
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public Cliente getTitular() {
		return titular;
	}
}
