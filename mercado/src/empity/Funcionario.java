package empity;

public class Funcionario {
	
	public String nome;
	public double salarioBruto;
	public double impostos;
	
	public String toString() {
		return  nome
				+ ", $ "
				+ String.format("%.2f", salarioBruto);
	}
	
	public double salarioLiquido() {
		return salarioBruto - impostos;
		
	}
	
	public void porcentagem(double acrecimo) {
		salarioBruto = salarioBruto *(acrecimo / 100) + salarioLiquido();
		
	}

}
