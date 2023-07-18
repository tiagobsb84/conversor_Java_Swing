package models;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Celsius {

	private Double temperatura;
	
	public Double celsiusParaFahrenheit(Double d) {
		BigDecimal resultado = new BigDecimal((d * 9/5) + 32).setScale(2, RoundingMode.HALF_EVEN);
		return resultado.doubleValue();
	}
	
	public Double getTemperatura() {
		this.temperatura = celsiusParaFahrenheit(temperatura);
		return temperatura;
	}

	public void setTemperatura(Double temperatura) {
		this.temperatura = temperatura;
	}

	@Override
	public String toString() {
		return "Celsius [temperatura=" + temperatura + "]";
	}
	
	
}
