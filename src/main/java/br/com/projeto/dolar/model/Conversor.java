package br.com.projeto.dolar.model;

public class Conversor {
	
	private Double dolar;
	private Double cotacao;
	private Double resultado;
	
	public Double getDolar() {
		return dolar;
	}
	public void setDolar(Double dolar) {
		this.dolar = dolar;
	}
	public Double getCotacao() {
		return cotacao;
	}
	public void setCotacao(Double cotacao) {
		this.cotacao = cotacao;
	}
	public Double getResultado() {
		return resultado;
	}
	
	public void setResultado(Double resultado) {
		this.resultado = resultado;
	}
	@Override
	public String toString() {
		return "Conversor [dolar=" + dolar + ", cotacao=" + cotacao + ", resultado=" + resultado + "]";
	}

	
	

}
