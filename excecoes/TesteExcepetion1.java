package excecoes;

public class TesteExcepetion1 {
	public static void main(String[] args) {
		System.out.println("In?cio do m?todo main");
		metodo1();
		System.out.println("Fim do m?todo main");
	}
	
	private static void metodo1() {
		System.out.println("In?cio do m?todo 1");
		metodo2();
		System.out.println("Fim do m?todo 1");
	}
	
	private static void metodo2() {
		System.out.println("In?cio do m?todo 2");
		//faz alguma coisa entro o in?cio e o fim do m?todo 2
		int array[];
		array = new int [10];
		
		try {
			for (int i = 0; i < 20; i++) {
				array[i] = i;
				System.out.println(i);
			
			} 
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Erro pego (catched): "+ e);			
		}
		
	//	for (int i = 0; i < array.length; i++) {
	//		array[i] = i;
		//	System.out.println(i);
//		}
		System.out.println("Fim do m?todo 2");
	}
	 
}

