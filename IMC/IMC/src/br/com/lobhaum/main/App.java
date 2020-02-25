package br.com.lobhaum.main;

public class App {

	public static void main(String[] args) {
		
		// Criando objeto:
		Imc imc = new Imc(1.84, 98.0);
		System.out.println("IMC");
		System.out.println(imc.getAltura());
		System.out.println(imc.getKilo());
		System.out.println(imc.calculoImc());
		System.out.println(imc.resultadoImc());
	}

}
