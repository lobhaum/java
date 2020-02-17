
public class ContaCorrente extends Conta {

	 public ContaCorrente(int agencia, int numero) {
		 super(agencia, numero);
	 }
	 
	 @Override // mostra ao compilador que vc deseja sobreescrever o metodo
	public boolean saca(double valor) {
		// TODO Auto-generated method stub
		return super.saca(valor);
	}
}
