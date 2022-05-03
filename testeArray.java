import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
/*@author Henrique
 * Classe cria e testa o conteudo de um registro
 * prepara o ambiente e finaliza ambiente apos o teste
 * cria registro com 6 inteiros
 */

public class testeArray {
 private List<Integer> list;
	
	@Before
	public void setUp() {
		list = new ArrayList<>();
		list.add(3);
		list.add(1);
		list.add(4);
		list.add(1);
		list.add(5);
		list.add(9);
	}
	//limpa registro de inteiro após o teste

	@After
	public void clearList() {
		list.clear();
	}

	@Test
	public void testadaoslista(){
		list.remove(0); //1° elemento da lista
		assertEquals(5, list.size()); // valida tamanho
	}
	@Test
	public void outrotest(){
		assertEquals(6, list.size());
	}
}
