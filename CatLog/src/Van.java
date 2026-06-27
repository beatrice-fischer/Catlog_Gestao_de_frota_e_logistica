
public class Van extends Veiculo implements Seguravel{
	//attributes
	protected boolean possuisolamentoTermico;

	//constructor (chama a classe super)
	public Van(String placa, String modelo, double capacidadeCargaMax, double quilometragem, double custoPorKm, boolean possuisolamentoTermico) {
		super(placa, modelo, capacidadeCargaMax, quilometragem, custoPorKm);
		this.possuisolamentoTermico = possuisolamentoTermico;
	}

	//methods
	@Override
	public double calcularCustoViagem(double distancia) {
		double custoViagem = distancia*custoPorKm;
		if (possuisolamentoTermico)
			custoViagem += 45.00;

		return custoViagem;
	}

	@Override
	public double calcularSeguro() {
		//1% da capacidade de carga máxima + R$150
		return (capacidadeCargaMax * 0.01) + 150;
	}

	//getters and setters
	public boolean isPossuisolamentoTermico() {
		return possuisolamentoTermico;
	}

	public void setPossuisolamentoTermico(boolean possuisolamentoTermico) {
		this.possuisolamentoTermico = possuisolamentoTermico;
	}
}
