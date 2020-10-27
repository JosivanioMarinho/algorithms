package entidades;

public class Cliente {

	private int numeroConta;
	private String nomeUsuario;
	private double valorDeposito;
	
	public Cliente(int numeroConta, String nomeUsuario) {
		this.numeroConta = numeroConta;
		this.nomeUsuario = nomeUsuario;
	}
	public Cliente(int numeroConta, String nomeUsuario, double depositarValor ) {
		this.numeroConta = numeroConta;
		this.nomeUsuario = nomeUsuario;
		deposito(depositarValor);
	}
	
	public int getNumeroConta() {
		return numeroConta;
	}
	
	public String getNomeUsuario() {
		return nomeUsuario;
	}
	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}
	
	public double getValorDeposito() {
		return valorDeposito;
	}
	
	public String toString() {
		return "Conta: " + numeroConta
				+ ", Usuário: " + nomeUsuario
				+ ", Valor de Depósito: $ " + valorDeposito;
	}
	
	public void deposito(double depositarValor) {
		valorDeposito = valorDeposito + depositarValor;
	}
	
	public void saque(double sacarValor) {
		valorDeposito = valorDeposito - ( sacarValor + 5);
	}
}
