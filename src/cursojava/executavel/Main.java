package cursojava.executavel;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class Main {

	public static void main(String[] args) {

		List<Aluno> alunos = new ArrayList<Aluno>();

		for (int qtd = 1; qtd <= 2; qtd++) {

			String nome = JOptionPane.showInputDialog("Nome do aluno " + qtd + " ?");
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
			if (escolha == 0) { // opção sim é zero
				int continuarRemover = 0;
				int posicao = 1;
				while (continuarRemover == 0) {
					String disciplinaRemover = JOptionPane.showInputDialog("Qual disciplina 1, 2, 3, 4 ? ");
					aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - posicao);
					posicao++;
					continuarRemover = JOptionPane.showConfirmDialog(null, "Continuar a remover?");

				}
			}
			alunos.add(aluno1);
		}
		for (Aluno aluno : alunos) {
			if (aluno.getNome().equalsIgnoreCase("Vinicius")) { //procurando aluno e calculando média
				System.out.println(aluno);
				System.out.println("Nome: " + aluno.getNome());
				System.out.println("Idade: " + aluno.getIdade());
				System.out.println("CPF: " + aluno.getNumeroCpf());
				System.out.println("Média da nota: " + aluno.getMediaNota());
				System.out.println("Disciplinas listadas: " + aluno.getDisciplinas().size());
				System.out.println("Nome das disciplinas listadas: " + aluno.getDisciplinas());
				//System.out.println("Resultado: " + (aluno.getAlunoAprovado() ? "Aprovado" : "Reprovado"));
				System.out.println("Resultado final: " + aluno.getAlunoAprovado2());
				System.out.println("----------------------------------------------------------------------------");
				break;
			}
		}

	}
}
