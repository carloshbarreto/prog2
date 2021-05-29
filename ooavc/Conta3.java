package ooavc;

//Testado em TestaConta5
public class Conta3 {
	private static int contadorContas;
	int numero;
//	String nome;
	Cliente cliente;
	double saldo;
	double limite;
	
	
	public Conta3() {
		
	}
	
	

	public Conta3(int numero, String nome, double saldo, double limite){
		this.numero = numero;
		this.cliente = new Cliente();
		this.cliente.nome = nome;
		this.saldo = saldo;
		this.limite = limite;
		contadorContas++;		
	}
	
	public int getcontadorContas() {
		return Conta3.contadorContas;
	}
	
	boolean sacar (double valor) {
	//	double saldoAlterado = saldo - valor;
	//	saldo = saldoAlterado;
		if(valor > this.saldo + this.limite) {
			return false;
		} else {
			this.saldo = this.saldo - valor;
			return true;
		}
	}
	
	public int getNumero() {
		return numero;
	}
	
	public void depositar (double valor) {
		saldo = saldo + valor;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	
	

}
