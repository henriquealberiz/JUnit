import static org.junit.Assert.*;

import org.junit.Test;

public class testeSubtracao {

	@Test
	public void test() {
		UnitTesting obj1 = new UnitTesting();
		int output_q = obj1.subtracao(4,2);
		//testa a saída 
		assertEquals(2,output_q);
	}
	@Test
	public void test2() {
		UnitTesting obj2 = new UnitTesting();
		int output_q = obj2.subtracao(-4,-2);
		//testa a saída 
		assertEquals(-2,output_q);
	}

}
