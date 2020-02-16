
public class Funcionario {
	
	// atributos:
	private String nome;
	private String cpf;
	private double salario;
	
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
	public double getBonificacao() {
		return this.salario * 0.1;
	}

}
