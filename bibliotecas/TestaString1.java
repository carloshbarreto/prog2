package bibliotecas;

public class TestaString1 {
	public static void main(String[] args) {
		String a = new String ("Java ADS na veia");
		String b = "Java ADS na veia";
		if(a == b) {
			System.out.println("a e b s�o iguais (testa o objeto)");
		} else {
			System.out.println("a e b s�o diferentes");
		}
		
		if(a.equals(b)) {
			System.out.println("a e b s�o iguais (testa o conte�do)");
		} else {
			System.out.println("a e b s�o diferentes");
		}
	}
	

}
