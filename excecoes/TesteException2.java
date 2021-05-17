package excecoes;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TesteException2 {
	private static InputStreamReader conn;
	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		try {
			new FileReader("C:\\ArquivoDeTeste.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (@SuppressWarnings("hiding") IOException e) {
			e.printStackTrace();
		} finally {
			conn.close();
		}
	}

}
