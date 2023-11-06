
// johnny pedicone
public class problem0626
{

	public static void main(String[] args) 
	{
		
		int numberOfPrimesFound = 0;
		int i = 0;
		while(numberOfPrimesFound < 100) 
		{
			
			if(isPrime(i) && isPalindrome(i)) 
			{
				System.out.println(i);
				numberOfPrimesFound++;
			}
			
			i++;
		}
	
	}
	
	static boolean isPrime(int numberToCheck) 
	{
		
		for(int j = 2; j < numberToCheck / 2; j++)
		{
			if(numberToCheck % j == 0)
			{
				return false;
			}
		}
		return true;
	}
	
	static boolean isPalindrome(int numberToCheck) 
	{
		int remainder = 0;
		int sum = 0;
		int temp = numberToCheck;
		while(numberToCheck > 0)
		{
			remainder = numberToCheck%10;
			sum=(sum*10)+remainder;
			numberToCheck=numberToCheck/10;
		}
		if(temp != sum) //compares the number to the number reversed; if it isnt the same it returns false
		{
			return false;
		}
		
		
		return true; // the number is a palindrome
	}

}
