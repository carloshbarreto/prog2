package ooavc;

public class TestaConta {
	public static void main(String[] args) {
		Conta c1 = new Conta();
		
		
		c1.numero = 001;
		c1.nome = "Mateus";
		c1.saldo = 1000.0;
		c1.limite = 100.0;
		
		System.out.println("Nro conta: "+ c1.numero);
		System.out.println("Titular: " + c1.nome);
		System.out.println("Saldo atual: "+ c1.saldo);
		System.out.println("Limite: "+ c1.limite);
		
		double valorSaque = 200;
		boolean resultado = c1.sacar(valorSaque);		
		if(resultado) {
			System.out.println("Voc� sacou R$"+ valorSaque+" e seu saldo atual �: "+c1.saldo);
		} else {
			System.out.println("Saque n�o autorizado! Valor acima do poss�vel!");
		}
		
		
	}
	
	

}
