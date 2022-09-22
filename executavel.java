package POO;

public class executavel {
	public static void main(String[] args) {
		
		//LABORATORIO LEGREAND - R$ 4335,00
		ThiagoEndereco end1 = new ThiagoEndereco("Rua dos Rem�dios", 100, "Centro", "Palho�a", "SC");
		ThiagoLaboratorio legrand = new ThiagoLaboratorio("Legrand", "12.345.678/0001-11", end1);
		ThiagoRemedio rosuvas = new ThiagoRemedio("Rosuvas", 55.00, legrand);
		ThiagoRemedio gliface = new ThiagoRemedio("Gliface", 35.00, legrand);
		ThiagoRemedio araDoisH = new ThiagoRemedio("Aradois H", 50.00, legrand);
		ThiagoRemedio trandilax = new ThiagoRemedio("Trandilax", 10.00, legrand);
		
		//LABORATORIO MEDLEY - R$ 325,00
		ThiagoEndereco end2 = new ThiagoEndereco(
				"RUA DA MEDICA��O", 200, "ESTREITO", "FLORIAN�POLIS", "SC");
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

		//QUEST�O 3
//		A-INFORMAR O NOME DO RESPONS�VEL PELO ESTOQUE;
		farmacia.identificarResponsavel();

//		B�CALCULAR O TOTAL (EM REAIS)DO ESTOQUE DE REM�DIOS;
		System.out.println("\nTotal em estoque:" + farmacia.totalEstoque());

//		C�DADO  O  NOME  DE  UM LABORAT�RIO,CALCULAR  O  TOTAL (EM  REAIS)DO  ESTOQUE  DE  
//		REM�DIOS  DESTE LABORAT�RIO.NESTE CASO SEMPRE SER� INFORMADO O NOME DO LABORAT�RIO 
//		COMO PAR�METRO;
		ThiagoLaboratorio lab = farmacia.acharLaboratorio("MEDLEY");

//		D�DADO  O  NOME  DE  UM LABORAT�RIO,BUSCARAS  INFORMA��ES  DESTE  LABORAT�RIO.
//		NESTE  CASO SEMPRE SER� INFORMADO O NOME DO LABORAT�RIO COMO PAR�METRO;
		System.out.println(
				"\nTotal estoque laboratorio " + lab.getNome() + ": " 
				+ farmacia.totalEstoquePorLaboratorio("MEDLEY"));

		
		
		System.out.println("\n" + lab);
		System.out.println(farmacia);
	}
}
