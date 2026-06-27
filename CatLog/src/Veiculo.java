
public abstract class Veiculo {
	//attributes
	protected String placa;
	protected String modelo;
	protected double capacidadeCargaMax;
	protected double quilometragem;
	protected double custoPorKm;
	
	//complete constructor (tem todos os atributos)
	public Veiculo(String placa, String modelo, double capacidadeCargaMax, double quilometragem, double custoPorKm){
		this.placa = placa;
		this.modelo = modelo;
		this.capacidadeCargaMax = capacidadeCargaMax;
		this.quilometragem = quilometragem;
		this.custoPorKm = custoPorKm;
	}
	
	//methods
	public abstract double calcularCustoViagem(double distancia);

	//getters and setters
	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getCapacidadeCargaMax() {
		return capacidadeCargaMax;
	}

	public void setCapacidadeCargaMax(double capacidadeCargaMax) {
		if (capacidadeCargaMax > 50000)
			throw new IllegalArgumentException("Erro: carga não pode ser maior do que 50.000 Kg.");

		this.capacidadeCargaMax = capacidadeCargaMax;
	}

	public double getQuilometragem() {
		return quilometragem;
	}

	public void setQuilometragem(double quilometragem) {
		if (quilometragem < 0)
			throw new IllegalArgumentException("Erro: quilometragem não pode ser negativa!");

		this.quilometragem = quilometragem;
	}

	public double getCustoPorKm() {
		return custoPorKm;
	}

	public void setCustoPorKm(double custoPorKm) {
		this.custoPorKm = custoPorKm;
	}
}
