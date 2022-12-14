package dad.codesignal;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class MakeArrayConsecutive2Test {
	private EdgeOfTheOcean eoto;

	@Before
	public void setup() {
		eoto = new EdgeOfTheOcean();
	}

	@Test
	public void Test1() {
		int[] statues = { 6, 2, 3, 8 };
		assertEquals(3, eoto.makeArrayConsecutive2(statues));
	}

	@Test
	public void Test2() {
		int[] statues = { 0, 3 };
		assertEquals(2, eoto.makeArrayConsecutive2(statues));
	}

	@Test
	public void Test3() {
		int[] statues = { 5, 4, 6 };
		assertEquals(0, eoto.makeArrayConsecutive2(statues));
	}

	@Test
	public void Test4() {
		int[] statues = { 6, 3 };
		assertEquals(2, eoto.makeArrayConsecutive2(statues));
	}
}
