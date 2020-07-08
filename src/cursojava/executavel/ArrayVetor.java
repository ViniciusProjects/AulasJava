package cursojava.executavel;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class ArrayVetor {

	public static void main(String[] args) {

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

		System.out.println("Nome do aluno: " + aluno.getNome());
		System.out.println();
		System.out.println("-----------Disciplinas do aluno--------");

		for (Disciplina disc : aluno.getDisciplinas()) {
			System.out.println();
			System.out.println("Disciplina: " + disc.getDisciplina());
			System.out.println();
			double maiorNota = 0.0;
			for (int i = 0; i < disc.getNota().length; i++) {
				System.out.println("Nota " + i + " é igual = " + disc.getNota()[i]);
				if (i == 0) {
					maiorNota = disc.getNota()[i];
					
				} else {
					if (disc.getNota()[i] > maiorNota) {
						maiorNota = disc.getNota()[i];
					}
				}
			}
			System.out.println("A maior nota da disciplina de: " + disc.getDisciplina() + " foi de: " + maiorNota);;
		}
		
	}
}