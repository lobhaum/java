
public class TesteReferencias {

	public static void main(String[] args) {
		
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;
		System.out.println("Conta 001 - Saldo: " + primeiraConta.saldo);
		
		Conta segundaConta = primeiraConta;
		//Conta segundaConta = new Conta();
		//		segundaConta.saldo = 157;
		
		System.out.println("Conta 002 - Saldo: " + segundaConta.saldo);
		
		segundaConta.saldo += 100;
		System.out.println("Conta 002 - Saldo: " + segundaConta.saldo);
		System.out.println("Conta 001 - Saldo: " + primeiraConta.saldo);
		
		if(primeiraConta == segundaConta) {
			System.out.println("são a mesmissima conta");
		}else {
				System.out.println("São contas diferentes");
		}
		System.out.println(primeiraConta);
	} 
}
