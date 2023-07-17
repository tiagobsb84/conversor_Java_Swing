package com.tiago.conversor.tela;

import javax.swing.JOptionPane;

public class TelaPrincipal {

	public static void main(String[] args) {
		
		Integer escolha = 0;
		String[] menuOpcoes = {"Conversor de Moedas", "Conversor de Temperatura"};
		
		do {
			//Painel do menu com a opção de conversor
			String telaMenu = (String) JOptionPane.showInputDialog(null, "Escolha uma opção", "Menu Conversor",
					JOptionPane.QUESTION_MESSAGE, null, menuOpcoes, menuOpcoes[0]);
			
			//para sair do menu se clicar no x
			if(telaMenu == null) {
				System.exit(0);
			}
		
		} while(escolha == 0);

	}		
}