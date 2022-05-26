package test.java.org.fpij.jitakyoei.model.beans;

import static org.junit.Assert.assertEquals;

import org.fpij.jitakyoei.model.beans.Aluno;
import org.fpij.jitakyoei.model.beans.Filiado;
import org.junit.Test;


public class AlunoTest {

    @Test
    public void hashNaoNuloTest() {

        // setup inicial
        Aluno aluno_teste = new Aluno();
        Filiado filiado_teste = new Filiado();
        filiado_teste.setId(1234567L);
        aluno_teste.setFiliado(filiado_teste);

        // (29 * 7) + 1234567 deve resultar em 1234770
        assertEquals(aluno_teste.hashCode(), 1234770);
    }

    @Test
    public void hashNuloTest() {

        // setup inicial
        Aluno aluno_teste = new Aluno();
        Filiado filiado_teste = new Filiado();
        aluno_teste.setFiliado(filiado_teste);

        // (29 * 7) + 0 deve resultar em 203
        assertEquals(aluno_teste.hashCode(), 203);
    }
}
