package ooavc;

public class TestaPolimorfismo2 {
	public static void main(String[] args) {
		Gerente g2 = new Gerente();
		g2.setSalario(10000);
		System.out.println("Salario do gerente g2 e: "+ g2.getSalario());
		System.out.println("O bonus do gernete g2 e: "+ g2.getBonus());
	}

}
