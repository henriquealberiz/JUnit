import static org.junit.Assert.*;

import org.junit.Test;

public class testeMultiplicacao {

	@Test
	public void test() {
		UnitTesting obj1 = new UnitTesting();
		int output_q = obj1.multiplicacao(2,2);
		//testa a saída 
		assertEquals(4,output_q);
	}

}
