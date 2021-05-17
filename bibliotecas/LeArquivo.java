package bibliotecas;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class LeArquivo {
	public static void main(String[] args) {
				
		try {
			InputStream is = new FileInputStream("teste2.txt"); //Classe que sabe capturar byte de entrada
			InputStreamReader isr = new InputStreamReader(is);
			//ISR sabe receber um byte e transformá-lo em char//ISR sabe receber um byte e transformá-lo em char			
			BufferedReader br = new BufferedReader(isr);
			//BR sabe receber varios char e armazená-los num
			//buffer, transformando-os em String
			String s;
			//c = (char) isr.read();
			s = br.readLine();
			//System.out.println("Você digitou a tecla: "+ c);
			System.out.println(s);
			while(s != null) {
				System.out.println(s);
				s = br.readLine();
			}
			br.close();
			isr.close();
			is.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
