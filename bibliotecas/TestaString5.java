package bibliotecas;

public class TestaString5 {
	public static void main(String[] args) {
		
		String a = "Java e a melhor UC";
		
		//testa isEmpty
		boolean b = a.isEmpty();
		System.out.println(b);
		
		//testa contains
		boolean c = a.contains("i");
		System.out.println(c);
		
		//testa replace
		String d = a.replace("UC", "Disciplina");
		System.out.println(d);
		
		
	}

}
