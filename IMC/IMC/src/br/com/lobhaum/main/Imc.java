package br.com.lobhaum.main;

public class Imc {
	
	// Declarando atributos com valores de entrada
	private double altura 	= 1.7;
	private double kilo		= 70.0;
	private double resultado = (kilo / (altura * altura));
	
	/**
	 * Métodos:
	 */
	
	// Constructor:
	public Imc(double altura, double kilo) {
		this.altura 	= altura;
		this.kilo 		= kilo;
	}
	
	// getters:
	public double getAltura() {
		return altura;
	}
	
	public double getKilo() {
		return kilo;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	// calculo:
	public double calculoImc() {
		return (this.kilo / (this.altura * this.altura) ); 
	}
	
	// resultado:
	public String resultadoImc() {
		Boolean abaixoDoPeso 	=	(resultado <= 18.4);
		Boolean pesoNormal 		= 	(resultado >= 18.5 && resultado <= 24.9);
		Boolean sobrepeso		= 	(resultado >= 25.0 && resultado <= 29.9);
		Boolean obesidadeGrau1	= 	(resultado >= 30.0 && resultado <= 34.9);
		Boolean obesidageGrau2	= 	(resultado >= 35.0 && resultado <= 39.9);
		Boolean obesidadeGrau3	= 	(resultado >= 40.0);
		if (obesidadeGrau3) {
			return "Obesidade grau 3";
		}
		if (obesidageGrau2) {
			return "Obesidade grau 2";
		} 
		if (obesidadeGrau1) {
			return "Obesidade grau 1";
		}
		if (sobrepeso) {
			return "Sobrepeso";
		} 
		if (pesoNormal) {
			return "Peso normal";
		} 
		if (abaixoDoPeso) {
			return "Abaixo do peso";
		}		
		return "Valores inseridos incorretamente";
	}

}
