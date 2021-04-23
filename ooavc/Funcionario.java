package ooavc;

public abstract class Funcionario {
	protected String nome;
	protected String cpf;
	protected String departamento;
	protected String dataAdmissao;
	protected double salario;
	protected String status;
	
// V1 Bonus: valor fixo	
//	void bonificacao(double bonus) {
//		salario += bonus;
//	}
	
// V2 do Bonus: percent 5% fixo sobre o salario
//	double getBonus() {
//		return this.salario * 0.05;
//		
//	}
	
	//V3 do Bonus abstrato:
	abstract double getBonus();
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public String getDataAdmissao() {
		return dataAdmissao;
	}

	public void setDataAdmissao(String dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	public void verifica();
	
	
	
	

}
