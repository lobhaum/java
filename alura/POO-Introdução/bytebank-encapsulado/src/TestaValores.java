
public class TestaValores {

	public static void main(String[] args) {
		
		Conta conta = new Conta(1337, 24266);
		Conta conta2 = new Conta(1337, 24267);
		Conta conta3 = new Conta(1337, 24268);
		System.out.println("total de contas: " + Conta.getTotal());
	}
}
