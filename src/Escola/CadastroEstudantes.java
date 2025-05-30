package Escola;

import java.util.ArrayList;
import java.util.List;

public class CadastroEstudantes {
    private List<Estudante> estudantes;

    public CadastroEstudantes() {
        estudantes = new ArrayList<>();
    }

    public void adicionarEstudante(Estudante estudante) {
        estudantes.add(estudante);
    }

    public Estudante consultarPorNome(String nome) {
        for (Estudante estudante : estudantes) {
            if (estudante.getNome().equalsIgnoreCase(nome)) {
                return estudante;
            }
        }
        return null;
    }

    public List<Estudante> listarEstudantes() {
        return estudantes;
    }
}
