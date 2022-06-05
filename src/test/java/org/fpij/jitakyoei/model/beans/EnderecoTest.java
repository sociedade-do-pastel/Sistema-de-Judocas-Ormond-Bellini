package test.java.org.fpij.jitakyoei.model.beans;

import static org.junit.Assert.assertEquals;

import org.fpij.jitakyoei.model.beans.Endereco;
import org.junit.Test;

public class EnderecoTest {
	@Test
	public void numeroComLetraTest() {
		// setup
		Endereco end_teste = new Endereco();
		String antes = end_teste.getNumero();
		end_teste.setNumero("abcd");
		
		// numero não deve haver letra, caso houver não permitir alteração
		String depois = end_teste.getNumero();
		assertEquals(antes, depois);
	}

	@Test
	public void cepComLetraTest() {
		// setup
		Endereco end_teste = new Endereco();
		String antes = end_teste.getCep();
		end_teste.setCep("abcdefgh");
		
		// cep não possui letra, caso houver, não permitir alteração
		String depois = end_teste.getCep();
		assertEquals(antes, depois);
	}

	@Test
	public void cepTamanhoTest() {
		// setup
		Endereco end_teste = new Endereco();
		String antes = end_teste.getCep();
		end_teste.setCep("0856921");
		
		// cep tem 8 digitos, caso não houver, não permitir alteração
		String depois = end_teste.getCep();
		assertEquals(antes, depois);
	}
}
