package dad.codesignal;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class SortByHeight {
	private SmoothSailing ss;

	@Before
	public void setup() {
		ss = new SmoothSailing();
	}
	@Test
	public void Test1() {
		int inputArray[] = {-1, 150, 190, 170, -1, -1, 160, 180};
		int outputArray[] = {-1, 150, 160, 170, -1, -1, 180, 190};
		assertEquals(outputArray, ss.sortByHeight(inputArray));
	}

}
