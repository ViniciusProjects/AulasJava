package cursojava.executavel;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;
import cursojava.constantes.StatusAluno;

public class Executavel {

	public static void main(String[] args) {

		List<Aluno> alunos = new ArrayList<Aluno>();
		List<Aluno> alunosAprovados = new ArrayList<Aluno>();
		List<Aluno> alunosRecuperacao = new ArrayList<Aluno>();
		List<Aluno> alunosReprovados = new ArrayList<Aluno>();

		for (int qtd = 1; qtd <= 2; qtd++) {

			String nome = JOptionPane.showInputDialog("Nome do aluno " + qtd + " ?");
			String idade = JOptionPane.showInputDialog("idade do aluno");
			String cpf = JOptionPane.showInputDialog("CPF do aluno");

			Aluno aluno1 = new Aluno();

			aluno1.setNome(nome);
			aluno1.setIdade(Integer.valueOf(idade));
			aluno1.setNumeroCpf(cpf);

			for (int idisc = 1; idisc <= 4; idisc++) {
				String nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina " + idisc);
				String notaDisciplina = JOptionPane.showInputDialog("Nota da disciplina " + idisc);

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

			if (aluno.getAlunoResultado().equalsIgnoreCase(StatusAluno.APROVADO)) {
				alunosAprovados.add(aluno);

			} else if (aluno.getAlunoResultado().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
				alunosRecuperacao.add(aluno);
			} else {
				alunosReprovados.add(aluno);
			}
		}
		System.out.println("-------Lista aprovados-------");
		for (Aluno aluno : alunosAprovados) {
			System.out.println("Resultado = " + alunosAprovados + "com médias de = " + aluno.getMediaNota());
		}
		System.out.println("-------Lista Recuperação-------");
		for (Aluno aluno : alunosRecuperacao) {
			System.out.println("Resultado = " + alunosRecuperacao + "com médias de = " + aluno.getMediaNota());
		}
		System.out.println("-------Lista Reprovados-------");
		for (Aluno aluno : alunosReprovados) {
			System.out.println("Resultado = " + alunosReprovados + "com médias de = " + aluno.getMediaNota());

		}
	}

}
