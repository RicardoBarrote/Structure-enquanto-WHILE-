package Exercicio_Senha;

import java.util.Locale;
import java.util.Scanner;

public class Atividade_1 {

	public static void main(String[] args) {

		/*
		 * Escreva um programa que repita a leitura de uma senha até que ela seja
		 * válida. Para cada leitura de senha incorreta informada, escrever a mensagem
		 * "Senha Invalida". Quando a senha for informada corretamente deve ser impressa
		 * a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha
		 * correta é o valor 2002.
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe os dados para criação de login. ");
		System.out.print("Usuário: ");
		String usuario = sc.next();
		System.out.println("Apenas números inteiros para criação de senha.");
		System.out.print("Senha: ");
		int senha = sc.nextInt();

		System.out.print("Deseja salvar os dados de usuário ? (s/n)");
		char salvar = sc.next().charAt(0);

		while (salvar != 's') {
			System.out.println();
			System.out.println("Insira os dados novamente. ");
			System.out.print("Usuário: ");
			usuario = sc.next();
			System.out.println("Apenas números inteiros para criação de senha.");
			System.out.print("Senha: ");
			senha = sc.nextInt();

			System.out.print("Deseja salvar os dados de usuário ? (s/n)");
			salvar = sc.next().charAt(0);
		}

		System.out.println();
		System.out.println("Dados de login: " + usuario + ", " + senha);

		System.out.println("DADOS SALVOS.");
		System.out.println();
		System.out.println("Insira os dados para efetuar login.");
		System.out.print("Usuário: ");
		String usuarioLogin = sc.next();
		System.out.print("Senha: ");
		int senhaLogin = sc.nextInt();

		while (senhaLogin != senha) {
			System.out.println("Acesso inválido, senha incorreto. ");
			System.out.println();
			System.out.print("Usuário: ");
			usuarioLogin = sc.next();
			System.out.print("Senha: ");
			senhaLogin = sc.nextInt();
		}
		System.out.println(usuarioLogin + ", Acesso permitido.");

		sc.close();

	}

}
