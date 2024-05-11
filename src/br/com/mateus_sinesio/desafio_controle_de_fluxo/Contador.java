package br.com.mateus_sinesio.desafio_controle_de_fluxo;

import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro: ");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro: ");
		int parametroDois = terminal.nextInt();

		try {
			if (parametroUm > parametroDois) {
				throw new ParametrosInvalidosException();
			}
			contar(parametroUm, parametroDois);
		} catch (ParametrosInvalidosException e) {
			System.out.println("Parâmetro inválido. O primeiro parâmetro deve ser menor que o segundo.");
		}
	}

	static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
		int contagem = parametroDois - parametroUm;

		for (int i = 1; i <= contagem; i++) {
			System.out.println("Imprimindo o número: " + i);
		}
	}
}
