package ooavc;

public class TestaPolimorfismo {
	public static void main(String[] args) {
//		Funcionario f1 = new Funcionario();
//		f1.setSalario(1000);
//		double salFunc = f1.getSalario();
//		System.out.println("O salário do Funcionário f1 é: " + salFunc);
//		System.out.println("O bonus do Funcionário f1 é: " + f1.getBonus());
//		
		
		Gerente g1 = new Gerente();
		g1.setSalario(10000);
		System.out.println("O salário do Gerente g1 é: " + g1.getSalario());
		System.out.println("O bonus do Gerente g1 é: " + g1.getBonus());
	}	

}
