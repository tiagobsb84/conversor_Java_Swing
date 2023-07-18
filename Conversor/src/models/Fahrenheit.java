package models;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Fahrenheit {
	
	private Double temperatura;
	
	public Double fahrenheitParaCelsius(Double d) {
		BigDecimal resultado = BigDecimal.valueOf((d - 32) * 5/9).setScale(2, RoundingMode.HALF_EVEN);
		return resultado.doubleValue();
	}

	public Double getFahrenheit() {
		this.temperatura = fahrenheitParaCelsius(temperatura);
		return temperatura;
	}

	public void setTemperatura(Double temperatura) {
		this.temperatura = temperatura;
	}

	@Override
	public String toString() {
		return "Fahrenheit [fahrenheit=" + temperatura + "]";
	}

}
