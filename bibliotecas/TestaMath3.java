package bibliotecas;

public class TestaMath3 {
	public static void main(String[] args) {
		double d1 = 30;
		
		//testa Math.sin
		System.out.println("Teste Math.sin");
		System.out.println("Valor inicial: " +d1);
		double d2 = Math.sin(d1);
		System.out.println(d2);
		
		//testa Math.toDegrees
		System.out.println("Teste Math.toDegrees");
		System.out.println("Valor inicial: " +d1);
		double d3 = Math.toDegrees(d1);
		System.out.println(d3);
		
		//testa Math.toRadians
		System.out.println("Teste Math.toRadians");
		System.out.println("Valor inicial: " +d1);
		double d4 = Math.toRadians(d1);
		System.out.println(d4);
	}

}
