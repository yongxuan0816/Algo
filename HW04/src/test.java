
public class test 
{

	public static void main(String[] str) 
	{
        String[] test = {"0011","00111","001101","1100","00001111","0010","00011","010111","1111","0000"};
        HW04_4109064223_3 t = new HW04_4109064223_3();
        long sT = System.nanoTime();
        boolean[] end =  t.one0k(test);
        long eT = System.nanoTime();
        for(int i=0;i<end.length;i++)
        {
        	System.out.printf(" '%b' ",end[i]);
        }
        System.out.println("\nTime: "+ (eT-sT) +"ns");
	}
        
}
