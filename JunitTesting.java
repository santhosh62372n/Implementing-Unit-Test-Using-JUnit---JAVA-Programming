package testing;

public class JunitTesting 
{
	public int square(int x)
	{
		return x*x;
	}
	
	public double divide(int a, int b)
	{
		if (b == 0)
		{
	        throw new ArithmeticException("/ by zero");
	    }
		return (double)a / (double)b;
	}
	
	public int count(String word)
	{
		int count = 0;
		
		for(int i = 0; i < word.length(); i++)
		{
			if(word.charAt(i) == 'a' || word.charAt(i) == 'A')
			{
				count++;
			}
		}
		
		return count;
	}

}
