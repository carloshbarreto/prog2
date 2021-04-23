package ooavc;

public class Gerente extends Funcionario implements AcessoBancoInterno {
	int senha;
	public boolean verifica(int senha) {
		if(this.senha == senha) {
			System.out.println("Acesso autorizado");
			return true;
		}else {
			System.out.println("Acesso não autorizado");
			return false;
		}
	}
	
	//v3 do bonus: percent 15% fixo sobre o salario
	// somenre do gerente
//	double getBonus() {
//		return this.salario * 0.15;
//	}
	
	//v4 do bonus: percent de Funcionario comum
	// mais um valor fixo: por exemplo de $5000
	//para o Gerente, de $1000 para o Diretor, etc
//	double getBonus() {
//		//return this.salario *0.15 + 5000;
//		return super.getBonus() * 0.15 + 5000;
//		
//	}
	
	//Nova versão por causa da classe abstrata
	double getBonus() {
		return this.salario *0.15 + 5000;
		
		
	}
	

}
