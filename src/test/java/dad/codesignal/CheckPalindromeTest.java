package dad.codesignal;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CheckPalindromeTest {
	private TheJourneyBegins tjb;

	@Before
	public void setup() {
		tjb = new TheJourneyBegins();
	}
	
	@Test
	public void Test1() {
		assertEquals(true, tjb.checkPalindrome("aabaa"));
	}
	@Test
	public void Test2() {
		assertEquals(false, tjb.checkPalindrome("abac"));
	}
	@Test
	public void Test3() {
		assertEquals(true, tjb.checkPalindrome("a"));
	}
	@Test
	public void Test4() {
		assertEquals(false, tjb.checkPalindrome("az"));
	}
	@Test
	public void Test5() {
		assertEquals(true, tjb.checkPalindrome("abacaba"));
	}
	@Test
	public void Test6() {
		assertEquals(true, tjb.checkPalindrome("z"));
	}
	@Test
	public void Test7() {
		assertEquals(false, tjb.checkPalindrome("aaabaaaa"));
	}
	@Test
	public void Test8() {
		assertEquals(false, tjb.checkPalindrome("zzzazzazz"));
	}
	@Test
	public void Test9() {
		assertEquals(true, tjb.checkPalindrome("hlbeeykoqqqqokyeeblh"));
	}
	@Test
	public void Test10() {
		assertEquals(true, tjb.checkPalindrome("hlbeeykoqqqokyeeblh"));
	}
}
