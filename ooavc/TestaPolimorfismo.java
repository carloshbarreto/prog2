package ooavc;

public class TestaPolimorfismo {
	public static void main(String[] args) {
//		Funcionario f1 = new Funcionario();
//		f1.setSalario(1000);
//		double salFunc = f1.getSalario();
//		System.out.println("O sal�rio do Funcion�rio f1 �: " + salFunc);
//		System.out.println("O bonus do Funcion�rio f1 �: " + f1.getBonus());
//		
		
		Gerente g1 = new Gerente();
		g1.setSalario(10000);
		System.out.println("O sal�rio do Gerente g1 �: " + g1.getSalario());
		System.out.println("O bonus do Gerente g1 �: " + g1.getBonus());
	}	

}
