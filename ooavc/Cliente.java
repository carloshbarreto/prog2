package ooavc;

public class Cliente implements AcessoBancoInterno {
	String nome;
	String sobrenome;
	String cpf;
	
	public boolean verifica(int senha) {
		return false;
	}

}
