package dad.codesignal;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CommonCharacterCountTest {
	private SmoothSailing ss;

	@Before
	public void setup() {
		ss = new SmoothSailing();
	}

	@Test
	public void Test1() {
		String s1 = "aabcc";
		String s2 = "adcaa";
		assertEquals(3, ss.commonCharacterCount(s1, s2));
	}

	@Test
	public void Test2() {
		String s1 = "zzzz";
		String s2 = "zzzzzzz";
		assertEquals(4, ss.commonCharacterCount(s1, s2));
	}

	@Test
	public void Test3() {
		String s1 = "abca";
		String s2 = "xyzbac";
		assertEquals(3, ss.commonCharacterCount(s1, s2));
	}

	@Test
	public void Test4() {
		String s1 = "a";
		String s2 = "b";
		assertEquals(0, ss.commonCharacterCount(s1, s2));
	}

	@Test
	public void Test5() {
		String s1 = "a";
		String s2 = "aaa";
		assertEquals(1, ss.commonCharacterCount(s1, s2));
	}

	@Test
	public void Test6() {
		String s1 = "aaaabaaaac";
		String s2 = "aabanamac";
		assertEquals(7, ss.commonCharacterCount(s1, s2));
	}

	@Test
	public void Test7() {
		String s1 = "annn";
		String s2 = "nnna";
		assertEquals(4, ss.commonCharacterCount(s1, s2));
	}

	@Test
	public void Test8() {
		String s1 = "cccccccccb";
		String s2 = "ccccccccca";
		assertEquals(9, ss.commonCharacterCount(s1, s2));
	}

	@Test
	public void Test9() {
		String s1 = "acccccccccb";
		String s2 = "cccccccccba";
		assertEquals(11, ss.commonCharacterCount(s1, s2));
	}

	@Test
	public void Test10() {
		String s1 = "a";
		String s2 = "aaaaaaaaaaa";
		assertEquals(1, ss.commonCharacterCount(s1, s2));
	}
}
