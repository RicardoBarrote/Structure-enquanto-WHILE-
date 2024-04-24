package ExercicioSistemaCartesiano;

import java.util.Locale;
import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {

		/*
		 * Escreva um programa para ler as coordenadas (X,Y) de uma quantidade
		 * indeterminada de pontos no sistema cartesiano. Para cada ponto escrever o
		 * quadrante a que ele pertence. O algoritmo será encerrado
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe as coordenadas de um plano cartesiano. (x/y)");
		System.out.print("Coordenada X: ");
		int x = sc.nextInt();
		System.out.print("Coordenada Y: ");
		int y = sc.nextInt();

		while (x != 0 && y != 0) {
			if (x > 0 && y > 0) {
				System.out.println("Primeiro lado.");
			}
			else if (x < 0 && y > 0) {
				System.out.println("Segundo lado.");
			}
			else if (x < 0 && y < 0) {
				System.out.println("Terceiro lado.");
			} 
			else {
				System.out.println("Quarto lado.");
			}
			
			System.out.println();
			System.out.print("Coordenada X: ");
			x = sc.nextInt();
			System.out.print("Coordenada Y: ");
			y = sc.nextInt();
			
		}
		System.out.println("Erro: um dos lados teve o valor zero.");

		sc.close();
	}

}
