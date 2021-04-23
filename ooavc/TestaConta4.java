package ooavc;

public class TestaConta4 {
	public static void main(String[] args) {
		Conta c1 = new Conta();
		c1.numero = 001;
		c1.nome = "Carlos";
		
		Conta c2 = new Conta();
		c2.numero = 001;
		c2.nome = "Carlos";
		
		if(c1 == c2) {
			System.out.println("As contas são iguais");
		}else {
			System.out.println("As contas são diferentes");
		}
	}

}
