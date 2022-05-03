import static org.junit.Assert.*;

import org.junit.Test;

public class testeSoma {

	@Test
	public void test() {
		UnitTesting obj1 = new UnitTesting();
		int output_q = obj1.soma(2,2);
		//testa a saída 
		assertEquals(4,output_q);
	}
	@Test
	public void test2() {
		UnitTesting obj2 = new UnitTesting();
		int output_q = obj2.soma(-2,1);
		//testa a saída 
		assertEquals(-1,output_q);
	}
}
