public class Conta {

	// atributos: (propriedades)
	private double saldo = 100;
	private int agencia;
	private int numero;
	private Cliente titular; // recebe o objeto Cliente
	private static int total; // atributo estático quer dizer que é da classe

	// constructor:
	public Conta(int agencia, int numero) {
		Conta.total++;
		//System.out.println("o total de contas é: " + total);
		this.agencia = agencia;
		this.numero = numero;
		System.out.println("Conta criada " + this.getAgencia());
	}
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
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public void setNumero(int numero) {
		if(numero <= 0) {
			System.out.println("não pode valor menor ou igual a 0");
			return;
		}
		this.numero = numero;
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public void setAgencia(int agencia) {
		if(agencia <= 0) {
			System.out.println("não pode valor menor ou igual a 0");
			return;
		}
		this.agencia = agencia;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public Cliente getTitular() {
		return titular;
	}
	
	public static int getTotal() { //anuncia que o método é da classe
		return Conta.total;
	}
}
