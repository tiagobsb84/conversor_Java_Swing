package models;

import java.math.BigDecimal;
import java.math.RoundingMode;

import javax.swing.JOptionPane;

public class Moeda {

	private BigDecimal dolar = BigDecimal.valueOf(4.82);
	private BigDecimal euro = BigDecimal.valueOf(5.42);
	private BigDecimal pesoArgentino = BigDecimal.valueOf(0.018);
	private BigDecimal pesoChileno = BigDecimal.valueOf(0,006);
	private BigDecimal libras = BigDecimal.valueOf(6,31);
	
	public void reaisParaDolar(Double d) {
		BigDecimal cota = BigDecimal.valueOf(d / dolar.doubleValue()).setScale(2, RoundingMode.HALF_EVEN);
		BigDecimal bd = BigDecimal.valueOf(d).setScale(2);
		JOptionPane.showMessageDialog(null, "A conversão de R$ " + bd + "\n deu US$ " + cota + "Dólares",
				"Mensagem ao Usuário", JOptionPane.INFORMATION_MESSAGE);
	}
	
	public void reaisParaEuro(Double d) {
		BigDecimal cota = BigDecimal.valueOf(d / dolar.doubleValue()).setScale(2, RoundingMode.HALF_EVEN);
		BigDecimal bd = BigDecimal.valueOf(d).setScale(2);
		JOptionPane.showMessageDialog(null, "A conversão de R$ " + bd + "\n deu € " + cota + "Euros",
				"Mensagem ao Usuário", JOptionPane.INFORMATION_MESSAGE);
	}

	public BigDecimal getDolar() {
		return dolar;
	}

	public BigDecimal getEuro() {
		return euro;
	}

	public BigDecimal getPesoArgentino() {
		return pesoArgentino;
	}

	public BigDecimal getPesoChileno() {
		return pesoChileno;
	}

	public BigDecimal getLibras() {
		return libras;
	}
	
	@Override
	public String toString() {
		return "Moeda [euro=" + euro + ", dolar=" + dolar + ", peso Argentino=" + pesoArgentino + "peso Chileno=" + pesoChileno + "Libras=" + libras + "]";
	}
}
