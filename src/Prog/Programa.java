package Prog;

import javax.swing.JOptionPane;

public class Programa {
	public static void main(String[]args) {
		
		opcao mn = new opcao();
		int op;
		
	do {
		String menu = JOptionPane.showInputDialog(null, "Escolha uma das op��es abaixo: \n1 - Calcular �rea do quadrado.\n"
				+ "2 - Calcular �rea do losango.\n3 - Convers�o de Celsius para Fahrenheit.\n4 - Verificar se um valor � positivo ou negativo.\n"
				+ "5 - Calcular m�dia do aluno.");
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
				 JOptionPane.showMessageDialog(null,"Op��o inv�lida");
			}
		
		}
		while(op!=6);	
	}

}
