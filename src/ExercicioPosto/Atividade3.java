package ExercicioPosto;

import java.util.Locale;
import java.util.Scanner;

public class Atividade3 {

	public static void main(String[] args) {

		/*
		 * Um Posto de combustíveis deseja determinar qual de seus produtos tem a
		 * preferência de seus clientes. Escreva um algoritmo para ler o tipo de
		 * combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina
		 * 3.Diesel 4.Fim). Caso o usuário informe um código inválido (fora da faixa de
		 * 1 a 4) deve ser solicitado um novo código (até que seja válido). O programa
		 * será encerrado quando o código informado for o número 4. Deve ser escrito a
		 * mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada
		 * tipo de combustível, conforme exemplo.
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int escolhaAlcool = 0;
		int escolhaGasolina = 0;
		int escolhaDiesel = 0;

		System.out.println("Pesquisa de satisfação, informe qual combustível e de sua preferência. ");
		System.out.println("Álcool [1], Gasolina [2], Diesel [3], Encerrar pesquisa [4]. ");
		int escolha = sc.nextInt();

		while (escolha != 4) {
			if (escolha == 1) {
				escolhaAlcool++;
			} 
			else if (escolha == 2) {
				escolhaGasolina++;
			}
			else if (escolha == 3) {
				escolhaDiesel++;
			}
			else {
				System.out.println("Opções válida somente de [1], [2], [3], [4].");
			}

			System.out.println();
			System.out.println("Pesquisa de satisfação, informe qual combustível e de sua preferência. ");
			System.out.println("Álcool [1], Gasolina [2], Diesel [3], Encerrar pesquisa [4]. ");
			escolha = sc.nextInt();

		}
		
		System.out.println("Muito obrigado.");
		System.out.println();
		System.out.println("Resultado da pesquisa: ");
		System.out.println("Álcool: " + escolhaAlcool);
		System.out.println("Gasolina: " + escolhaGasolina);
		System.out.println("Diesel: " + escolhaDiesel);

		sc.close();
	}

}
