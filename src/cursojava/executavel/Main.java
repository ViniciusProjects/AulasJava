package cursojava.executavel;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class Main {

	public static void main(String[] args) {

		String nome = JOptionPane.showInputDialog("Nome do aluno");
		String idade = JOptionPane.showInputDialog("idade do aluno");
		String cpf = JOptionPane.showInputDialog("CPF do aluno");

		Aluno aluno1 = new Aluno();

		aluno1.setNome(nome);
		aluno1.setIdade(Integer.valueOf(idade));
		aluno1.setNumeroCpf(cpf);

		for (int i = 1; i <= 4; i++) {
			String nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina " + i);
			String notaDisciplina = JOptionPane.showInputDialog("Nota da disciplina " + i);

			Disciplina disciplina = new Disciplina();
			disciplina.setDisciplina(nomeDisciplina);
			disciplina.setNota(Double.valueOf(notaDisciplina));

			aluno1.getDisciplinas().add(disciplina);
		}

		int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina? ");
		if (escolha == 0) {
			String disciplinaRemover = JOptionPane.showInputDialog("Qual disciplina 1, 2, 3, 4 ? ");
			aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - 1);

		}

		System.out.println(aluno1);
		System.out.println("Nome: " + aluno1.getNome());
		System.out.println("Idade: " + aluno1.getIdade());
		System.out.println("CPF: " + aluno1.getNumeroCpf());
		System.out.println("Média da nota: " + aluno1.getMediaNota());
		System.out.println("Disciplinas listadas: " + aluno1.getDisciplinas().size());
		System.out.println("Nome das disciplinas listadas: " + aluno1.getDisciplinas());
		System.out.println("Resultado: " + (aluno1.getAlunoAprovado() ? "Aprovado" : "Reprovado"));
		System.out.println("Resultado final: " + aluno1.getAlunoAprovado2());

		Aluno a2 = new Aluno();
		String cpfAluno2 = JOptionPane.showInputDialog("Digite seu cpf");
		a2.setNumeroCpf(cpfAluno2);

		if (aluno1.equals(a2)) {
			System.out.println("CPF pertence a outro aluno");

		}

	}

}
