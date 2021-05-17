package bibliotecas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class LeStringTeclado {
	public static void main(String[] args) {
		System.out.println("Digite uma mesnagem: ");
		InputStream is = System.in; //Classe que sabe capturar byte de entrada
		InputStreamReader isr = new InputStreamReader(is);
		//ISR sabe receber um byte e transform�-lo em char
		
		BufferedReader br = new BufferedReader(isr);
		//BR sabe receber varios char e armazen�-los num
		//buffer, transformando-os em String
		String s;
		
		try {
			//c = (char) isr.read();
			s = br.readLine();
			//System.out.println("Voc� digitou a tecla: "+ c);
			System.out.println("Voc� digitou a mensagem: "+ s);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
