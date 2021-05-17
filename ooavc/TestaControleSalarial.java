package ooavc;

public class TestaControleSalarial {
	public static void main(String[] args) {
		
		ControleSalarial controle = new ControleSalarial();
		
		
		Gerente g1 = new Gerente();
		g1.setSalario(10000);
		System.out.println("Salario g1:"+g1.getSalario());
		controle.setTotalSalarios(g1);
		System.out.println("Total salarios contabilizado:"+controle.getTotalSalarios());
	}

}
