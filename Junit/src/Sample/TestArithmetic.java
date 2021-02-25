package Sample;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import unit.Arthmeticadd;

class TestArithmetic {
     Arthmeticadd ath=new Arthmeticadd();
	@Test
	void testAdd() {
		assertEquals(10,ath.add(5,5));
	}

}
