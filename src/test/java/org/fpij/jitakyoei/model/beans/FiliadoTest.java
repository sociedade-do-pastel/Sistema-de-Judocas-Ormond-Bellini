package test.java.org.fpij.jitakyoei.model.beans;

import static org.junit.Assert.assertEquals;

import org.fpij.jitakyoei.model.beans.Filiado;
import org.junit.Test;

public class FiliadoTest {
	@Test
	public void telefone1ComLetraTest() {
		// setup
		Filiado fili_teste = new Filiado();
		String antes = fili_teste.getTelefone1();
		fili_teste.setTelefone1("abcd");
		
		// set não deve guardar string com letra, mantendo o valor
		String depois = fili_teste.getTelefone1();
		assertEquals(antes, depois);
	}

	@Test
	public void telefone2ComLetraTest() {
		// setup
		Filiado fili_teste = new Filiado();
		String antes = fili_teste.getTelefone2();
		fili_teste.setTelefone2("abcd");
		
		// set não deve guardar string com letra, mantendo o valor
		String depois = fili_teste.getTelefone2();
		assertEquals(antes, depois);
	}

	@Test
	public void emailInvalidoTest() {
		// setup
		Filiado fili_teste = new Filiado();
		String antes = fili_teste.getEmail();
		fili_teste.setEmail("abcd123123");
		
		// deve ser um e-mail válido, não alterando caso não tenha ...@....com...
		String depois = fili_teste.getEmail();
		assertEquals(antes, depois);
	}

	@Test
	public void cpfComLetraTest() {
		// setup
		Filiado fili_teste = new Filiado();
		String antes = fili_teste.getCpf();
		fili_teste.setCpf("59db1v855f4");
		
		// cpf não contém letras, caso houver não deve ser alterado
		String depois = fili_teste.getCpf();
		assertEquals(antes, depois);
	}

	@Test
	public void cpfTamanhoTest() {
		// setup
		Filiado fili_teste = new Filiado();
		String antes = fili_teste.getCpf();
		fili_teste.setCpf("5978471559");
		
		// cpf contém 11 digitos, caso não houver não deve ser alterado
		String depois = fili_teste.getCpf();
		assertEquals(antes, depois);
	}

}
