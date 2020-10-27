package estudante;

public class Aluno {

	public String nome;
	public double nota01;
	public double nota02;
	public double nota03;

	public double media() {
		
		if(nota01 <0 || nota01 >30){
			System.out.println("ERRO! o primeiro trimestre deve ser MAIOR OU IGUAL A ZERO e MENOR OU IGUAL A 30! ");
		}
		if(nota02 <0 || nota02 >35) {
			System.out.println("ERRO! o SEGUNDO trimestre deve ser MAIOR OU IGUAL A ZERO e MENOR OU IGUAL A 35! ");
		}
		if(nota03 <0 || nota03 >35) {
			System.out.println("ERRO! o TERCEIRO trimestre deve ser MAIOR OU IGUAL A ZERO e MENOR OU IGUAL A 35! ");
		}
		
		double notaFinal;
	    notaFinal = nota01 + nota02 + nota03;
	    
		if(notaFinal >60) {
			System.out.println(" Nota Final: " + notaFinal);
			System.out.println("APROVADO!");
		}else{
			System.out.println(" Nota Final: " + notaFinal);
			System.out.println("REPROVADO!");
			double restante = 60;
			restante = restante - notaFinal;
			System.out.printf("Faltam %.2f pontos para aprovação!", restante);
		}
		
		return notaFinal;
	}

}
