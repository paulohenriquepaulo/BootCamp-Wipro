package aulas;

import java.util.Scanner;

public class Exercicio02 {
    /*2. Faça um programa para receber o nome de um aluno e informar 2 notas, em seguida calcular
      a média do aluno e apresentar ao final a média calculada e a situação de Aprovação do aluno.
      (aprovado com média >= 6).*/
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = entrada.nextLine();
        System.out.print("Digite sua primeira nota: ");
        Integer notaUm = entrada.nextInt();
        System.out.print("Digite sua segunda nota: ");
        Integer notaDois = entrada.nextInt();
        entrada.close();

        Integer media = (notaUm + notaDois) / 2;

        if (media >= 6) {
            System.out.println(nome + " você foi aprovado!!");
        } else {
            System.out.println(nome + "você foi reprovado!!");
        }

        System.out.println("A sua média é " + media);
    }
}