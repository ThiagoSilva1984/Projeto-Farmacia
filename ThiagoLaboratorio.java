package POO;

public class ThiagoLaboratorio extends ThiagoEmpresa {

	public ThiagoLaboratorio(String nome, String cnpj, ThiagoEndereco endereco) {
		super(nome, cnpj, endereco);
	}

	public ThiagoLaboratorio() {
		super();
	}
	
	@Override
	public String toString() {
		return "Laboratorio: " + getNome() 
				+ "\nCnpj: " + getCnpj() 
				+ "\nEndereco: " + this.getEndereco();
	}
	
}
