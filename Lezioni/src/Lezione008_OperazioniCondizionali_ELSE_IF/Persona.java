package Lezione008_OperazioniCondizionali_ELSE_IF;

public class Persona {
	
	private String nome;
	private int eta;
	private boolean vaccino = false;
	/**
	 * 
	 */
	public Persona() {
		super();
	}
	/**
	 * @param nome
	 * @param eta
	 * @param vaccino
	 */
	public Persona(String nome, int eta, boolean vaccino) {
		super();
		this.nome = nome;
		this.eta = eta;
		this.vaccino = vaccino;
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
	/**
	 * @return the vaccino
	 */
	public boolean isVaccino() {
		return vaccino;
	}
	/**
	 * @param vaccino the vaccino to set
	 */
	public void setVaccino(boolean vaccino) {
		this.vaccino = vaccino;
	}
	@Override
	public String toString() {
		return "Persona [nome=" + nome + ", eta=" + eta + ", vaccino=" + vaccino + "]";
	}
	
	
	
	

}
