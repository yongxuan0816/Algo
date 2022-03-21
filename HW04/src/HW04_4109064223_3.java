
public class HW04_4109064223_3 extends One_0k_rock
{
	public boolean[]  one0k (String[] str)
	{
		boolean[] A = new boolean[str.length];
		int len,count,j;
		
		for (int i=0;i<str.length;i++)
		{
			len = str[i].length();
			count=0;
			j=0;
			
			do
			{
				if (len%2!=0 || str[i].charAt(j) != '0' || str[i].charAt(len-1-j) != '1')	break;
				else
				{
					j++;
					count++;
				}
				
			}while(j<len/2);
			
			if (count != len/2)  A[i] = false;
			else  A[i] = true;
						
		}
		return A;
	}
	
}