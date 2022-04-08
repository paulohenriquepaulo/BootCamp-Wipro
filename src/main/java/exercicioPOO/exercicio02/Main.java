package exercicioPOO.exercicio02;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Aluno[] alunos = {
                new Aluno("00123", "Paulo Ferreira", 5.0, 1.0, 9.0),
                new Aluno("00124", "Maria Eduarda", 8.0, 7.0, 9.0)
        };

        System.out.println("=====================================" +
                "\n======== Alunos Matriculados ========" +
                "\n=====================================\n");

        for (Aluno aluno : alunos) {
            System.out.printf("Matricula: %s%n", aluno.getMatricula());
            System.out.printf("Aluno: %s%n", aluno.getNome());
            System.out.printf("Média: %1.2f%n", aluno.Media());
            if (aluno.Recuperacao()) {
                System.out.println("Foi Reprovado!\n");
                System.out.println("=====================================\n");
            } else {
                System.out.println("Foi Aprovado!\n");
                System.out.println("=====================================\n");
            }
        }
    }
}