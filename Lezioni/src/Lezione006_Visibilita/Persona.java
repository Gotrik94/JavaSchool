package Lezione006_Visibilita;

public class Persona {
	
	private String nome;
	private int eta;
	
	/**
	 * 
	 */
	public Persona() {
		super();
	}
	
	/**
	 * @param nome
	 * @param eta
	 */
	public Persona(String nome, int eta) {
		super();
		this.nome = nome;
		this.eta = eta;
	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the eta
	 */
	public int getEta() {
		return eta;
	}

	/**
	 * @param eta the eta to set
	 */
	public void setEta(int eta) {
		this.eta = eta;
	}

	@Override
	public String toString() {
		return "Persona [nome=" + nome + ", eta=" + eta + "]";
	}
	
	

}
