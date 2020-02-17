
public class ContaCorrente extends Conta {

	 public ContaCorrente(int agencia, int numero) {
		 super(agencia, numero);
	 }
	 
	 @Override // mostra ao compilador que vc deseja sobreescrever o metodo
	public boolean saca(double valor) {
		// TODO Auto-generated method stub
		 double valorASacar = valor + 0.2;
		return super.saca(valorASacar);
	}

	@Override
	public void deposita(double valor) {
		// TODO Auto-generated method stub
		super.saldo += valor;
	}
}
