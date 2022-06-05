package test.java.org.fpij.jitakyoei.model.beans;

import static org.junit.Assert.assertEquals;

import org.fpij.jitakyoei.model.beans.Rg;
import org.junit.Test;

public class RgTest {
	@Test
	public void numeroTamanhoTest() {
		// setup
	    Rg rg_teste = new Rg();
		String antes = rg_teste.getNumero();
		rg_teste.setNumero("15684265");
		
		// rg tem 9 números, não alterar caso não cumprir tamanho
		String depois = rg_teste.getNumero();
		assertEquals(antes, depois);
	}
}
