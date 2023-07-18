package tela;

import java.math.BigDecimal;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

import models.Moeda;

public class TelaPrincipal {

	public static void main(String[] args) {
		
		//Imagens para usar como icones
		ImageIcon iconAlura = new ImageIcon("src/imagem/A_do_alura.jpg");
		ImageIcon iconValorInput = new ImageIcon("src/imagem/input_valor.jpg");
		ImageIcon iconValorNumerio = new ImageIcon("src/imagem/valor_numerico.png");
		ImageIcon iconOpcaoConversao = new ImageIcon("src/imagem/bolsa_dinheiro.png");
		ImageIcon iconPergunta = new ImageIcon("src/imagem/pergunta.jpg");
		ImageIcon iconFinalizar = new ImageIcon("src/imagem/finalizado.png");
		ImageIcon iconConcluir = new ImageIcon("src/imagem/concluido.png");
		ImageIcon iconOpcaoTemperatura = new ImageIcon("src/imagem/opcao_temperatura.jpg");
		ImageIcon iconValorTemperatura = new ImageIcon("src/imagem/valor_temperatura.jpg");
		
		ButtonGroup buttonGroup = new ButtonGroup();
		JRadioButton opt1 = new javax.swing.JRadioButton("Celsius para Fahrenheit");
		JRadioButton opt2 = new javax.swing.JRadioButton("Fahrenheit para Celsius");
		opt1.setSelected(true);
		buttonGroup.add(opt1);
		buttonGroup.add(opt2);
		String mensagemOpcaoTemperatura = "Escolha uma opção";
		Object[] array = {mensagemOpcaoTemperatura, opt1, opt2};
		BigDecimal temperatura = new BigDecimal(0.0);	
		
		Moeda moeda = new Moeda();
		Integer escolha = 0;
		String inputValor = "";
		Double valorCotacao = 0.0;
		String[] menuOpcoes = {"Conversor de Moedas", "Conversor de Temperatura"};
		String[] tipoMoedas = {"De Reais a Dólares", "De Reais a Euro", "De Reais a Libras", "De Reais a Peso Argentino", "De Reais a Peso Chileno",
				"De dólares a Reias", "De Libras a Reais", "De Peso Argentino a Reais", "De Peso Chileno a Reais"};
		
		do {
			//Painel do menu com a opção de conversor
			String telaMenu = (String) JOptionPane.showInputDialog(null, "Escolha uma opção", "Menu Conversor",
					JOptionPane.QUESTION_MESSAGE, iconAlura, menuOpcoes, menuOpcoes[0]);
			
			//para sair do menu se clicar no x, e finalizar aplicação
			if(telaMenu == null) {
				System.exit(0);
				
				//Ignora caractere Camel Case
			} else if(telaMenu.equalsIgnoreCase("Conversor de Moedas")) {
				try {
					while(true) {
						//Painel do valor do input
						inputValor = (String) (JOptionPane.showInputDialog(null, "Insira um valor", "Valor da conversão",
								JOptionPane.QUESTION_MESSAGE, iconValorInput, null, null));
						if(inputValor == null) {
							System.exit(0);
						}
						try {
							//Convertendo para double
							valorCotacao = Double.parseDouble(inputValor);
							break;
							
						} catch(NumberFormatException e) {
							//Painel de valor inválido 
							JOptionPane.showMessageDialog(null, "Insira um valor numérico", "Mensagem Valor Inválido!", 
									JOptionPane.INFORMATION_MESSAGE, iconValorNumerio);
						}
					}
					
				} catch(Exception e) {
					return;
				}
				
			}
			
			switch(telaMenu) {
			case "Conversor de Moedas":
				String selecionaMoeda = (String) JOptionPane.showInputDialog(null, "Escolha a moeda que deseja converter", "Conversão de Moedas",
						JOptionPane.PLAIN_MESSAGE, iconOpcaoConversao, tipoMoedas, tipoMoedas[0]);
				
				if(selecionaMoeda == null) {
					System.exit(0);
				}
				
				switch(selecionaMoeda) {
				case "De Reais a Dólares":
					moeda.reaisParaDolar(valorCotacao);
					break;
				case "De Reais a Euro":
					moeda.reaisParaEuro(valorCotacao);
					break;
				case "De Reais a Libras":
					moeda.reaisParaLibra(valorCotacao);
					break;
				case "De Reais a Peso Argentino":
					moeda.reaisParaPesoArgentino(valorCotacao);
					break;
				case "De Reais a Peso Chileno":
					moeda.reaisParaPesoChileno(valorCotacao);
					break;
				case "De dólares a Reias":
					moeda.dolarParaReais(valorCotacao);
					break;
				case "De Libras a Reais":
					moeda.libraParaReais(valorCotacao);
					break;
				case "De Peso Argentino a Reais":
					moeda.pesoArgentinoParaReais(valorCotacao);
					break;
				case "De Peso Chileno a Reais":
					moeda.pesoChilenoParaReais(valorCotacao);
					break;
				}
				break;
				
			case "Conversor de Temperatura":
				int sel = JOptionPane.showConfirmDialog(null, array, "Opção da Conversão de Temperatura", JOptionPane.DEFAULT_OPTION,
						JOptionPane.QUESTION_MESSAGE, iconOpcaoTemperatura);
				
				try {
					while(true) {
						inputValor = (String) (JOptionPane.showInputDialog(null, "Insira uma temperatura", "Valor da Temperatura", 
								JOptionPane.QUESTION_MESSAGE, iconValorTemperatura, null, null));
						if(inputValor == null) {
							System.exit(0);
						}
						try {
							temperatura = BigDecimal.valueOf(Double.valueOf(inputValor));
						
						} catch (NumberFormatException e) {
							JOptionPane.showMessageDialog(null, "Insira um valor numérico", "Mensagem Valor Inválido!", 
									JOptionPane.INFORMATION_MESSAGE, iconValorNumerio);
						}
					}
				} catch(Exception e) {
					return;
				}
			} 
			
			//Validação se realmente o usuário deseja sair da aplicação ou continuar
			opt1.setSelected(true);
			escolha = JOptionPane.showConfirmDialog(null, "Deseja continuar?", "Pergunta ao Usuário",
					JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, iconPergunta);
			
		//Opção se vai sair da aplicação ou continuar.	
		} while(escolha == 0);
		if(escolha == 1) {
			JOptionPane.showMessageDialog(null, "Programa finalizado", "Mensagem ao Usuário",
					JOptionPane.INFORMATION_MESSAGE, iconFinalizar);
		
		} else if(escolha == 2) {
			JOptionPane.showMessageDialog(null, "Programa concluido", "Mensagem ao Usuário",
					JOptionPane.INFORMATION_MESSAGE, iconConcluir);
		}
	}		
}
