package esercizio3.app.entities;

public class Persona {

	private String nome;
	private String numeroTelefono;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNumeroTelefono() {
		return numeroTelefono;
	}

	public void setNumeroTelefono(String numeroTelefono) {
		this.numeroTelefono = numeroTelefono;
	}

	public Persona(String nome, String numeroTelefono) {
		setNome(nome);
		setNumeroTelefono(numeroTelefono);
	}

}
