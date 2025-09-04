package br.com.empresa.main;

import br.com.empresa.turma.model.Aluno;
import br.com.empresa.turma.model.Turma;
import br.com.empresa.turma.repository.TurmaRepository;
import br.com.empresa.turma.view.TurmaView;

public class App {
    public static void main(String[] args) {
        // Instanciando as classes separadas
        Turma turmaA = new Turma(1, "Turma A - Engenharia de Software");
        TurmaRepository repositorio = new TurmaRepository();
        TurmaView view = new TurmaView();

        // Operações de negócio (classe Turma)
        turmaA.addAluno(new Aluno("Maria", 9.5));
        turmaA.addAluno(new Aluno("João", 7.0));
        turmaA.addAluno(new Aluno("Carlos", 8.2));

        // Persistência (classe TurmaRepository)
        repositorio.save(turmaA);

        // Exibição (classe TurmaView)
        view.imprimirDadosTurma(turmaA);
        view.imprimirListaDeAlunos(turmaA);
        view.imprimirMedia(turmaA.calcularMedia());

        System.out.println("\n--- Exemplo de busca e exibição ---");
        Turma turmaCarregada = repositorio.findById(1);
        if (turmaCarregada != null) {
            view.imprimirDadosTurma(turmaCarregada);
            view.imprimirMedia(turmaCarregada.calcularMedia());
        }
    }
}