package dad.codesignal;

public class SmoothSailing {

	public String[] allLongestStrings(String[] inputArray) {
		int longest = 0, j = 0, cont = 0;

		for (int i = 0; i < inputArray.length; i++) {
			if (inputArray[i].length() > longest) {
				longest = inputArray[i].length();
				cont = 0;
			}
			if (inputArray[i].length() == longest) {
				cont++;
			}
		}
		String[] array = new String[cont];
		for (int i = 0; i < inputArray.length; i++) {
			if (inputArray[i].length() == longest) {
				array[j] = inputArray[i];
				j++;
			}
		}
		return array;
	}

	public int commonCharacterCount(String s1, String s2) {
		int n = 0, j = 0;

		for (int i = 0; i < s2.length(); i++) {

			if (s1.contains(s2.charAt(i) + "")) {
				n++;
				j = 0;
				while (s1.charAt(j) != s2.charAt(i)) {
					j++;
				}
				if (j < s1.length() && s1.charAt(j) == s2.charAt(i)) {
					s1 = s1.substring(0, j) + s1.substring(j + 1);
				}
			}
		}
		return n;
	}
	
	public boolean isLucky(int n) {
		String s = ""+n, primeraParte, segundaParte;
		int sum1 = 0, sum2 = 0;
		int midTam = s.length()/2;
		primeraParte = s.substring(0,midTam);
		segundaParte = s.substring(midTam);
		
		for (int i = 0; i < midTam; i++) {
			sum1 +=  primeraParte.charAt(i); 
			sum2 +=  segundaParte.charAt(i); 	
		}
		
		return sum1 == sum2;
	}
	
	public int[] sortByHeight(int[] a) {
		int[] arrayOrdenado = a;
		int j = 0;
		
		for (int i = 0; i < a.length -1; i++) {
			if(a[i] == -1) {
				arrayOrdenado[i] = a[i];
			}else {
				while(j < a.length-1 && a[j] < arrayOrdenado[i+1]) {
					j++;
				}
			}
		}
		
		return arrayOrdenado;
	}
}
