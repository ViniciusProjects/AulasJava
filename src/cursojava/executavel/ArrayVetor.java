package cursojava.executavel;

import java.util.Scanner;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class ArrayVetor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Aluno aluno = new Aluno();
		aluno.setNome("Vinicius");
		aluno.setIdade(18);

		Disciplina disciplina = new Disciplina();
		disciplina.setDisciplina("Java");
		double[] notasJava = { 8.8, 9.7, 7.6, 6.8 };
		disciplina.setNota(notasJava);

		aluno.getDisciplinas().add(disciplina);

		Disciplina disciplina2 = new Disciplina();
		disciplina2.setDisciplina("Logica de programação");
		double[] notasLogica = { 7.1, 9.7, 7.6, 5.0 };
		disciplina2.setNota(notasLogica);

		aluno.getDisciplinas().add(disciplina2);

		// ------------------------------------------------------------------------------------

		Aluno[] arrayAlunos = new Aluno[1];

		arrayAlunos[0] = aluno;
		for (int i = 0; i < arrayAlunos.length; i++) {

			System.out.println("Nome do aluno: " + arrayAlunos[i].getNome());

			for (Disciplina d : arrayAlunos[i].getDisciplinas()) {
				System.out.println("Nome da disciplina:" + d.getDisciplina());

				for (int notas = 0; notas < d.getNota().length; notas++) {
					System.out.println("Notas:" + d.getNota()[notas]);
				}
			}
		}
		sc.close();
	}
}