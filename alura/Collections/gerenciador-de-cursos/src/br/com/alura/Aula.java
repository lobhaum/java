package br.com.alura;

public class Aula implements Comparable<Aula>{
	
	public String titulo;
	private int tempo;
	
	/**
	 * Gerando construtor da classe Aula	
	 * @param titulo
	 * @param tempo
	 */
	public Aula(String titulo, int tempo) {
		this.titulo = titulo; //atributo recebe valor de titulo
		this.tempo = tempo; // atributo recebe valor de temp
	}
	/**
	 * Gerando getter de titulo
	 * @return
	 */
	
	public String getTitulo() {
		return titulo;
	}
	
	/**
	 * Gerando getter de tempo
	 * @return
	 */
	public int getTempo() {
		return tempo;
	}
	/**
	 * Reescrevendo o método toString de Object
	 * Para mostrar em tela em formato humano o
	 * ArrayList
	 */
	@Override
	public String toString() {
		
		return "[Aula: " + this.titulo +
				", " + this.tempo +
				" minutos]";
	}
	/**
	 * Sobreescrevendo metodo compareTo
	 * Adicionando a implementação Comparable<Aula> da classe Aula
	 * retornando se este titulo lexograficamente vem antes do titulo a seguir
	 */
	@Override
	public int compareTo(Aula outraAula) {
		return this.titulo.compareTo(outraAula.titulo);
	}


}
