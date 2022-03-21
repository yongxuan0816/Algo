

public class HW04_4109064223_1 extends One_0k_rock
{
	public boolean[]  one0k (String[] str)
	{
		boolean[] A = new boolean[str.length];
		
		for (int i=0;i<str.length;i++)
		{
			int len = str[i].length();
			int n = Integer.parseInt(str[i],2); //change string to int, base 2
			
			if (len%2 != 0 || n != Math.pow(2,len/2)-1) //len is odd or n not equal to 2^n-1 is false
				A[i] = false;
			else 
				A[i] = true;
						
		}
		return A;
	}
	
}