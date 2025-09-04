package br.com.empresa.turma.repository;

import br.com.empresa.turma.model.Turma;
import java.util.HashMap;
import java.util.Map;

public class TurmaRepository {
    // Simula um banco de dados em memória
    private static final Map<Integer, Turma> database = new HashMap<>();

    public void save(Turma turma) {
        System.out.println("Salvando turma no banco de dados...");
        database.put(turma.getId(), turma);
    }

    public Turma findById(int id) {
        System.out.println("Buscando turma no banco de dados...");
        return database.get(id);
    }

    public void update(Turma turma) {
        System.out.println("Atualizando turma no banco de dados...");
        if (database.containsKey(turma.getId())) {
            database.put(turma.getId(), turma);
        }
    }

    public void delete(int id) {
        System.out.println("Deletando turma no banco de dados...");
        database.remove(id);
    }
}