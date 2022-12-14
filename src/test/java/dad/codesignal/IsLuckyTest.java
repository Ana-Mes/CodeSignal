package dad.codesignal;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class IsLuckyTest {
	private SmoothSailing ss;

	@Before
	public void setup() {
		ss = new SmoothSailing();
	}
	
	@Test
	public void Test1() {
		assertTrue(ss.isLucky(1230));
	}
	@Test
	public void Test2() {
		assertFalse(ss.isLucky(239017));
	}
	@Test
	public void Test3() {
		assertTrue(ss.isLucky(134008));
	}
	@Test
	public void Test4() {
		assertFalse(ss.isLucky(10));
	}
	@Test
	public void Test5() {
		assertTrue(ss.isLucky(11));
	}
	@Test
	public void Test6() {
		assertTrue(ss.isLucky(1010));
	}
	@Test
	public void Test7() {
		assertFalse(ss.isLucky(261534));
	}
	@Test
	public void Test8() {
		assertFalse(ss.isLucky(100000));
	}
	@Test
	public void Test9() {
		assertTrue(ss.isLucky(999999));
	}
	@Test
	public void Test10() {
		assertTrue(ss.isLucky(123321));
	}
}
