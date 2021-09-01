package gradleproject;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SumNumberTest {
	private final SumNumbers obj = new SumNumbers();

	@Test
	void testSum() {
		assertEquals(5, obj.sum(2, 3));
	}
	@Test
	void testSumNegative() {
		assertEquals(7, obj.sum(2, 3));
	}

}
