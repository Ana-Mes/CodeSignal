package dad.codesignal;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class ShapeAreaTest {
	
	private EdgeOfTheOcean eoto;
	
	@Before
	public void setup() {
		eoto = new EdgeOfTheOcean();
	}
	
	@Test
	public void Test1() {
		assertEquals(5, eoto.shapeArea(2));
	}
	@Test
	public void Test2() {
		assertEquals(13, eoto.shapeArea(3));
	}
	@Test
	public void Test3() {
		assertEquals(1, eoto.shapeArea(1));
	}
	@Test
	public void Test4() {
		assertEquals(41, eoto.shapeArea(5));
	}
	@Test
	public void Test5() {
		assertEquals(97986001, eoto.shapeArea(7000));
	}
	@Test
	public void Test6() {
		assertEquals(127984001, eoto.shapeArea(8000));
	}
	@Test
	public void Test7() {
		assertEquals(199940005, eoto.shapeArea(9999));
	}
	@Test
	public void Test8() {
		assertEquals(199900013, eoto.shapeArea(9998));
	}
	@Test
	public void Test9() {
		assertEquals(161946005, eoto.shapeArea(8999));
	}
	@Test
	public void Test10() {
		assertEquals(19801, eoto.shapeArea(100));
	}
}
