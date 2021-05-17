package bibliotecas;

public class TestaString4 {
	public static void main(String[] args) {
		
		String a = "Java e a melhor UC";
		
		//testa substring
		String b = a.substring(4);
		System.out.println(b);
		
		
		//testa trim
		String c = a.trim();
		System.out.println(c);
		
		//testa indexOf
		int d = a.indexOf("melhor");
		System.out.println(d);
		
		//testa lastIndexOf
		int e = a.lastIndexOf("r");
		System.out.println(e);
		
		
	}

}
