package march17.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class TestCalculation {
	Calculation c;
	@Test
	void test2()
	{
		assertEquals(0, c.add(10, -2));
		System.out.println("Test2");
	}
	@Test
	void test3()
	{
		assertTrue(c.nameTest("Ansh"));
		System.out.println("test3");
	}
	@Test
	void test4()
	{
		assertTrue(c.palindrome("sus"));
		System.out.println("Test4");
	}
	@ParameterizedTest
	@ValueSource(strings = {"madam", "radar"} )
	void test5(String s1)
	{
		assertTrue(c.palindrome(s1));
		System.out.println("Test5");
	}
	@AfterEach
	void test6()
	{
		System.out.println("After each");
		c = null;
	}
	@BeforeEach
	void test7()
	{
		c = new Calculation();
		System.out.println("Before each");
	}
}
