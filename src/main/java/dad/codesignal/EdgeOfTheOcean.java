package dad.codesignal;

import java.util.ArrayList;

public class EdgeOfTheOcean {

	public int adjacentElementsProduct(int[] inputArray) {
		int i = 0;
		int mayor = inputArray[i] * inputArray[i + 1];

		for (i = 0; i < inputArray.length; i++) {
			if (i < inputArray.length - 1 && inputArray[i] * inputArray[i + 1] > mayor) {
				mayor = inputArray[i] * inputArray[i + 1];
			}
		}
		return mayor;
	}

	public int shapeArea(int n) {

		return n * n + (n - 1) * (n - 1);
	}

	public int makeArrayConsecutive2(int[] statues) {
		int n = 0, j, mayor = statues[0], menor = statues[0];

		for (int i = 1; i < statues.length; i++) {
			if (statues[i] > mayor) {
				mayor = statues[i];
			} else if (statues[i] < menor) {
				menor = statues[i];
			}
		}

		for (int num = menor; num < mayor - 1; num++) {
			j = 0;
			while (j < statues.length - 1 && num + 1 != statues[j]) {
				j++;
			}
			if (num != mayor && num + 1 != statues[j]) {
				n++;
			}
		}
		return n;
	}

	public boolean almostIncreasingSequence(int[] sequence) {
		boolean increase = true;
		int i = 1, erased = 0, num = sequence[0];
		if (sequence.length >= 3) {
			while (i < sequence.length && increase == true) {
				if (num < sequence[i] && erased <= 1) {
					increase = true;
					num = sequence[i];
				} else if (num >= sequence[i] && erased < 1) {
					increase = true;
					erased++;
					if (i == 1) {
						num = sequence[i];
					} else if (i < sequence.length - 1 && sequence[i] > sequence[i - 2]
							&& sequence[i] < sequence[i + 1]) {
						num = sequence[i];
					}
				} else {
					increase = false;
				}
				i++;
			}
		}
		return increase;
	}

	public int matrixElementsSum(int[][] matrix) {
		int num = 0;
		ArrayList<Integer> enchanted = new ArrayList<Integer>();

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] == 0) {
					enchanted.add(j);
				}
				if (matrix[i][j] != 0 && !enchanted.contains(j)) {
					num += matrix[i][j];
				}
			}
		}
		return num;
	}

}
