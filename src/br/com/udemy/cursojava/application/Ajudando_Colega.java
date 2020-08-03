package br.com.udemy.cursojava.application;

import java.util.Scanner;

public class Ajudando_Colega { //programinha que um aluno de um curso queria fazer, fiz e ensinei.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcaoInicial = 0; // vamos reutilizar essa variavel, iniciamos ela com 0

		boolean status = true; // sendo true o programa vai entrar
		while (status) {

			System.out.println("-------MENU----------");
			System.out.println("1 - Qual sua faixa de idade:");
			System.out.println("2 - Qual seu convênio:");
			System.out.println();
			System.out.println("Digite:");

			opcaoInicial = sc.nextInt(); // aqui vai entrar 1 ou 2 (ou até 3 + enter e 3 novamente)
			if (opcaoInicial == 1) {
				System.out.println("Agora precisamos saber a idade:");
				int idadeUsuario = sc.nextInt();
				if (idadeUsuario <= 30) {
					System.out.println("a. Até 30 Anos");
					System.out.println();
				} else if (idadeUsuario >= 30 && idadeUsuario <= 50) {
					System.out.println("b. De 30 a 50 anos");
					System.out.println();
				} else if (idadeUsuario >= 50 && idadeUsuario <= 65) {
					System.out.println("c. De 50 a 65 anos");
					System.out.println();
				} else if (idadeUsuario > 65) {
					System.out.println("d. Acima de 65 anos");
					System.out.println();
				}
				System.out.println("Usuario tem: " + idadeUsuario);

			}
			if (opcaoInicial == 2) {
				System.out.println("Qual o nome do seu convenio?");
				String convenioUsuario = sc.next();
				if (convenioUsuario.equalsIgnoreCase("INSS")) {
					System.out.println("a. INSS");
				} else if (convenioUsuario.equalsIgnoreCase("SIAPE")) {
					System.out.println("b. SIAPE");
				} else if (convenioUsuario.equalsIgnoreCase("Forças Armadas")) {
					System.out.println("c. Forças Armadas");
				} else if (convenioUsuario.equalsIgnoreCase("Outros")) {
					System.out.println("Outros");
				}
				System.out.println("Usuario tem o convenio:" + convenioUsuario);

			}
			System.out.println("Programa pode ser fechado? digite 3");
			System.out.println();
			System.out.println("Digite:");
			int close = sc.nextInt();
			if (close == 3) {
				status = false;
			}

		}
		sc.close();
	}
}
