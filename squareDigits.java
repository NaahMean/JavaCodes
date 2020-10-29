public class SquareDigit {
	public int squareDigits(int n) {
		int temp = n;
		int count = 0;
		int digits = 0;
		String sqString = "";
		int sqDigit = 0;

	// store each squres as elements of array
	// find the size of array
	while (n>O)
	 {
		n = n/10;
		count++;
	 }

	String[] strArray = new String[count];
	int count1 = 0;

	while(temp>0)
	{
		digit = (temp % 10);
		temp = temp/10;
		strArray[count1] = Integer.toString(digit*digit);
		sqString = sqString + strArray[count1];
		count1++;
	}
	
	sqDigit = Integer.parseInt(sqString);  // convert the string back to integers 
	return sqDigit;
	}
}

