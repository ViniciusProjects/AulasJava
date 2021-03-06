package cursojava.executavel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Diretor;
import cursojava.classes.Disciplina;
import cursojava.classes.Pessoa;
import cursojava.classes.Secretario;
import cursojava.classesauxiliares.FuncaoAutenticacao;
import cursojava.constantes.StatusAluno;
import cursojava.interfaces.PermitirAcesso;

public class Executavel {

	public static void main(String[] args) {
		try {
			String login = JOptionPane.showInputDialog("Informe o login:");
			String senha = JOptionPane.showInputDialog("Informe a senha:");

			if (new FuncaoAutenticacao(new Diretor(login, senha)).autenticar()) {
				List<Aluno> alunos = new ArrayList<Aluno>();

				HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();

				for (int qtd = 1; qtd <= 2; qtd++) {

					String nome = JOptionPane.showInputDialog("Nome do aluno " + qtd + " ?");
//					String idade = JOptionPane.showInputDialog("idade do aluno");
//					String cpf = JOptionPane.showInputDialog("CPF do aluno");

					Aluno aluno1 = new Aluno();

					aluno1.setNome(nome);
//					aluno1.setIdade(Integer.valueOf(idade));
//					aluno1.setNumeroCpf(cpf);

					for (int idisc = 1; idisc <= 1; idisc++) {
						String nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina " + idisc);
						String notaDisciplina = JOptionPane.showInputDialog("Nota da disciplina " + idisc);

						Disciplina disciplina = new Disciplina();
						disciplina.setDisciplina(nomeDisciplina);
						//disciplina.setNota(Double.valueOf(notaDisciplina));

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
				maps.put(StatusAluno.APROVADO, new ArrayList<Aluno>());
				maps.put(StatusAluno.RECUPERACAO, new ArrayList<Aluno>());
				maps.put(StatusAluno.REPROVADO, new ArrayList<Aluno>());

				for (Aluno aluno : alunos) {

					if (aluno.getAlunoResultado().equalsIgnoreCase(StatusAluno.APROVADO)) {
						maps.get(StatusAluno.APROVADO).add(aluno);

					} else if (aluno.getAlunoResultado().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
						maps.get(StatusAluno.RECUPERACAO).add(aluno);
					} else {
						maps.get(StatusAluno.REPROVADO).add(aluno);
					}
				}
				System.out.println("-------Lista aprovados-------");
				for (Aluno aluno : maps.get(StatusAluno.APROVADO)) {
					System.out.println("Aluno: " + aluno.getNome() + " Resultado= " + " " + aluno.getAlunoResultado()
							+ " com médias de = " + aluno.getMediaNota());
				}
				System.out.println("-------Lista Recuperação-------");
				for (Aluno aluno : maps.get(StatusAluno.RECUPERACAO)) {
					System.out.println("Aluno: " + aluno.getNome() + " Resultado= " + " " + aluno.getAlunoResultado()
							+ "com médias de = " + aluno.getMediaNota());
				}
				System.out.println("-------Lista Reprovados-------");
				for (Aluno aluno : maps.get(StatusAluno.REPROVADO)) {
					System.out.println("Aluno: " + aluno.getNome() + " Resultado= " + " " + aluno.getAlunoResultado()
							+ " com médias de = " + aluno.getMediaNota());
				}

			} else {
				JOptionPane.showMessageDialog(null, "Acesso negado");
			}

		} catch (Exception e) {
			StringBuilder saida = new StringBuilder();

			e.printStackTrace(); // Imprime erro no console no java
			System.out.println("Mensagem: " + e.getMessage()); // mensagem de erro ou causa

			for (int pos = 0; pos < e.getStackTrace().length; pos++) {
				saida.append("\n Classe de erro : " + e.getStackTrace()[pos].getClassName());
				saida.append("\n Método de erro : " + e.getStackTrace()[pos].getMethodName());
				saida.append("\n linha de erro : " + e.getStackTrace()[pos].getLineNumber());
				saida.append("\n log : " + e.getStackTrace()[pos].getClass().getName());
			}
			e.getStackTrace();

			JOptionPane.showMessageDialog(null, "Erro ao processar notas" + saida.toString());
		}
	}

}
