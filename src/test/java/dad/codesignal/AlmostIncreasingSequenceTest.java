package dad.codesignal;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class AlmostIncreasingSequenceTest {
	private EdgeOfTheOcean eoto;

	@Before
	public void setup() {
		eoto = new EdgeOfTheOcean();
	}

	@Test
	public void Test1() {
		int inputArray[] = { 1, 3, 2, 1 };
		assertEquals(false, eoto.almostIncreasingSequence(inputArray));
	}

	@Test
	public void Test2() {
		int inputArray[] = { 1, 3, 2 };
		assertEquals(true, eoto.almostIncreasingSequence(inputArray));
	}

	@Test
	public void Test3() {
		int inputArray[] = { 1, 2, 1, 2 };
		assertEquals(false, eoto.almostIncreasingSequence(inputArray));
	}

	@Test
	public void Test4() {
		int inputArray[] = { 3, 6, 5, 8, 10, 20, 15 };
		assertEquals(false, eoto.almostIncreasingSequence(inputArray));
	}

	@Test
	public void Test5() {
		int inputArray[] = { 1, 1, 2, 3, 4, 4 };
		assertEquals(false, eoto.almostIncreasingSequence(inputArray));
	}

	@Test
	public void Test6() {
		int inputArray[] = { 1, 4, 10, 4, 2 };
		assertEquals(false, eoto.almostIncreasingSequence(inputArray));
	}

	@Test
	public void Test7() {
		int inputArray[] = { 10, 1, 2, 3, 4, 5 };
		assertEquals(true, eoto.almostIncreasingSequence(inputArray));
	}

	@Test
	public void Test8() {
		int inputArray[] = { 1, 1, 1, 2, 3 };
		assertEquals(false, eoto.almostIncreasingSequence(inputArray));
	}

	@Test
	public void Test9() {
		int inputArray[] = { 0, -2, 5, 6 };
		assertEquals(true, eoto.almostIncreasingSequence(inputArray));
	}

	@Test
	public void Test10() {
		int inputArray[] = { 1, 2, 3, 4, 5, 3, 5, 6 };
		assertEquals(false, eoto.almostIncreasingSequence(inputArray));
	}

	public void Test11() {
		int inputArray[] = { 40, 50, 60, 10, 20, 30 };
		assertEquals(false, eoto.almostIncreasingSequence(inputArray));
	}

	@Test
	public void Test12() {
		int inputArray[] = { 1, 1 };
		assertEquals(true, eoto.almostIncreasingSequence(inputArray));
	}

	@Test
	public void Test13() {
		int inputArray[] = { 1, 2, 5, 3, 5 };
		assertEquals(true, eoto.almostIncreasingSequence(inputArray));
	}

	@Test
	public void Test14() {
		int inputArray[] = { 1, 2, 5, 5, 5 };
		assertEquals(false, eoto.almostIncreasingSequence(inputArray));
	}

	@Test
	public void Test15() {
		int inputArray[] = { 10, 1, 2, 3, 4, 5, 6, 1 };
		assertEquals(false, eoto.almostIncreasingSequence(inputArray));
	}

	@Test
	public void Test16() {
		int inputArray[] = { 1, 2, 3, 4, 3, 6 };
		assertEquals(true, eoto.almostIncreasingSequence(inputArray));
	}

	@Test
	public void Test17() {
		int inputArray[] = { 1, 2, 3, 4, 99, 5, 6 };
		assertEquals(true, eoto.almostIncreasingSequence(inputArray));
	}

	@Test
	public void Test18() {
		int inputArray[] = { 123, -17, -5, 1, 2, 3, 12, 43, 45 };
		assertEquals(true, eoto.almostIncreasingSequence(inputArray));
	}

	@Test
	public void Test19() {
		int inputArray[] = { 3, 5, 67, 98, 3 };
		assertEquals(true, eoto.almostIncreasingSequence(inputArray));
	}

	@Test
	public void Test20() {
		int inputArray[] = { 1, 1, 1 };
		assertEquals(false, eoto.almostIncreasingSequence(inputArray));
	}
}
