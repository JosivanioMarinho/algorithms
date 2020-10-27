package program;

import java.util.Locale;
import java.util.Scanner;

import entitys.Students;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Students[] rooms = new Students[10];

		System.out.print("Quantos quartos deseja alugar? ");
		int quantity = sc.nextInt();
		System.out.println("");

		for (int i = 1; i <= quantity; i++) {
			System.out.println("Quarto #" + i + ": ");
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Quarto? ");
			int quarto = sc.nextInt();
			rooms[quarto] = new Students(nome, email, quarto);
			System.out.println("");

			if (i == quantity) {
				if (rooms[quarto] != null) {
					System.out.println("Relatório: ");
					System.out.println(rooms[quarto]);
				}
			}
		}
	

		sc.close();
	}

}
