
public class FuncionarioTeste {
	
	// atributos:
	private String nome;
	private String cpf;
	private double salario;
	private int tipo = 0; // 0 - Funcionario comum; 1 - Gerente; 2 - Diretor
	
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
	public int getTipo() {
		return this.tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	//end gets and sets
	
	// metodo bonificacao
	public double getBonificacao() {

        if(this.tipo == 0) { // Funcionário comum;
            return this.salario * 0.1;
        } else if(this.tipo == 1) { // Gerente;
            return this.salario;
        } else {
            return this.salario * 1.5;
        }

	}
		
	}


