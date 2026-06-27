
public class Main {

	public static void main(String[] args) {
		GerenciadorFrota frota = new GerenciadorFrota();

		Caminhao c1 = new Caminhao("ABC-1234", "Volvo FH", 15000, 60000, 7.50, 6);
		Caminhao c2 = new Caminhao("DEF-5678", "Scania R", 20000, 30000, 8.00, 4);
		Caminhao c3 = new Caminhao("MNO-1249", "Mercedes Actros", 35000, 75000, 6.50, 6);

		Van v1 = new Van("GHI-9012", "Fiat Ducato", 1500, 20000, 6.00, true);
		Van v2 = new Van("JKL-3456", "Mercedes Sprinter", 2000, 10000, 6.50, false);
		Van v3 = new Van("PQR-7890", "Renault Master", 1800, 45000, 6.20, true);

		frota.adicionarVeiculo(c1);
		frota.adicionarVeiculo(c2);
		frota.adicionarVeiculo(c3);

		frota.adicionarVeiculo(v1);
		frota.adicionarVeiculo(v2);
		frota.adicionarVeiculo(v3);

		frota.exibirRelatorioViagem(500);

		frota.rodarRevisaoGeral();
		System.out.println("---------------------------------");

		frota.exibirRelatorioSeguros();
		System.out.println("---------------------------------");

		frota.buscarPorPlaca("ghi-9010");
	}

}
