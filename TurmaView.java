package br.com.empresa.turma.view;

import br.com.empresa.turma.model.Aluno;
import br.com.empresa.turma.model.Turma;

public class TurmaView {

    public void imprimirDadosTurma(Turma turma) {
        System.out.println("--- DADOS DA TURMA ---");
        System.out.println("ID: " + turma.getId());
        System.out.println("Nome: " + turma.getNomeTurma());
        System.out.println("----------------------");
    }

    public void imprimirListaDeAlunos(Turma turma) {
        System.out.println("--- ALUNOS DA TURMA ---");
        if (turma.getAlunos().isEmpty()) {
            System.out.println("Nenhum aluno cadastrado.");
        } else {
            for (Aluno aluno : turma.getAlunos()) {
                System.out.println("Nome: " + aluno.getNome() + " | Nota: " + aluno.getNota());
            }
        }
        System.out.println("-----------------------");
    }

    public void imprimirMedia(double media) {
        System.out.println("Média da turma: " + String.format("%.2f", media));
    }
}