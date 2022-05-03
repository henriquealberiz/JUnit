import static org.junit.Assert.*;

import org.junit.Test;

public class testeDivisao {

	@Test
	public void test() {
		UnitTesting obj1 = new UnitTesting();
		int output_q = obj1.divisao(4,2);
		//testa a saída 
		assertEquals(2,output_q);
	}

}
