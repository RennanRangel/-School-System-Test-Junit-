package Escola;

public class Estudante {
    private String nome;
    private int idade;
    private String matricula;

    public Estudante(String nome, int idade, String matricula) {
        this.nome = nome;
        this.idade = idade;
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public String exibirInformacoes() {
        return "Nome: " + nome + ", Idade: " + idade + ", Matrícula: " + matricula;
    }
}
