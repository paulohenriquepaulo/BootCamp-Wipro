package exercicioPOO.exercicio04;

import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Funcionario[] funcionarios = { 
				new Funcionario("Carlos Eduardo", "12345678900", 1000.00, 5.5),
				new Funcionario("Luana Oliveira", "98765432100", 2000.00, 10) };



		System.out.println("=====================================" +
				"\n============ Funcionários ===========" +
				"\n=====================================\n");

		for (Funcionario funcionario : funcionarios) {
			System.out.printf("Nome: %s%n", funcionario.getNome());
			System.out.printf("CPF: %s%n", funcionario.getCpf());
			System.out.printf("Salário: %1.2f%n", funcionario.getSalario());
			System.out.printf("Salário com Bônus de %1.2f%%: %1.2f%n%n", funcionario.getBonus(),funcionario.bonus());
			System.out.println("=====================================");
		}
	}
}