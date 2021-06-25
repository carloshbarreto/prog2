package viewtestes;

import java.sql.SQLException;

import model.Contato;
import regrasdenegocio_dao.ContatoDao;

public class TesteDaoInsere {
	public static void main(String[] args) {		
				
		
		
		try {
			Contato contato = new Contato();
			contato.setNome("Maria");
			contato.setEmail("maria@gmail.com");
			contato.setEndereco("Av Paulista 500");
			
			
			ContatoDao dao = new ContatoDao();
			dao.adiciona(contato);
			
			System.out.println("Contato gravado com sucesso!");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
