package POO;

public class ThiagoEstoque {
	
	private String responsavel;
	private ThiagoRemedio[] remedios;

	public ThiagoEstoque() {
	}

	public ThiagoEstoque(String responsavel, ThiagoRemedio[] remedios) {
		super();
		this.responsavel = responsavel;
		this.remedios = remedios;
	}

	public String getResponsavel() {
		return responsavel;
	}

	public void setResponsavel(String responsavel) {
		this.responsavel = responsavel;
	}

	public ThiagoRemedio[] getRemedios() {
		return remedios;
	}

	public void setRemedios(ThiagoRemedio[] remedios) {
		this.remedios = remedios;
	}
	
	public double totalValorEmEstoque(){
		double soma = 0;
		for (ThiagoRemedio thiagoRemedio : remedios) {
			soma += thiagoRemedio.getPreco();
		}	
		return soma;
	}
	
	public double totalValorEmEstoquePorLaboratorio(ThiagoLaboratorio laboratório) {
		double soma = 0;
		for (ThiagoRemedio thiagoRemedio : remedios) {
			if(thiagoRemedio.getNome().equals(laboratório.getNome())) {
				System.out.println("lab: " + laboratório.getNome());
				soma += thiagoRemedio.getPreco();
			}
		}
		
		return soma;
	}
	
	public ThiagoLaboratorio procurarLaboratorio(String nomeLab) {
		ThiagoLaboratorio lab = null;
		for (ThiagoRemedio thiagoRemedio : remedios) {
			if(thiagoRemedio.getLaboratorio().getNome().equals(nomeLab)) {
				lab = thiagoRemedio.getLaboratorio();
			}
		}
		return lab;
	}
	
	
}
