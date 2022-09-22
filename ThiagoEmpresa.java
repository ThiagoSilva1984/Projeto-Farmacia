package POO;

public class ThiagoEmpresa {
	private String nome;
	private String cnpj;

	private ThiagoEndereco endereco;

	public ThiagoEmpresa(String nome, String cnpj, ThiagoEndereco endereco) {
		super();
		this.nome = nome;
		this.cnpj = cnpj;
		this.endereco = endereco;
	}

	public ThiagoEmpresa() {
		super();
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public ThiagoEndereco getEndereco() {
		return endereco;
	}

	public void setEndereco(ThiagoEndereco endereco) {
		this.endereco = endereco;
	}

	@Override
	public String toString() {
		return "\nEmpresa: " 
				+ this.getNome() 
				+ "\nCNPJ: " 
				+ this.getCnpj()
				+ "Endereco: " 
				+ this.getEndereco();
	}

}
