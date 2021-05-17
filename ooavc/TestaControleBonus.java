package ooavc;

public class TestaControleBonus {
	public static void main(String[] args) {
		
		ControleBonus controle = new ControleBonus();
		
		Gerente g1 = new Gerente();
		g1.setSalario(10000);
		controle.setTotalBonus(g1);
		System.out.println("Bonus acumulado: "+ controle.getTotalBonus());
		
		
	}
	
	

}
