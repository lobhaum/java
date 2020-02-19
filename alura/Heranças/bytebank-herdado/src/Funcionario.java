
public abstract class Funcionario {
	
	// atributos:
	private String nome;
	private String cpf;
	// sem protected: private double salario;
	protected double salario; // protected significa publico para filhos e privado para fora.
	
	// metodos:
	
	//gets and sets
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return this.cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalario() {
		return this.salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	//end gets and sets
	
	// metodo bonificacao
	// metodo abstrato n�o tem corpo de implementa��o
	public abstract double getBonificacao(); 
	//{
		//return this.salario * 0.1;
		// return -1;
	//}

}
