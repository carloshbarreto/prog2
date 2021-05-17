package bibliotecas;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class LeCharTeclado {
	public static void main(String[] args) {
		System.out.println("Digite uma �nica tecla: ");
		InputStream is = System.in; //Classe que sabe capturar byte de entrada
		InputStreamReader isr = new InputStreamReader(is);
		//ISR sabe receber um byte e transform�-lo em char
		
		char c;
		
		try {
			c = (char) isr.read();
			System.out.println("Voc� digitou a tecla: "+ c);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
