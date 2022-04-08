package exercicioPOO.exercicio01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int botaoInformado;

		Scanner sc = new Scanner(System.in);
		ControleRemoto cr = new ControleRemoto();

		do {
			System.out.println("\n===================");
			System.out.println("Controle Remoto:");
			System.out.println("===================");
			System.out.println("Liga / Desliga  [0]");
			System.out.println("Aumentar volume [1]");
			System.out.println("Diminuir volume [2]");
			System.out.println("Aumentar canal  [3]");
			System.out.println("Diminuir canal  [4]");
			System.out.println("Status          [5]");
			System.out.println("Indicar canal   [6]");
			System.out.println("===================");
			System.out.print("Informe sua opção: ");

			while (true) {
				try {
					botaoInformado = Integer.parseInt(sc.next());
					
					if (!cr.isLigado() && botaoInformado != 0) {
						System.out.println("Por favor, ligue a Tv para continuar...");
						System.out.print("Informe sua opção: ");
					} else {
						break;
					}
				} catch (NumberFormatException e) {
					System.out.println("Opção inválida!");
					System.out.print("Informe sua opção: ");
				}
			}

			switch (botaoInformado) {
			case 0:
				cr.ligaDesligaTV();
				break;
			case 1:
				cr.aumentarVolume();
				break;
			case 2:
				cr.diminuirVolume();
				break;
			case 3:
				cr.aumentarCanal();
				break;
			case 4:
				cr.diminuirCanal();
				break;
			case 5:
				cr.infoTV();
				break;
			case 6:
				cr.trocarCanal();
				break;
			default:
				System.out.println("Opção inválida!");
				System.out.print("Informe sua opção: ");
			}
		} while (cr.isLigado());

		sc.close();
	}
}