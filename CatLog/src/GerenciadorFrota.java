import java.util.ArrayList;
import java.util.List;

public class GerenciadorFrota {
	//attributes
	List<Veiculo> veiculos = new ArrayList<Veiculo>();

	//methods
	public void adicionarVeiculo(Veiculo v) {
		veiculos.add(v);
	}

	public void exibirRelatorioViagem(double distancia) {
		for (Veiculo v : veiculos){
			System.out.println("---------------------------------");
			System.out.println("RELATÓRIO DE VIAGEM");
			System.out.println("Placa: " + v.getPlaca());
			System.out.println("Modelo: " + v.getModelo());
			System.out.println("Custo estimado: R$ " + v.calcularCustoViagem(distancia));
			System.out.println(" ");
		}
		System.out.println("---------------------------------");
		System.out.println(" ");
	}

	public void rodarRevisaoGeral() {
		for (Veiculo v : veiculos){
			if ( v instanceof Manutenivel) //se o veiculo implementa Manutenivel antes de chamar o metodo
				((Manutenivel) v).verificarManutencao();

		}
	}

	public void buscarPorPlaca(String placa){
		for (Veiculo v : veiculos){ //percorre com variável temporária "v"
			if (v.getPlaca().equalsIgnoreCase(placa))
				//verifica se a placa é igual à placa procurada (ignora diferenças de maiúscula e minúscula)
				System.out.println("Placa se encontra na frota.");

		}
		System.out.println("Placa NÃO se encontra na frota.");
	}

	void exibirRelatorioSeguros() {
		for (Veiculo v : veiculos) {
			if (v instanceof Seguravel) {
				Seguravel s = (Seguravel) v;
				System.out.println("Veículo " + v.getPlaca() + " (" + v.getModelo() + ") tem seguro estimado em: R$ " + s.calcularSeguro());
			}
		}
	}

	//getters and setters
	public List<Veiculo> getVeiculos() {
		return veiculos;
	}

	public void setVeiculos(List<Veiculo> veiculos) {
		this.veiculos = veiculos;
	}
}
