package ooavc;

public class TestaConta3 {
	public static void main(String[] args) {
		Conta c1;
		c1 = new Conta();
		c1.limite = 100;
		
		Conta c2;
		c2 = c1;
		c2.limite = 200;
		 System.out.println(c1.limite);
		 System.out.println(c2.limite);
		
	}

}
