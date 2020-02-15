
public class CriaConta {

	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200;
		System.out.println("Conta 001:" + primeiraConta.saldo);
		
		primeiraConta.saldo += 100;
		System.out.println("Conta 001:" + primeiraConta.saldo);
		
		Conta segundaConta = new Conta();
		segundaConta.saldo = 50;
		System.out.println("Conta 002:" + segundaConta.saldo);
		
		System.out.println("Conta 001 -> Agencia: " + primeiraConta.agencia);
		System.out.println("Conta 001 -> Numero: " + primeiraConta.numero);
		
		System.out.println("Conta 002 -> Agencia: " + segundaConta.agencia);
		System.out.println("Conta 002 -> Numero: " + segundaConta.numero);

		segundaConta.agencia = 157;
		System.out.println("Conta 002 -> Agencia: " + segundaConta.agencia);
		System.out.println("Conta 002 -> Numero: " + segundaConta.numero);

	}
}
