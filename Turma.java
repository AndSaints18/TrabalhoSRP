package br.com.empresa.turma.model;

import java.util.ArrayList;
import java.util.List;

public class Turma {
    private int id;
    private String nomeTurma;
    private List<Aluno> alunos;

    public Turma(int id, String nomeTurma) {
        this.id = id;
        this.nomeTurma = nomeTurma;
        this.alunos = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getNomeTurma() {
        return nomeTurma;
    }

    public void addAluno(Aluno aluno) {
        this.alunos.add(aluno);
    }

    public List<Aluno> getAlunos() {
        return new ArrayList<>(this.alunos); // Retorna uma cópia para evitar modificações externas
    }

    public double calcularMedia() {
        if (alunos.isEmpty()) {
            return 0.0;
        }
        double somaDasNotas = 0;
        for (Aluno aluno : alunos) {
            somaDasNotas += aluno.getNota();
        }
        return somaDasNotas / alunos.size();
    }
}