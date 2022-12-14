package dad.codesignal;

public class TheJourneyBegins {

	public int add(int a, int b) {
		return a + b;
	}

	public int centuryFromYear(int year) {
		String s = String.valueOf(year);

		int siglo;

		if (year < 100) {
			siglo = 1;
		} else if (s.contains("00") && year % 10 == 0) {
			siglo = (Math.round(year / 100));
		} else {
			siglo = (Math.round(year / 100)) + 1;
		}
		return siglo;
	}

	public boolean checkPalindrome(String word) {
		int i = 0, j = word.length() - 1;

		while (j >= 0 && i < word.length() - 1 && word.charAt(i) == word.charAt(j)) {
			i++;
			j--;
		}
		return word.charAt(i) == word.charAt(j);
	}
}
