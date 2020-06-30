package cursojava.arrays;

import javax.swing.JOptionPane;

public class ArrayVetor {

	public static void main(String[] args) {
		;
		String posicoes = JOptionPane.showInputDialog("quantas posições o array deve ter?");
		double[] notas = new double[Integer.parseInt(posicoes)];
		
		for (int i = 0; i < notas.length; i++) {
			String valor = JOptionPane.showInputDialog("qual o valor da posição = " + i);
			notas[i] = Double.valueOf(valor);
		}
		for (int i = 0; i < notas.length; i++) {
			System.out.println("Nota:" + (i + 1) + " é = " + notas[i]);

		}

	}

}
