
public class TesteContas {

	public static void main(String[] args) {
		
		ContaCorrente contaCorrente = new ContaCorrente(2978, 7651);
		ContaPoupanca contaPoupanca = new ContaPoupanca(2978, 76510);
		
		contaCorrente.deposita(1500.0);
		contaPoupanca.deposita(10500.29);
		System.out.println(contaCorrente.getSaldo());
		
		contaCorrente.transfere(1000.0, contaPoupanca);
		System.out.println("Saldo Conta Corrente: " + contaCorrente.getSaldo());
		System.out.println("Saldo Conta Poupança: " + contaPoupanca.getSaldo());
	}
}
