package POO;

public class ThiagoRemedio {

	private String nome;
	private double preco;

	private ThiagoLaboratorio laboratorio;

	public ThiagoRemedio() {
		super();
	}

	public ThiagoRemedio(String nome, double preco, ThiagoLaboratorio laboratorio) {
		super();
		this.nome = nome;
		this.preco = preco;
		this.laboratorio = laboratorio;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public ThiagoLaboratorio getLaboratorio() {
		return laboratorio;
	}

	public void setLaboratorio(ThiagoLaboratorio laboratorio) {
		this.laboratorio = laboratorio;
	}

	@Override
	public String toString() {
		return "Remedio: " 
				+ "\nNome: " + this.getNome() 
				+ "\nPreco: " + this.getPreco() 
				+ "Laboratorio: " + this.getLaboratorio();
	}

}

/*
 * 
