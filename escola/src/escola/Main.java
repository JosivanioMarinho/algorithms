package escola;

import java.util.Locale;
import java.util.Scanner;

import estudante.Aluno;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		Aluno aluno = new Aluno();
		System.out.print("Nome do aluno: ");
		aluno.nome = sc.nextLine();
		System.out.print("Primeira nota: ");
		aluno.nota01 = sc.nextDouble();
		System.out.print("Segunda nota: ");
		aluno.nota02 = sc.nextDouble();
		System.out.print("Tterceira nota: ");
		aluno.nota03 = sc.nextDouble();
		
		aluno.media();
		
		sc.close();
	}

}
