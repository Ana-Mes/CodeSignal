package dad.codesignal;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class MatrixElementsSumTest {
	private EdgeOfTheOcean eoto;

	@Before
	public void setup() {
		eoto = new EdgeOfTheOcean();
	}

	@Test
	public void Test1() {
		int matrix[][] = { { 0, 1, 1, 2 }, { 0, 5, 0, 0 }, { 2, 0, 3, 3 } };
		assertEquals(9, eoto.matrixElementsSum(matrix));
	}

	@Test
	public void Test2() {
		int matrix[][] = { { 1, 1, 1, 0 }, { 0, 5, 0, 1 }, { 2, 1, 3, 10 } };
		assertEquals(9, eoto.matrixElementsSum(matrix));
	}

	@Test
	public void Test3() {
		int matrix[][] = { { 1, 1, 1 }, { 2, 2, 2 }, { 3, 3, 3 } };
		assertEquals(18, eoto.matrixElementsSum(matrix));
	}

	@Test
	public void Test4() {
		int matrix[][] = { { 0 } };
		assertEquals(0, eoto.matrixElementsSum(matrix));
	}

	@Test
	public void Test5() {
		int matrix[][] = { { 1, 0, 3 }, { 0, 2, 1 }, { 1, 2, 0 } };
		assertEquals(5, eoto.matrixElementsSum(matrix));
	}

	@Test
	public void Test6() {
		int matrix[][] = { { 1 }, { 5 }, { 0 }, { 2 } };
		assertEquals(6, eoto.matrixElementsSum(matrix));
	}

	@Test
	public void Test7() {
		int matrix[][] = { { 1, 2, 3, 4, 5 } };
		assertEquals(15, eoto.matrixElementsSum(matrix));
	}

	@Test
	public void Test8() {
		int matrix[][] = { { 2 }, { 5 }, { 10 } };
		assertEquals(17, eoto.matrixElementsSum(matrix));
	}

	@Test
	public void Test9() {
		int matrix[][] = { { 4, 0, 1 }, { 10, 7, 0 }, { 0, 0, 0 }, { 9, 1, 2 } };
		assertEquals(15, eoto.matrixElementsSum(matrix));
	}

	@Test
	public void Test10() {
		int matrix[][] = { { 1 } };
		assertEquals(1, eoto.matrixElementsSum(matrix));
	}
}
