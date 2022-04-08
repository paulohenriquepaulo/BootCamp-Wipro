package exercicioPOO.exercicio04;

public class Funcionario {

	private String nome, cpf;
	private double salario, bonus;
	
	public Funcionario(String nome, String cpf, double salario, double bonus) {
		this.nome = nome;
		this.cpf = cpf;
		this.salario = salario;
		this.bonus = bonus;
	}
	
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
	
	public double getSalario() {
		return salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public double getBonus() {
		return bonus;
	}
	
	public double bonus() {
		return this.salario * ((this.bonus/100)+1);
	}
}
