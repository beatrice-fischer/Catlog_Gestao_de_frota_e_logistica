
public class Caminhao extends Veiculo implements Manutenivel, Seguravel{
	//attributes
	protected int quantidadeEixos;

	//constructor (chama a classe super)
	public Caminhao(String placa, String modelo, double capacidadeCargaMax, double quilometragem, double custoPorKm, int quantidadeEixos) {
		super(placa, modelo, capacidadeCargaMax, quilometragem, custoPorKm);
		this.quantidadeEixos = quantidadeEixos;
	}

	//methods
	@Override
	public double calcularCustoViagem(double distancia) {
		double custoViagem = (distancia*custoPorKm) + (10*quantidadeEixos);
		return custoViagem;
	}

	@Override
	public void verificarManutencao() {
		if (quilometragem > 50000) 
			System.out.println("Veículo " + getPlaca() + " (" + getModelo() + ") PRECISA de manutenção!");
		else
			System.out.println("Veículo " + getPlaca() + " (" + getModelo() + ") NÃO precisa de manutenção.");
	}

	@Override
	public double calcularSeguro() {
		//2% da capacidade de carga máxima + R$50 por eixo
		return (capacidadeCargaMax * 0.02) + (50 * quantidadeEixos);
	}

	//getters and setters
	public int getQuantidadeEixos() {
		return quantidadeEixos;
	}

	public void setQuantidadeEixos(int quantidadeEixos) {
		this.quantidadeEixos = quantidadeEixos;
	}
}
