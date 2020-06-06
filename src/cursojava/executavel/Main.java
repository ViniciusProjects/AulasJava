package cursojava.executavel;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;
//import cursojava.classes.Disciplina;

public class Main {

	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog("Nome do aluno");
		String idade = JOptionPane.showInputDialog("idade do aluno");
		String cpf = JOptionPane.showInputDialog("CPF do aluno");


		Aluno aluno1 = new Aluno();

		aluno1.setNome(nome);
		aluno1.setIdade(Integer.valueOf(idade));
		aluno1.setNumeroCpf(cpf);

		Disciplina disciplina1 = new Disciplina();
		disciplina1.setDisciplina("Banco de dados"); 
		disciplina1.setNota(9);
		aluno1.getDisciplinas().add(disciplina1); 
		
		Disciplina disciplina2 = new Disciplina();
		disciplina2.setDisciplina("Java");
		disciplina2.setNota(10);
		aluno1.getDisciplinas().add(disciplina2);
		
		Disciplina disciplina3 = new Disciplina();
		disciplina3.setDisciplina("UML");
		disciplina3.setNota(9);
		aluno1.getDisciplinas().add(disciplina3);
		
		Disciplina disciplina4 = new Disciplina();
		disciplina4.setDisciplina("VUE");
		disciplina4.setNota(9);
		aluno1.getDisciplinas().add(disciplina4);
		
		
		 
		
		
		
		
		
		System.out.println(aluno1);
		System.out.println("Nome é: " + aluno1.getNome());
		System.out.println("Idade é: " + aluno1.getIdade());
		System.out.println("CPF do aluno é" + aluno1.getNumeroCpf());
		System.out.println("Média da nota é: " + aluno1.getMediaNota());
		System.out.println("Resultado = " + (aluno1.getAlunoAprovado() ? "Aprovado" : "Reprovado"));
		
		

		Aluno a2 = new Aluno();
		String cpfAluno2 = JOptionPane.showInputDialog("Digite seu cpf");
		a2.setNumeroCpf(cpfAluno2);

		if (aluno1.equals(a2)) {
			System.out.println("Alunos são iguais");
		} else {
			System.out.println("Alunos não são iguais");

		}

	}

}
