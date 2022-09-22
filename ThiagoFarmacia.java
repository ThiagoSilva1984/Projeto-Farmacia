package POO;

public class ThiagoFarmacia extends ThiagoEmpresa {

	private ThiagoEstoque estoque;

	public ThiagoFarmacia() {
		super();
	}

	public ThiagoFarmacia(String nome, String cnpj, ThiagoEndereco endereco, ThiagoEstoque estoque) {
		super(nome, cnpj, endereco);
		this.estoque = estoque;
	}

	public ThiagoEstoque getEstoque() {
		return estoque;
	}

	public void setEstoque(ThiagoEstoque estoque) {
		this.estoque = estoque;
	}

	public void identificarResponsavel() {
		System.out.println("Responsavel estoque: " + estoque.getResponsavel());
	}

	public double totalEstoque() {
		return estoque.totalValorEmEstoque();
	}

	public double totalEstoquePorLaboratorio(String laboratorio) {
		double soma = 0;
		ThiagoLaboratorio lab = this.getEstoque().procurarLaboratorio(laboratorio);
		if (lab != null) {
			for (ThiagoRemedio remedio : estoque.getRemedios()) {
				if (remedio.getLaboratorio().getNome().equals(laboratorio)) {
					soma += remedio.getPreco();
				}
			}
		}
		return soma;
	}

	public ThiagoLaboratorio acharLaboratorio(String laboratorio) {
		return estoque.procurarLaboratorio(laboratorio);
	}

	@Override
	public String toString() {
		return "\nFarmacia: " + this.getNome() 
		+ "\nResponsavel pelo estoque: " + this.getEstoque().getResponsavel()
		+ "\nEndereço:\n" + this.getEndereco();
	}

}
