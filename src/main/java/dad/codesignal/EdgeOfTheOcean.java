package dad.codesignal;

public class EdgeOfTheOcean {
	
	public int adjacentElementsProduct(int[] inputArray) {
		int i = 0;
		int mayor= inputArray[i] * inputArray[i+1];
		
		for (i = 0; i < inputArray.length; i++) {
			if(i < inputArray.length-1 && inputArray[i] * inputArray[i+1]> mayor) {
				mayor = inputArray[i] * inputArray[i+1];
			}
		}
		return mayor;
	}
	
	public int shapeArea (int n) {

		return n*n + (n-1)*(n-1);
	}
}
