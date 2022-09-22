package POO;

public class executavel {
	public static void main(String[] args) {
		
		//LABORATORIO LEGREAND - R$ 4335,00
		ThiagoEndereco end1 = new ThiagoEndereco("Rua dos Remédios", 100, "Centro", "Palhoça", "SC");
		ThiagoLaboratorio legrand = new ThiagoLaboratorio("Legrand", "12.345.678/0001-11", end1);
		ThiagoRemedio rosuvas = new ThiagoRemedio("Rosuvas", 55.00, legrand);
		ThiagoRemedio gliface = new ThiagoRemedio("Gliface", 35.00, legrand);
		ThiagoRemedio araDoisH = new ThiagoRemedio("Aradois H", 50.00, legrand);
		ThiagoRemedio trandilax = new ThiagoRemedio("Trandilax", 10.00, legrand);
		
		//LABORATORIO MEDLEY - R$ 325,00
		ThiagoEndereco end2 = new ThiagoEndereco(
				"RUA DA MEDICAÇÃO", 200, "ESTREITO", "FLORIANÓPOLIS", "SC");
		ThiagoLaboratorio madley = new ThiagoLaboratorio(
				"MEDLEY", "CNPJ12.345.678/0001-22", end2);
		ThiagoRemedio rosuvastatina = new ThiagoRemedio("Rosuvastatina", 50.00, madley);
		ThiagoRemedio lexotan = new ThiagoRemedio("Lexotan", 40.00, madley);
		ThiagoRemedio losartana = new ThiagoRemedio("Losartana", 45.00, madley);
		ThiagoRemedio torsilax = new ThiagoRemedio("Torsilax", 15.00, madley);

		//FARMACIA
		ThiagoRemedio[] remedios = {
				rosuvas, rosuvas, rosuvas, rosuvas, gliface, gliface, gliface, araDoisH, araDoisH,
				trandilax, rosuvastatina, lexotan, lexotan, losartana, losartana, losartana, 
				torsilax, torsilax, torsilax, torsilax  };
		
		ThiagoEndereco enderecoFarmaciaSenac = new ThiagoEndereco(
				"Jardim Silva", 360, "Centro", "Florianopolis", "SC");
		
		ThiagoEstoque estoque = new ThiagoEstoque("Luciano", remedios);
		
		ThiagoFarmacia farmacia = new ThiagoFarmacia(
				"Farmacia Senac", "12.345.678/0001-33", enderecoFarmaciaSenac, estoque);

		//QUESTÃO 3
//		A-INFORMAR O NOME DO RESPONSÁVEL PELO ESTOQUE;
		farmacia.identificarResponsavel();

//		B–CALCULAR O TOTAL (EM REAIS)DO ESTOQUE DE REMÉDIOS;
		System.out.println("\nTotal em estoque:" + farmacia.totalEstoque());

//		C–DADO  O  NOME  DE  UM LABORATÓRIO,CALCULAR  O  TOTAL (EM  REAIS)DO  ESTOQUE  DE  
//		REMÉDIOS  DESTE LABORATÓRIO.NESTE CASO SEMPRE SERÁ INFORMADO O NOME DO LABORATÓRIO 
//		COMO PARÂMETRO;
		ThiagoLaboratorio lab = farmacia.acharLaboratorio("MEDLEY");

//		D–DADO  O  NOME  DE  UM LABORATÓRIO,BUSCARAS  INFORMAÇÕES  DESTE  LABORATÓRIO.
//		NESTE  CASO SEMPRE SERÁ INFORMADO O NOME DO LABORATÓRIO COMO PARÂMETRO;
		System.out.println(
				"\nTotal estoque laboratorio " + lab.getNome() + ": " 
				+ farmacia.totalEstoquePorLaboratorio("MEDLEY"));

		
		
		System.out.println("\n" + lab);
		System.out.println(farmacia);
	}
}
