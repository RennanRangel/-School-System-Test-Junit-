package Escola.Test;
import Escola.CadastroEstudantes;
import Escola.Estudante;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CadastroEstudantesTest {

    private CadastroEstudantes cadastro;
    private Estudante estudante1, estudante2, estudante3;

    @BeforeEach
    public void setUp() {
        cadastro = new CadastroEstudantes();
        estudante1 = new Estudante("Rennan", 20, "34553");
        estudante2 = new Estudante("Maria", 22, "67890");
        estudante3 = new Estudante("João", 19, "12345");

        cadastro.adicionarEstudante(estudante1);
        cadastro.adicionarEstudante(estudante2);
        cadastro.adicionarEstudante(estudante3);
    }

    @Test
    public void testConsultarPorNome() {
        Estudante resultado = cadastro.consultarPorNome("Maria");
        assertNotNull(resultado);
        assertEquals("Maria", resultado.getNome());
    }

    @Test
    public void testListarEstudantes() {
        assertEquals(3, cadastro.listarEstudantes().size());
    }

    @Test
    public void testExibirInformacoes() {
        String esperado = "Nome: Rennan, Idade: 20, Matrícula: 34553";
        assertEquals(esperado, estudante1.exibirInformacoes());
    }
}


