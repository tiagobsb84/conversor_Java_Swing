package models;

import java.math.BigDecimal;
import java.math.RoundingMode;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Moeda {
	
	ImageIcon iconRealDolar = new ImageIcon("src/imagem/Real_Dolar.jpg");
	ImageIcon iconRealEuro = new ImageIcon("src/imagem/Real_Euro.jpg");
	ImageIcon iconRealLibras = new ImageIcon("src/imagem/Real_Libras.jpg");
	ImageIcon iconRealPesoArgentino = new ImageIcon("src/imagem/Real_Peso_Argentino.jpg");
	ImageIcon iconRealChileno = new ImageIcon("src/imagem/Real_Peso_Chileno.png");

	private BigDecimal dolar = BigDecimal.valueOf(4.82);
	private BigDecimal euro = BigDecimal.valueOf(5.42);
	private BigDecimal pesoArgentino = BigDecimal.valueOf(0.018);
	private BigDecimal pesoChileno = BigDecimal.valueOf(0.006);
	private BigDecimal libras = BigDecimal.valueOf(6.31);
	
	public void reaisParaDolar(Double d) {
		BigDecimal cota = BigDecimal.valueOf(d / dolar.doubleValue()).setScale(2, RoundingMode.HALF_EVEN);
		BigDecimal bd = BigDecimal.valueOf(d).setScale(2);
		JOptionPane.showMessageDialog(null, "A conversão de R$ " + bd + " reais\n deu US$ " + cota + " dólares",
				"Resultado da Conversão", JOptionPane.INFORMATION_MESSAGE, iconRealDolar);
	}
	
	public void reaisParaEuro(Double d) {
		BigDecimal cota = BigDecimal.valueOf(d / euro.doubleValue()).setScale(2, RoundingMode.HALF_EVEN);
		BigDecimal bd = BigDecimal.valueOf(d).setScale(2);
		JOptionPane.showMessageDialog(null, "A conversão de R$ " + bd + " reais\n deu € " + cota + " euros",
				"Resultado da Conversão", JOptionPane.INFORMATION_MESSAGE, iconRealEuro);
	}
	
	public void reaisParaPesoArgentino(Double d) {
		BigDecimal cota = BigDecimal.valueOf(d / pesoArgentino.doubleValue()).setScale(2, RoundingMode.HALF_EVEN);
		BigDecimal bd = BigDecimal.valueOf(d).setScale(2);
		JOptionPane.showMessageDialog(null, "A conversão de R$ " + bd + " reais\n deu $ " + cota + " peso argentino",
				"Resultado da Conversão", JOptionPane.INFORMATION_MESSAGE, iconRealPesoArgentino);
	}
	
	public void reaisParaPesoChileno(Double d) {
		BigDecimal cota = BigDecimal.valueOf(d / pesoChileno.doubleValue()).setScale(2, RoundingMode.HALF_EVEN);
		BigDecimal bd = BigDecimal.valueOf(d).setScale(2);
		JOptionPane.showMessageDialog(null, "A conversão de R$ " + bd + " reais\n deu $ " + cota + " peso chileno",
				"Resultado da Conversão", JOptionPane.INFORMATION_MESSAGE, iconRealChileno);
	}
	
	public void reaisParaLibra(Double d) {
		BigDecimal cota = BigDecimal.valueOf(d / libras.doubleValue()).setScale(2, RoundingMode.HALF_EVEN);
		BigDecimal bd = BigDecimal.valueOf(d).setScale(2);
		JOptionPane.showMessageDialog(null, "A conversão de R$ " + bd + " reais\n deu £ " + cota + " libras",
				"Resultado da Conversão", JOptionPane.INFORMATION_MESSAGE, iconRealLibras);
	}
	
	public void dolarParaReais(Double d) {
		BigDecimal cota = BigDecimal.valueOf(d * dolar.doubleValue()).setScale(2, RoundingMode.HALF_EVEN);
		BigDecimal bd = BigDecimal.valueOf(d).setScale(2);
		JOptionPane.showMessageDialog(null, "A conversão de US$ " + bd + " dólares\n deu R$ " + cota + " reais",
				"Resultado da Conversão", JOptionPane.INFORMATION_MESSAGE, iconRealDolar);
	}
	
	public void euroParaReais(Double d) {
		BigDecimal cota = BigDecimal.valueOf(d * euro.doubleValue()).setScale(2, RoundingMode.HALF_EVEN);
		BigDecimal bd = BigDecimal.valueOf(d).setScale(2);
		JOptionPane.showMessageDialog(null, "A conversão de € " + bd + " euros\n deu R$ " + cota + " reais",
				"Resultado da Conversão", JOptionPane.INFORMATION_MESSAGE, iconRealEuro);
	}
	
	public void pesoArgentinoParaReais(Double d) {
		BigDecimal cota = BigDecimal.valueOf(d * pesoArgentino.doubleValue()).setScale(2, RoundingMode.HALF_EVEN);
		BigDecimal bd = BigDecimal.valueOf(d).setScale(2);
		JOptionPane.showMessageDialog(null, "A conversão de $ " + bd + " peso argentino\n deu R$ " + cota + " reais",
				"Resultado da Conversão", JOptionPane.INFORMATION_MESSAGE, iconRealPesoArgentino);
	}
	
	public void pesoChilenoParaReais(Double d) {
		BigDecimal cota = BigDecimal.valueOf(d * pesoChileno.doubleValue()).setScale(2, RoundingMode.HALF_EVEN);
		BigDecimal bd = BigDecimal.valueOf(d).setScale(2);
		JOptionPane.showMessageDialog(null, "A conversão de $ " + bd + " peso chileno\n deu R$ " + cota + " reais",
				"Resultado da Conversão", JOptionPane.INFORMATION_MESSAGE, iconRealChileno);
	}
	
	public void libraParaReais(Double d) {
		BigDecimal cota = BigDecimal.valueOf(d * libras.doubleValue()).setScale(2, RoundingMode.HALF_EVEN);
		BigDecimal bd = BigDecimal.valueOf(d).setScale(2);
		JOptionPane.showMessageDialog(null, "A conversão de £ " + bd + " libras\n deu R$ " + cota + " reais",
				"Resultado da Conversão", JOptionPane.INFORMATION_MESSAGE, iconRealLibras);
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
