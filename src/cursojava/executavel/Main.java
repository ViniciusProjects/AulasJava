package cursojava.executavel;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;

public class Main {

	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog("Nome do aluno");
		String idade = JOptionPane.showInputDialog("idade do aluno");
		String cpf = JOptionPane.showInputDialog("CPF do aluno");
		String nota1 = JOptionPane.showInputDialog("nota 1 do aluno");
		String nota2 = JOptionPane.showInputDialog("nota 2 do aluno");
		String nota3 = JOptionPane.showInputDialog("nota 3 do aluno");
		String nota4 = JOptionPane.showInputDialog("nota 4 do aluno");
		
		
	
		Aluno aluno1 = new Aluno();
		aluno1.setNome(nome);
		aluno1.setIdade(Integer.valueOf(idade));
		aluno1.setNumeroCpf(cpf);
		aluno1.setNota1(Double.parseDouble(nota1));
		aluno1.setNota1(Double.parseDouble(nota2));
		aluno1.setNota1(Double.parseDouble(nota3));
		aluno1.setNota1(Double.parseDouble(nota4));
		System.out.println(aluno1);
		System.out.println("Nome é: " + aluno1.getNome());
		System.out.println("Idade é: " + aluno1.getIdade());
		System.out.println("Média da nota é: " + aluno1.getMediaNota());
		System.out.println("Resultado = " + (aluno1.getAlunoAprovado() ? "Aprovado": "Reprovado"));
		
	}

} 
