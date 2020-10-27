package mercado;

import java.util.Locale;
import java.util.Scanner;

import empity.Funcionario;

public class main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Funcionario funcionario = new Funcionario();
		
		System.out.println("Digite os dados do funcionário: ");
		System.out.print("Nome: ");
		funcionario.nome = sc.nextLine();
		System.out.print("Salário Bruto: ");
		funcionario.salarioBruto = sc.nextDouble();
		System.out.print("Imposto: ");
		funcionario.impostos = sc.nextDouble();
		
		System.out.println();
		System.out.println("Funcionario :" + funcionario.nome + ", $ " + funcionario.salarioLiquido());
		
		System.out.println();
		System.out.print("Digite a porcentagem de acrecimo: ");
		double acrecimo;
		acrecimo = sc.nextDouble();
		funcionario.porcentagem(acrecimo);
		System.out.println();
		
		System.out.println("Atualização de dados: " + funcionario.nome + ", $ " + funcionario);
		
		sc.close();
	}

}
