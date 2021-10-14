package Prog;

import javax.swing.JOptionPane;

public class Programa {
	public static void main(String[]args) {
		
		opcao mn = new opcao();
		int op;
		
	do {
		String menu = JOptionPane.showInputDialog(null, "Escolha uma das opções abaixo: \n1 - Calcular Área do quadrado.\n"
				+ "2 - Calcular Área do losango.\n3 - Conversão de Celsius para Fahrenheit.\n4 - Verificar se um valor é positivo ou negativo.\n"
				+ "5 - Calcular média do aluno.");
		op= Integer.parseInt(menu);
			
		switch(op) {
			
			case 1:
				mn.Op1();		
			break;
			case 2:
				mn.Op2();
			break;
			case 3:
				mn.Op3();
			break;
			case 4:
				mn.Op4();
			break;
			case 5:
				mn.Op5();
			break;
			 default:
				 JOptionPane.showMessageDialog(null,"Opção inválida");
			}
		
		}
		while(op!=6);	
	}

}
