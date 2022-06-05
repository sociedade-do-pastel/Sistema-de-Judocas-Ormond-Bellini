package test.java.org.fpij.jitakyoei.model.beans;

import static org.junit.Assert.assertEquals;

import org.fpij.jitakyoei.model.beans.Entidade;
import org.junit.Test;

public class EntidadeTest {
	@Test
	public void telefone1ComLetraTest() {
		// setup
		Entidade ent_teste = new Entidade();
		String antes = ent_teste.getTelefone1();
		ent_teste.setTelefone1("abcd");
		
		// set não deve guardar string com letra, mantendo o valor
		String depois = ent_teste.getTelefone1();
		assertEquals(antes, depois);
	}

	@Test
	public void telefone2ComLetraTest() {
		// setup
		Entidade ent_teste = new Entidade();
		String antes = ent_teste.getTelefone2();
		ent_teste.setTelefone2("abcd");
		
		// set não deve guardar string com letra, mantendo o valor
		String depois = ent_teste.getTelefone2();
		assertEquals(antes, depois);
	}

	@Test
	public void cnpjComLetraTest() {
		// setup
		Entidade ent_teste = new Entidade();
		String antes = ent_teste.getCnpj();
		ent_teste.setCnpj("46v8b1d378s561");
		
		// set não deve guardar string com letra, mantendo o valor
		String depois = ent_teste.getCnpj();
		assertEquals(antes, depois);
	}

	@Test
	public void cnpjTamanhoTest() {
		// setup
		Entidade ent_teste = new Entidade();
		String antes = ent_teste.getCnpj();
		ent_teste.setCnpj("46v8b1d378s561");
		
		// cnpj tem 14 letras. Caso não tiver, manter estado
		String depois = ent_teste.getCnpj();
		assertEquals(antes, depois);
	}
}
