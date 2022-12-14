package dad.codesignal;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class AdjacentElementsProductTest {

	private EdgeOfTheOcean eoto;

	@Before
	public void setup() {
		eoto = new EdgeOfTheOcean();
	}

	@Test
	public void Test1() {
		int inputArray[] = { 3, 6, -2, -5, 7, 3 };
		assertEquals(21, eoto.adjacentElementsProduct(inputArray));
	}

	@Test
	public void Test2() {
		int inputArray[] = { -1, -2 };

		assertEquals(2, eoto.adjacentElementsProduct(inputArray));
	}

	@Test
	public void Test3() {
		int inputArray[] = { 5, 1, 2, 3, 1, 4 };

		assertEquals(6, eoto.adjacentElementsProduct(inputArray));
	}

	@Test
	public void Test4() {
		int inputArray[] = { 1, 2, 3, 0 };

		assertEquals(6, eoto.adjacentElementsProduct(inputArray));
	}

	@Test
	public void Test5() {
		int inputArray[] = { 9, 5, 10, 2, 24, -1, -48 };

		assertEquals(50, eoto.adjacentElementsProduct(inputArray));
	}

	@Test
	public void Test6() {
		int inputArray[] = { 5, 6, -4, 2, 3, 2, -23 };

		assertEquals(30, eoto.adjacentElementsProduct(inputArray));
	}

	@Test
	public void Test7() {
		int inputArray[] = { 4, 1, 2, 3, 1, 5 };

		assertEquals(6, eoto.adjacentElementsProduct(inputArray));
	}

	@Test
	public void Test8() {
		int inputArray[] = { -23, 4, -3, 8, -12 };

		assertEquals(-12, eoto.adjacentElementsProduct(inputArray));
	}

	@Test
	public void Test9() {
		int inputArray[] = { 1, 0, 1, 0, 1000 };

		assertEquals(0, eoto.adjacentElementsProduct(inputArray));
	}
}
