package tela;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class TelaPrincipal {

	public static void main(String[] args) {
		
		//Imagens para usar como icones
		ImageIcon iconAlura = new ImageIcon("src/imagem/A_do_alura.jpg");
		ImageIcon iconValorInput = new ImageIcon("src/imagem/input_valor.jpg");
		
		String[] menuOpcoes = {"Conversor de Moedas", "Conversor de Temperatura"};
		Integer escolha = 0;
		String inputValor = "";
		
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
						inputValor = (String) (JOptionPane.showInputDialog(null, "Insira um valor", "Valor da conversão",
								JOptionPane.QUESTION_MESSAGE,iconValorInput, null, null));
						if(inputValor == null) {
							System.exit(0);
						}
					}
					
				} catch(Exception e) {
					return;
				}
				
			}
		
		} while(escolha == 0);

	}		
}
