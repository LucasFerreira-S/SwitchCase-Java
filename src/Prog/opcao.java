package Prog;

import javax.swing.JOptionPane;

public class opcao {
	
	public void Op1() {
		int B = Integer.parseInt(JOptionPane.showInputDialog("Base:"));
		int A = Integer.parseInt(JOptionPane.showInputDialog("Altura:"));
	    int R = B + A;
		JOptionPane.showMessageDialog(null,"A �rea do quadrado �: "+(R));	
		
		}
	public void Op2() {
		
		int D = Integer.parseInt(JOptionPane.showInputDialog("Diagonal Maior:"));
		int d = Integer.parseInt(JOptionPane.showInputDialog("Diagonal Menor:"));
	    int R = (D*d)/2;
	    JOptionPane.showMessageDialog(null,"A �rea do losango �: "+(R));	
	
		}
	public void Op3() {
			
		int C = Integer.parseInt(JOptionPane.showInputDialog(" Graus Celsius:"));
	    int R =  (int) (C * 1.8 + 32);
	    JOptionPane.showMessageDialog(null,"A convers�o de Celsius para Fahrenheit �: "+R+"�");	
		
		}
	public void Op4() {
		
			int V = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor"));
			
			if(V==0) {
				 JOptionPane.showMessageDialog(null,"Valor "+V+" � igual a zero.");	
			}else if(V>0){
				 JOptionPane.showMessageDialog(null,"Valor "+V+" � positivo.");	
				
			}else {
				 JOptionPane.showMessageDialog(null,"Valor "+V+" � negativo.");	
	
			}
	  
		}
	public void Op5() {
		String nome = JOptionPane.showInputDialog("Nome do Aluno:");
		int N1 = Integer.parseInt(JOptionPane.showInputDialog("Primeira Nota:"));
		int N2 = Integer.parseInt(JOptionPane.showInputDialog("Segunda Nota:"));
		int N3 = Integer.parseInt(JOptionPane.showInputDialog("Terceira Nota:"));
	    int R =(N1+N2+N3)/3;
	    
	    if(R>=5) {
		    JOptionPane.showMessageDialog(null,"O aluno "+nome+" foi aprovado com a m�dia: "+R);	
	    }else {
	    	 JOptionPane.showMessageDialog(null,"O aluno "+nome+" foi reprovado com a m�dia: "+R);	
	    }
		}
}
