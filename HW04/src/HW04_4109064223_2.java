
public class HW04_4109064223_2 extends One_0k_rock
{
	public boolean[]  one0k (String[] str)
	{
		boolean[] A = new boolean[str.length];
		int len,count,j;
		
		for (int i=0;i<str.length;i++)
		{
			len = str[i].length();
			count=0;
			j=len-1;
			
			while(j>len/2-1 && str[i].charAt(j) != '0')
			{
					j--;
					count++;
			}
			
			if (len%2 != 0 || count != len/2)  A[i] = false;
			else  A[i] = true;
						
		}
		return A;
	}
	
}