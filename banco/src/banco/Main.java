package banco;

import java.util.Locale;
import java.util.Scanner;

import entidades.Cliente;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Cliente cliente = null;

		System.out.print("Digite o número da conta: ");
		int numeroConta = sc.nextInt();
		sc.nextLine();
		System.out.print("Digite seu nome: ");
		String nomeUsuario = sc.nextLine();
		System.out.print("Deseja depositar algum valor inicial? (S / N): ");
		char resposta = sc.next().charAt(0);
		if (resposta == 's') {
			System.out.print("Informe a quantia do depósito inicial: ");
			double valorDeposito = sc.nextDouble();
			cliente = new Cliente(numeroConta, nomeUsuario, valorDeposito);
		}
		else if(resposta == 'n') {
			cliente = new Cliente(numeroConta, nomeUsuario);
		}

		System.out.println();
		System.out.println("Dados da conta:");
		System.out.println(cliente);

		System.out.println();
		System.out.print("Digite o valor do depósito: ");
		double depositarValor = sc.nextDouble();
		cliente.deposito(depositarValor);
		System.out.println("Atualização dos dados: ");
		System.out.println(cliente);

		System.out.println();
		System.out.print("Digite o valor de saque: ");
		double sacarValor = sc.nextDouble();
		cliente.saque(sacarValor);
		System.out.println("Atualização dos dados: ");
		System.out.println(cliente);

		sc.close();
	}

}
