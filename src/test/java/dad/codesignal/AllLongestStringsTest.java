package dad.codesignal;

import static org.junit.Assert.assertArrayEquals;
import org.junit.Before;
import org.junit.Test;

public class AllLongestStringsTest {
	private SmoothSailing ss;

	@Before
	public void setup() {
		ss = new SmoothSailing();
	}

	@Test
	public void Test1() {
		String inputArray[] = { "aba", "aa", "ad", "vcd", "aba" };
		String expectedOutptut[] = { "aba", "vcd", "aba" };
		assertArrayEquals(expectedOutptut, ss.allLongestStrings(inputArray));
	}

	@Test
	public void Test2() {
		String inputArray[] = { "aa" };
		String expectedOutptut[] = { "aa" };
		assertArrayEquals(expectedOutptut, ss.allLongestStrings(inputArray));
	}

	@Test
	public void Test3() {
		String inputArray[] = { "abc", "eeee", "abcd", "dcd" };
		String expectedOutptut[] = { "eeee", "abcd" };
		assertArrayEquals(expectedOutptut, ss.allLongestStrings(inputArray));
	}

	@Test
	public void Test4() {
		String inputArray[] = { "a", "abc", "cbd", "zzzzzz", "a", "abcdef", "asasa", "aaaaaa" };
		String expectedOutptut[] = { "zzzzzz", "abcdef", "aaaaaa" };
		assertArrayEquals(expectedOutptut, ss.allLongestStrings(inputArray));
	}

	@Test
	public void Test5() {
		String inputArray[] = { "enyky", "benyky", "yely", "varennyky" };
		String expectedOutptut[] = { "varennyky" };
		assertArrayEquals(expectedOutptut, ss.allLongestStrings(inputArray));
	}

	@Test
	public void Test6() {
		String inputArray[] = { "abacaba", "abacab", "abac", "xxxxxx" };
		String expectedOutptut[] = { "abacaba" };
		assertArrayEquals(expectedOutptut, ss.allLongestStrings(inputArray));
	}

	@Test
	public void Test7() {
		String inputArray[] = { "young", "yooooooung", "hot", "or", "not", "come", "on", "fire", "water",
				"watermelon" };
		String expectedOutptut[] = { "yooooooung", "watermelon" };
		assertArrayEquals(expectedOutptut, ss.allLongestStrings(inputArray));
	}

	@Test
	public void Test8() {
		String inputArray[] = { "onsfnib", "aokbcwthc", "jrfcw" };
		String expectedOutptut[] = { "aokbcwthc" };
		assertArrayEquals(expectedOutptut, ss.allLongestStrings(inputArray));
	}

	@Test
	public void Test9() {
		String inputArray[] = { "lbgwyqkry" };
		String expectedOutptut[] = { "lbgwyqkry" };
		assertArrayEquals(expectedOutptut, ss.allLongestStrings(inputArray));
	}

	@Test
	public void Test10() {
		String inputArray[] = { "i" };
		String expectedOutptut[] = { "i" };
		assertArrayEquals(expectedOutptut, ss.allLongestStrings(inputArray));
	}
}
